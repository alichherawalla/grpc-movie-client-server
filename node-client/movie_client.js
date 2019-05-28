var movie = require('./grpc-movie-client/movie_pb');
var services = require('./grpc-movie-client/movie_grpc_pb');

var async = require('async');
var fs = require('fs');
var parseArgs = require('minimist');
var path = require('path');
var uuid = require('uuid/v1');
var _ = require('lodash');
var grpc = require('grpc');
const inquirer = require('inquirer');

var client = new services.MovieLibraryClient('localhost:8980', grpc.credentials.createInsecure());

const CLIENT_ID = uuid();

const questions = [
  {
    type: 'input',
    name: 'genre',
    message: "Enter the genre?",
  },
  {
    type: 'input',
    name: 'movieName',
    message: "Enter the movie name?",
  }
];


function listMessages(callback) {
  const currentId = 0;
  const maxPageSize = 100;
  const genre = 'HORROR';
  const listMoviesRequest = new movie.ListMoviesRequest();
  listMoviesRequest.setClientId(CLIENT_ID);
  listMoviesRequest.setCurrentId(currentId);
  listMoviesRequest.setMaxPageSize(maxPageSize);
  listMoviesRequest.setGenre(genre);
  const movieStream = client.listMovies(listMoviesRequest);
  movieStream.on('data', (movie) => {
    printMessage(movie)
  });
  movieStream.on('end', (evt) => {
    console.log({evt})
  });
};

function getAndUpdateMovieLibrary(callback) {
  const movieStream = client.getAndUpdateMovieLibrary();
  movieStream.on('data', (movie) => {
    printMessage(movie)
  });

  movieStream.on('end', (evt) => {
    console.log({evt})
  });
  publishMovie(movieStream)
};

function publishMovie(movieStream) {
  inquirer.prompt(questions).then(answers => {
    const newMovie = new movie.Movie();
    newMovie.setMovieName(answers['movieName']);
    newMovie.setGenre(answers['genre']);
    newMovie.setClientId(CLIENT_ID);
    movieStream.write(newMovie);
    publishMovie(movieStream)
  })
}

function printMessage(movie) {
  console.log('\n\n******Movie received: ' +
    '\nid: ' + movie.getId() +
    '\nmovie_name: ', movie.getMovieName() +
    '\ngenre: ' + movie.getGenre() +
    '\nclient_id: ' + movie.getClientId())
}

/**
 * Run all of the demos in order
 */
function main() {
  async.series([listMessages]);
  async.series([getAndUpdateMovieLibrary])
}

if (require.main === module) {
  main();
}

exports.listMessages = listMessages;

exports.startChatting = getAndUpdateMovieLibrary;
