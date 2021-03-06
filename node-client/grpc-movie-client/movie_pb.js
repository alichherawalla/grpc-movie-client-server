/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.movie.ListMoviesRequest', null, global);
goog.exportSymbol('proto.movie.Movie', null, global);

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.movie.Movie = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.movie.Movie, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.movie.Movie.displayName = 'proto.movie.Movie';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.movie.Movie.prototype.toObject = function(opt_includeInstance) {
  return proto.movie.Movie.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.movie.Movie} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.movie.Movie.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    movieName: jspb.Message.getFieldWithDefault(msg, 2, ""),
    genre: jspb.Message.getFieldWithDefault(msg, 3, ""),
    clientId: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.movie.Movie}
 */
proto.movie.Movie.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.movie.Movie;
  return proto.movie.Movie.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.movie.Movie} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.movie.Movie}
 */
proto.movie.Movie.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMovieName(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setGenre(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.movie.Movie.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.movie.Movie.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.movie.Movie} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.movie.Movie.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getMovieName();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getGenre();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional int64 id = 1;
 * @return {number}
 */
proto.movie.Movie.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {number} value */
proto.movie.Movie.prototype.setId = function(value) {
  jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string movie_name = 2;
 * @return {string}
 */
proto.movie.Movie.prototype.getMovieName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.movie.Movie.prototype.setMovieName = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string genre = 3;
 * @return {string}
 */
proto.movie.Movie.prototype.getGenre = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.movie.Movie.prototype.setGenre = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string client_id = 4;
 * @return {string}
 */
proto.movie.Movie.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.movie.Movie.prototype.setClientId = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};



/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.movie.ListMoviesRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.movie.ListMoviesRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.movie.ListMoviesRequest.displayName = 'proto.movie.ListMoviesRequest';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.movie.ListMoviesRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.movie.ListMoviesRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.movie.ListMoviesRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.movie.ListMoviesRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    currentId: jspb.Message.getFieldWithDefault(msg, 1, 0),
    maxPageSize: jspb.Message.getFieldWithDefault(msg, 2, 0),
    genre: jspb.Message.getFieldWithDefault(msg, 3, ""),
    clientId: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.movie.ListMoviesRequest}
 */
proto.movie.ListMoviesRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.movie.ListMoviesRequest;
  return proto.movie.ListMoviesRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.movie.ListMoviesRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.movie.ListMoviesRequest}
 */
proto.movie.ListMoviesRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt64());
      msg.setCurrentId(value);
      break;
    case 2:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setMaxPageSize(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setGenre(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setClientId(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.movie.ListMoviesRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.movie.ListMoviesRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.movie.ListMoviesRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.movie.ListMoviesRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getCurrentId();
  if (f !== 0) {
    writer.writeInt64(
      1,
      f
    );
  }
  f = message.getMaxPageSize();
  if (f !== 0) {
    writer.writeInt32(
      2,
      f
    );
  }
  f = message.getGenre();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
  f = message.getClientId();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional int64 current_id = 1;
 * @return {number}
 */
proto.movie.ListMoviesRequest.prototype.getCurrentId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {number} value */
proto.movie.ListMoviesRequest.prototype.setCurrentId = function(value) {
  jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional int32 max_page_size = 2;
 * @return {number}
 */
proto.movie.ListMoviesRequest.prototype.getMaxPageSize = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 2, 0));
};


/** @param {number} value */
proto.movie.ListMoviesRequest.prototype.setMaxPageSize = function(value) {
  jspb.Message.setProto3IntField(this, 2, value);
};


/**
 * optional string genre = 3;
 * @return {string}
 */
proto.movie.ListMoviesRequest.prototype.getGenre = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/** @param {string} value */
proto.movie.ListMoviesRequest.prototype.setGenre = function(value) {
  jspb.Message.setProto3StringField(this, 3, value);
};


/**
 * optional string client_id = 4;
 * @return {string}
 */
proto.movie.ListMoviesRequest.prototype.getClientId = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.movie.ListMoviesRequest.prototype.setClientId = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};


goog.object.extend(exports, proto.movie);
