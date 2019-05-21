// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var chat_pb = require('./chat_pb.js');

function serialize_chat_ListMessagesRequest(arg) {
  if (!(arg instanceof chat_pb.ListMessagesRequest)) {
    throw new Error('Expected argument of type chat.ListMessagesRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chat_ListMessagesRequest(buffer_arg) {
  return chat_pb.ListMessagesRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_chat_UserMessage(arg) {
  if (!(arg instanceof chat_pb.UserMessage)) {
    throw new Error('Expected argument of type chat.UserMessage');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_chat_UserMessage(buffer_arg) {
  return chat_pb.UserMessage.deserializeBinary(new Uint8Array(buffer_arg));
}


var ChatService = exports.ChatService = {
  // Bidrectional streaming rpc to allow chat between client and server
  realTimeChat: {
    path: '/chat.Chat/realTimeChat',
    requestStream: true,
    responseStream: true,
    requestType: chat_pb.UserMessage,
    responseType: chat_pb.UserMessage,
    requestSerialize: serialize_chat_UserMessage,
    requestDeserialize: deserialize_chat_UserMessage,
    responseSerialize: serialize_chat_UserMessage,
    responseDeserialize: deserialize_chat_UserMessage,
  },
  // Client side streaming rpc to allow user to fetch messages from the server
  listUserMessages: {
    path: '/chat.Chat/listUserMessages',
    requestStream: false,
    responseStream: true,
    requestType: chat_pb.ListMessagesRequest,
    responseType: chat_pb.UserMessage,
    requestSerialize: serialize_chat_ListMessagesRequest,
    requestDeserialize: deserialize_chat_ListMessagesRequest,
    responseSerialize: serialize_chat_UserMessage,
    responseDeserialize: deserialize_chat_UserMessage,
  },
};

exports.ChatClient = grpc.makeGenericClientConstructor(ChatService);
