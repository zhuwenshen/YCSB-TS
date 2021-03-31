package com.uwei.easy_core;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: query_cache.proto")
public final class QueryCacheGrpc {

  private QueryCacheGrpc() {}

  public static final String SERVICE_NAME = "query_cache.QueryCache";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.CreateRequest,
      com.uwei.easy_core.QueryCacheProto.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.QueryCacheProto.CreateRequest.class,
      responseType = com.uwei.easy_core.QueryCacheProto.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.CreateRequest,
      com.uwei.easy_core.QueryCacheProto.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.CreateRequest, com.uwei.easy_core.QueryCacheProto.CreateResponse> getCreateMethod;
    if ((getCreateMethod = QueryCacheGrpc.getCreateMethod) == null) {
      synchronized (QueryCacheGrpc.class) {
        if ((getCreateMethod = QueryCacheGrpc.getCreateMethod) == null) {
          QueryCacheGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.QueryCacheProto.CreateRequest, com.uwei.easy_core.QueryCacheProto.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.QueryCacheProto.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.QueryCacheProto.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryCacheMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.GetAllRequest,
      com.uwei.easy_core.QueryCacheProto.GetAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_all",
      requestType = com.uwei.easy_core.QueryCacheProto.GetAllRequest.class,
      responseType = com.uwei.easy_core.QueryCacheProto.GetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.GetAllRequest,
      com.uwei.easy_core.QueryCacheProto.GetAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.QueryCacheProto.GetAllRequest, com.uwei.easy_core.QueryCacheProto.GetAllResponse> getGetAllMethod;
    if ((getGetAllMethod = QueryCacheGrpc.getGetAllMethod) == null) {
      synchronized (QueryCacheGrpc.class) {
        if ((getGetAllMethod = QueryCacheGrpc.getGetAllMethod) == null) {
          QueryCacheGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.QueryCacheProto.GetAllRequest, com.uwei.easy_core.QueryCacheProto.GetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.QueryCacheProto.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.QueryCacheProto.GetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new QueryCacheMethodDescriptorSupplier("get_all"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QueryCacheStub newStub(io.grpc.Channel channel) {
    return new QueryCacheStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QueryCacheBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new QueryCacheBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QueryCacheFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new QueryCacheFutureStub(channel);
  }

  /**
   */
  public static abstract class QueryCacheImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.uwei.easy_core.QueryCacheProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAll(com.uwei.easy_core.QueryCacheProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.GetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.QueryCacheProto.CreateRequest,
                com.uwei.easy_core.QueryCacheProto.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.QueryCacheProto.GetAllRequest,
                com.uwei.easy_core.QueryCacheProto.GetAllResponse>(
                  this, METHODID_GET_ALL)))
          .build();
    }
  }

  /**
   */
  public static final class QueryCacheStub extends io.grpc.stub.AbstractStub<QueryCacheStub> {
    private QueryCacheStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryCacheStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryCacheStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryCacheStub(channel, callOptions);
    }

    /**
     */
    public void create(com.uwei.easy_core.QueryCacheProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(com.uwei.easy_core.QueryCacheProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.GetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QueryCacheBlockingStub extends io.grpc.stub.AbstractStub<QueryCacheBlockingStub> {
    private QueryCacheBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryCacheBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryCacheBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryCacheBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.QueryCacheProto.CreateResponse create(com.uwei.easy_core.QueryCacheProto.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.QueryCacheProto.GetAllResponse getAll(com.uwei.easy_core.QueryCacheProto.GetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QueryCacheFutureStub extends io.grpc.stub.AbstractStub<QueryCacheFutureStub> {
    private QueryCacheFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private QueryCacheFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QueryCacheFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new QueryCacheFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.QueryCacheProto.CreateResponse> create(
        com.uwei.easy_core.QueryCacheProto.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.QueryCacheProto.GetAllResponse> getAll(
        com.uwei.easy_core.QueryCacheProto.GetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET_ALL = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QueryCacheImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QueryCacheImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.QueryCacheProto.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.CreateResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.uwei.easy_core.QueryCacheProto.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.QueryCacheProto.GetAllResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class QueryCacheBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QueryCacheBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.QueryCacheProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QueryCache");
    }
  }

  private static final class QueryCacheFileDescriptorSupplier
      extends QueryCacheBaseDescriptorSupplier {
    QueryCacheFileDescriptorSupplier() {}
  }

  private static final class QueryCacheMethodDescriptorSupplier
      extends QueryCacheBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QueryCacheMethodDescriptorSupplier(String methodName) {
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
      synchronized (QueryCacheGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QueryCacheFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetAllMethod())
              .build();
        }
      }
    }
    return result;
  }
}
