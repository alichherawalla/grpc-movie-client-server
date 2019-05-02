package com.betasolutions.grpc.sample;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: sample.proto")
public final class SampleGrpc {

  private SampleGrpc() {}

  public static final String SERVICE_NAME = "sample.Sample";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point,
      com.betasolutions.grpc.sample.Feature> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = com.betasolutions.grpc.sample.Point.class,
      responseType = com.betasolutions.grpc.sample.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point,
      com.betasolutions.grpc.sample.Feature> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point, com.betasolutions.grpc.sample.Feature> getGetFeatureMethod;
    if ((getGetFeatureMethod = SampleGrpc.getGetFeatureMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getGetFeatureMethod = SampleGrpc.getGetFeatureMethod) == null) {
          SampleGrpc.getGetFeatureMethod = getGetFeatureMethod = 
              io.grpc.MethodDescriptor.<com.betasolutions.grpc.sample.Point, com.betasolutions.grpc.sample.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "sample.Sample", "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.Feature.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleMethodDescriptorSupplier("GetFeature"))
                  .build();
          }
        }
     }
     return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Rectangle,
      com.betasolutions.grpc.sample.Feature> getListFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatures",
      requestType = com.betasolutions.grpc.sample.Rectangle.class,
      responseType = com.betasolutions.grpc.sample.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Rectangle,
      com.betasolutions.grpc.sample.Feature> getListFeaturesMethod() {
    io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Rectangle, com.betasolutions.grpc.sample.Feature> getListFeaturesMethod;
    if ((getListFeaturesMethod = SampleGrpc.getListFeaturesMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getListFeaturesMethod = SampleGrpc.getListFeaturesMethod) == null) {
          SampleGrpc.getListFeaturesMethod = getListFeaturesMethod = 
              io.grpc.MethodDescriptor.<com.betasolutions.grpc.sample.Rectangle, com.betasolutions.grpc.sample.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sample.Sample", "ListFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.Rectangle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.Feature.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleMethodDescriptorSupplier("ListFeatures"))
                  .build();
          }
        }
     }
     return getListFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point,
      com.betasolutions.grpc.sample.RouteSummary> getRecordRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRoute",
      requestType = com.betasolutions.grpc.sample.Point.class,
      responseType = com.betasolutions.grpc.sample.RouteSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point,
      com.betasolutions.grpc.sample.RouteSummary> getRecordRouteMethod() {
    io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.Point, com.betasolutions.grpc.sample.RouteSummary> getRecordRouteMethod;
    if ((getRecordRouteMethod = SampleGrpc.getRecordRouteMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getRecordRouteMethod = SampleGrpc.getRecordRouteMethod) == null) {
          SampleGrpc.getRecordRouteMethod = getRecordRouteMethod = 
              io.grpc.MethodDescriptor.<com.betasolutions.grpc.sample.Point, com.betasolutions.grpc.sample.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sample.Sample", "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.RouteSummary.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleMethodDescriptorSupplier("RecordRoute"))
                  .build();
          }
        }
     }
     return getRecordRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.RouteNote,
      com.betasolutions.grpc.sample.RouteNote> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = com.betasolutions.grpc.sample.RouteNote.class,
      responseType = com.betasolutions.grpc.sample.RouteNote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.RouteNote,
      com.betasolutions.grpc.sample.RouteNote> getRouteChatMethod() {
    io.grpc.MethodDescriptor<com.betasolutions.grpc.sample.RouteNote, com.betasolutions.grpc.sample.RouteNote> getRouteChatMethod;
    if ((getRouteChatMethod = SampleGrpc.getRouteChatMethod) == null) {
      synchronized (SampleGrpc.class) {
        if ((getRouteChatMethod = SampleGrpc.getRouteChatMethod) == null) {
          SampleGrpc.getRouteChatMethod = getRouteChatMethod = 
              io.grpc.MethodDescriptor.<com.betasolutions.grpc.sample.RouteNote, com.betasolutions.grpc.sample.RouteNote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "sample.Sample", "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.RouteNote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.betasolutions.grpc.sample.RouteNote.getDefaultInstance()))
                  .setSchemaDescriptor(new SampleMethodDescriptorSupplier("RouteChat"))
                  .build();
          }
        }
     }
     return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SampleStub newStub(io.grpc.Channel channel) {
    return new SampleStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SampleBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SampleBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SampleFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SampleFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class SampleImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(com.betasolutions.grpc.sample.Point request,
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(com.betasolutions.grpc.sample.Rectangle request,
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature> responseObserver) {
      asyncUnimplementedUnaryCall(getListFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteSummary> responseObserver) {
      return asyncUnimplementedStreamingCall(getRecordRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteNote> responseObserver) {
      return asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.betasolutions.grpc.sample.Point,
                com.betasolutions.grpc.sample.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            getListFeaturesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.betasolutions.grpc.sample.Rectangle,
                com.betasolutions.grpc.sample.Feature>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            getRecordRouteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.betasolutions.grpc.sample.Point,
                com.betasolutions.grpc.sample.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            getRouteChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.betasolutions.grpc.sample.RouteNote,
                com.betasolutions.grpc.sample.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SampleStub extends io.grpc.stub.AbstractStub<SampleStub> {
    private SampleStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(com.betasolutions.grpc.sample.Point request,
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(com.betasolutions.grpc.sample.Rectangle request,
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Point> recordRoute(
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteSummary> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * A Bidirectional streaming RPC.
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteNote> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SampleBlockingStub extends io.grpc.stub.AbstractStub<SampleBlockingStub> {
    private SampleBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.betasolutions.grpc.sample.Feature getFeature(com.betasolutions.grpc.sample.Point request) {
      return blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public java.util.Iterator<com.betasolutions.grpc.sample.Feature> listFeatures(
        com.betasolutions.grpc.sample.Rectangle request) {
      return blockingServerStreamingCall(
          getChannel(), getListFeaturesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class SampleFutureStub extends io.grpc.stub.AbstractStub<SampleFutureStub> {
    private SampleFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SampleFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SampleFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SampleFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.betasolutions.grpc.sample.Feature> getFeature(
        com.betasolutions.grpc.sample.Point request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SampleImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SampleImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((com.betasolutions.grpc.sample.Point) request,
              (io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((com.betasolutions.grpc.sample.Rectangle) request,
              (io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.Feature>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<com.betasolutions.grpc.sample.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SampleBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.betasolutions.grpc.sample.SampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sample");
    }
  }

  private static final class SampleFileDescriptorSupplier
      extends SampleBaseDescriptorSupplier {
    SampleFileDescriptorSupplier() {}
  }

  private static final class SampleMethodDescriptorSupplier
      extends SampleBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SampleMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SampleGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SampleFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getListFeaturesMethod())
              .addMethod(getRecordRouteMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
