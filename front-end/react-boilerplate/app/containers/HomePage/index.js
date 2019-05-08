/*
 * HomePage
 *
 * This is the first thing users see of our App, at the '/' route
 *
 */

import React from 'react';
import * as grpcWeb from 'grpc-web';
import SamplePB from '../../../grpc-client-lib/sample_pb';
import {
  SampleClient,
  SamplePromiseClient,
  MessagingClient,
  MessagingPromiseClient
} from '../../../grpc-client-lib/sample_grpc_web_pb';

const samplePromiseService = new SamplePromiseClient(
  'http://localhost:8080',
  null,
  null,
);

const messagePromiseService = new MessagingPromiseClient(
  'http://localhost:8080',
  null,
  null,
);

const {Point, Rectangle, UserMessage, ListMessagesRequest} = SamplePB;
const point = new Point();
const rectangle = new Rectangle();
point.setLatitude(407838351);
point.setLongitude(-746143763);

const point1 = new Point();
point1.setLatitude(410248224);
point1.setLongitude(-747127767);
rectangle.setLo(point);
rectangle.setHi(point1);
export default class HomePage extends React.Component {
  state = {
    topicLists: {},
    userMessages: [],
    username: '',
    topicName: '',
    textInput: '',
  };

  componentDidMount() {
    this.listUserMessages();
  }

  getFeature = () => {
    samplePromiseService.getFeature(point, null).then((feature, err) => {
      if (feature) {
        const {getFeatures} = this.state;
        const features = getFeatures.concat({name: feature.getName(), location: feature.getLocation()})
        this.setState({getFeatures: features})
      }
    });
  };

  listFeature = () => {
    const stream = samplePromiseService.listFeatures(rectangle, null);

    stream.on('status', status => {
      // console.log('status', status)
    });

    stream.on('data', feature => {
      if (feature) {
        const {listFeatures} = this.state;
        const features = listFeatures.concat({name: feature.getName(), location: feature.getLocation()});
        this.setState({listFeatures: features});
      }
    });

    stream.on('error', error => {
      // console.log('error', error)
    });

    stream.on('end', end => {
      // console.log('end', end)
    });
  };


  handleKeyDown = (e, type) => {
    if (e.key === 'Enter') {
      this.sendUserMessage(type)
    }
  };

  updateTopicLists = (topicName, id, shouldInitStream) => {
    const { topicLists } = this.state
    let updatedTopicLists = topicLists;
    if (topicName && !topicLists[topicName]) {
      updatedTopicLists = {...topicLists};
      updatedTopicLists[topicName] = id;
      console.log('**********************id:' + id);
      this.setState({topicLists: updatedTopicLists});
      shouldInitStream && this.initStream(topicName);
    }
  };

  sendUserMessage = () => {
    const {textInput, username, topicName, topicLists} = this.state;
    const tName = topicName
    const userMessage = new UserMessage();
    userMessage.setTextMessage(textInput);
    userMessage.setUsername(username);
    userMessage.setTopic(topicName);
    this.setState({textInput: '', username: '', topicName: ''});
    const stream = messagePromiseService.sendUserMessage(userMessage, null).then(userMessage => {
      if (userMessage) {
        this.updateTopicLists(tName, userMessage.getId(), true);
        console.log('done')
      } else {
        console.log('error')
      }
    });
  };

  createListMessagesRequest = (id = 0, topic = 'react-client') => {
    const listUserMessagesRequest = new ListMessagesRequest();
    listUserMessagesRequest.setMaxPageSize(100);
    listUserMessagesRequest.setCurrentId(id);
    listUserMessagesRequest.setTopic(topic);
    console.log('**********************id: ' + id);
    return listUserMessagesRequest;
  };

  appendUserMessage = (userMessage) => {
    const {userMessages} = this.state;
    if (userMessage.getTopic()) {
      const messages = userMessages.concat({
        username: userMessage.getUsername(),
        textMessage: userMessage.getTextMessage(),
        topic: userMessage.getTopic(),
        id: userMessage.getId()
      });
      console.log(userMessage)
      this.updateTopicLists(userMessage.getTopic(), userMessage.getId(), false);
      this.setState({userMessages: messages});
    }
  };

  initStream = (topicName) => {
    const {topicLists} = this.state;
    const currentId = topicLists[topicName];
    const listUserMessagesRequest = this.createListMessagesRequest(currentId, topicName);
    const stream = messagePromiseService.listUserMessages(listUserMessagesRequest, null);
    stream.on('status', status => {
      console.log('status', status)
    });

    stream.on('data', userMessage => {
      if (userMessage) {
        this.appendUserMessage(userMessage);
      }
    });

    stream.on('error', error => {
      console.log('error', error);
      this.initStream(topicName);
    });

    stream.on('end', end => {
      console.log('end', end);
      this.initStream(topicName);
    });
  };

  listUserMessages = () => {
    const listMessagesRequest = this.createListMessagesRequest();
    const stream = messagePromiseService.listUserMessages(listMessagesRequest, null);

    stream.on('status', status => {
      console.log('status', status)
    });

    stream.on('data', userMessage => {
      if (userMessage && userMessage.getTopic()) {
        console.log('userMessage', userMessage);
        this.appendUserMessage(userMessage);
      }
    });

    stream.on('error', error => {
      console.log('error', error);
      this.initStream(listMessagesRequest.getTopic())
    });

    stream.on('end', end => {
      console.log('end', end);
      this.initStream(listMessagesRequest.getTopic())
    });
  };

  handleInput = (evt, key) => {
    this.setState({[key]: evt.target.value})
  };

  render() {
    const {userMessages} = this.state;
    return (
      <div>
        <div style={{display: 'flex', 'flexDirection': 'row'}}>
          <div style={{display: 'flex', flex: '1 0 25%', 'flexDirection': 'column'}}>
            <input
              onKeyDown={evt => this.handleKeyDown(evt, 'username')}
              value={this.state.username}
              placeholder={'username'}
              onChange={evt => this.handleInput(evt, 'username')}/>
          </div>
          <div style={{display: 'flex', flex: '1 0 25%', 'flexDirection': 'column'}}>
            <input
              placeholder={'topicName'}
              onKeyDown={evt => this.handleKeyDown(evt, 'topicName')}
              value={this.state.topicName}
              onChange={evt => this.handleInput(evt, 'topicName')}/>
          </div>

          <div style={{display: 'flex', flex: '1 0 25%', 'flexDirection': 'column'}}>
            <input
              placeholder={'textInput'}
              onKeyDown={evt => this.handleKeyDown(evt, 'textInput')}
              value={this.state.textInput}
              onChange={evt => this.handleInput(evt, 'textInput')}/>
          </div>
          <div style={{display: 'flex', flex: '1 0 25%', 'flexDirection': 'column'}}>
            <button onClick={this.sendUserMessage}>Send User Message</button>
          </div>
        </div>
        {
          userMessages.map((userMessage) => {
            return (<div style={{marginBottom: '10px'}}>
              <div>{userMessage.username ? ('Name: ' + userMessage.username) : null}</div>
              <div>{userMessage.topic ? ('Topic: ' + userMessage.topic) : null}</div>
              <div>{'Text Message: ' + userMessage.textMessage}</div>
            </div>)
          })
        }
      </div>
    );
  }
}
