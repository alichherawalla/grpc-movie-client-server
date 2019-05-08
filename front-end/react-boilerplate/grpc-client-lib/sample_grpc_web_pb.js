/**
 * @fileoverview gRPC-Web generated client stub for sample
 * @enhanceable
 * @public
 */

// GENERATED CODE -- DO NOT EDIT!



const grpc = {};
grpc.web = require('grpc-web');

const proto = {};
proto.sample = require('./sample_pb.js');

/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.sample.SampleClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.sample.SamplePromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.sample.Point,
 *   !proto.sample.Feature>}
 */
const methodInfo_Sample_GetFeature = new grpc.web.AbstractClientBase.MethodInfo(
  proto.sample.Feature,
  /** @param {!proto.sample.Point} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.sample.Feature.deserializeBinary
);


/**
 * @param {!proto.sample.Point} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.sample.Feature)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.sample.Feature>|undefined}
 *     The XHR Node Readable Stream
 */
proto.sample.SampleClient.prototype.getFeature =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/sample.Sample/GetFeature',
      request,
      metadata || {},
      methodInfo_Sample_GetFeature,
      callback);
};


/**
 * @param {!proto.sample.Point} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.sample.Feature>}
 *     A native promise that resolves to the response
 */
proto.sample.SamplePromiseClient.prototype.getFeature =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/sample.Sample/GetFeature',
      request,
      metadata || {},
      methodInfo_Sample_GetFeature);
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.sample.Rectangle,
 *   !proto.sample.Feature>}
 */
const methodInfo_Sample_ListFeatures = new grpc.web.AbstractClientBase.MethodInfo(
  proto.sample.Feature,
  /** @param {!proto.sample.Rectangle} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.sample.Feature.deserializeBinary
);


/**
 * @param {!proto.sample.Rectangle} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.sample.Feature>}
 *     The XHR Node Readable Stream
 */
proto.sample.SampleClient.prototype.listFeatures =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/sample.Sample/ListFeatures',
      request,
      metadata || {},
      methodInfo_Sample_ListFeatures);
};


/**
 * @param {!proto.sample.Rectangle} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.sample.Feature>}
 *     The XHR Node Readable Stream
 */
proto.sample.SamplePromiseClient.prototype.listFeatures =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/sample.Sample/ListFeatures',
      request,
      metadata || {},
      methodInfo_Sample_ListFeatures);
};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.sample.MessagingClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @param {string} hostname
 * @param {?Object} credentials
 * @param {?Object} options
 * @constructor
 * @struct
 * @final
 */
proto.sample.MessagingPromiseClient =
    function(hostname, credentials, options) {
  if (!options) options = {};
  options['format'] = 'text';

  /**
   * @private @const {!grpc.web.GrpcWebClientBase} The client
   */
  this.client_ = new grpc.web.GrpcWebClientBase(options);

  /**
   * @private @const {string} The hostname
   */
  this.hostname_ = hostname;

  /**
   * @private @const {?Object} The credentials to be used to connect
   *    to the server
   */
  this.credentials_ = credentials;

  /**
   * @private @const {?Object} Options for the client
   */
  this.options_ = options;
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.sample.UserMessage,
 *   !proto.sample.UserMessage>}
 */
const methodInfo_Messaging_sendUserMessage = new grpc.web.AbstractClientBase.MethodInfo(
  proto.sample.UserMessage,
  /** @param {!proto.sample.UserMessage} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.sample.UserMessage.deserializeBinary
);


/**
 * @param {!proto.sample.UserMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @param {function(?grpc.web.Error, ?proto.sample.UserMessage)}
 *     callback The callback function(error, response)
 * @return {!grpc.web.ClientReadableStream<!proto.sample.UserMessage>|undefined}
 *     The XHR Node Readable Stream
 */
proto.sample.MessagingClient.prototype.sendUserMessage =
    function(request, metadata, callback) {
  return this.client_.rpcCall(this.hostname_ +
      '/sample.Messaging/sendUserMessage',
      request,
      metadata || {},
      methodInfo_Messaging_sendUserMessage,
      callback);
};


/**
 * @param {!proto.sample.UserMessage} request The
 *     request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!Promise<!proto.sample.UserMessage>}
 *     A native promise that resolves to the response
 */
proto.sample.MessagingPromiseClient.prototype.sendUserMessage =
    function(request, metadata) {
  return this.client_.unaryCall(this.hostname_ +
      '/sample.Messaging/sendUserMessage',
      request,
      metadata || {},
      methodInfo_Messaging_sendUserMessage);
};


/**
 * @const
 * @type {!grpc.web.AbstractClientBase.MethodInfo<
 *   !proto.sample.ListMessagesRequest,
 *   !proto.sample.UserMessage>}
 */
const methodInfo_Messaging_listUserMessages = new grpc.web.AbstractClientBase.MethodInfo(
  proto.sample.UserMessage,
  /** @param {!proto.sample.ListMessagesRequest} request */
  function(request) {
    return request.serializeBinary();
  },
  proto.sample.UserMessage.deserializeBinary
);


/**
 * @param {!proto.sample.ListMessagesRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.sample.UserMessage>}
 *     The XHR Node Readable Stream
 */
proto.sample.MessagingClient.prototype.listUserMessages =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/sample.Messaging/listUserMessages',
      request,
      metadata || {},
      methodInfo_Messaging_listUserMessages);
};


/**
 * @param {!proto.sample.ListMessagesRequest} request The request proto
 * @param {?Object<string, string>} metadata User defined
 *     call metadata
 * @return {!grpc.web.ClientReadableStream<!proto.sample.UserMessage>}
 *     The XHR Node Readable Stream
 */
proto.sample.MessagingPromiseClient.prototype.listUserMessages =
    function(request, metadata) {
  return this.client_.serverStreaming(this.hostname_ +
      '/sample.Messaging/listUserMessages',
      request,
      metadata || {},
      methodInfo_Messaging_listUserMessages);
};


module.exports = proto.sample;

