// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/movie.proto

package com.betasolutions.grpc.movie;

public final class MovieProto {
  private MovieProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_movie_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_movie_ListMoviesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_movie_ListMoviesRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026main/proto/movie.proto\022\005movie\"I\n\005Movie" +
      "\022\n\n\002id\030\001 \001(\003\022\022\n\nmovie_name\030\002 \001(\t\022\r\n\005genr" +
      "e\030\003 \001(\t\022\021\n\tclient_id\030\004 \001(\t\"`\n\021ListMovies" +
      "Request\022\022\n\ncurrent_id\030\001 \001(\003\022\025\n\rmax_page_" +
      "size\030\002 \001(\005\022\r\n\005genre\030\003 \001(\t\022\021\n\tclient_id\030\004" +
      " \001(\t2\206\001\n\014MovieLibrary\022<\n\030getAndUpdateMov" +
      "ieLibrary\022\014.movie.Movie\032\014.movie.Movie\"\000(" +
      "\0010\001\0228\n\nlistMovies\022\030.movie.ListMoviesRequ" +
      "est\032\014.movie.Movie\"\0000\001B2\n\034com.betasolutio" +
      "ns.grpc.movieB\nMovieProtoP\001\242\002\003RTGb\006proto" +
      "3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_movie_Movie_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_movie_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_movie_Movie_descriptor,
        new java.lang.String[] { "Id", "MovieName", "Genre", "ClientId", });
    internal_static_movie_ListMoviesRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_movie_ListMoviesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_movie_ListMoviesRequest_descriptor,
        new java.lang.String[] { "CurrentId", "MaxPageSize", "Genre", "ClientId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
