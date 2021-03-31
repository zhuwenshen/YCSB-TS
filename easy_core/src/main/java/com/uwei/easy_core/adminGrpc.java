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
    comments = "Source: admin.proto")
public final class adminGrpc {

  private adminGrpc() {}

  public static final String SERVICE_NAME = "admin.admin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetServerInfoRequest,
      com.uwei.easy_core.AdminProto.GetServerInfoResponse> getGetServerInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_server_info",
      requestType = com.uwei.easy_core.AdminProto.GetServerInfoRequest.class,
      responseType = com.uwei.easy_core.AdminProto.GetServerInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetServerInfoRequest,
      com.uwei.easy_core.AdminProto.GetServerInfoResponse> getGetServerInfoMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetServerInfoRequest, com.uwei.easy_core.AdminProto.GetServerInfoResponse> getGetServerInfoMethod;
    if ((getGetServerInfoMethod = adminGrpc.getGetServerInfoMethod) == null) {
      synchronized (adminGrpc.class) {
        if ((getGetServerInfoMethod = adminGrpc.getGetServerInfoMethod) == null) {
          adminGrpc.getGetServerInfoMethod = getGetServerInfoMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.AdminProto.GetServerInfoRequest, com.uwei.easy_core.AdminProto.GetServerInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_server_info"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.AdminProto.GetServerInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.AdminProto.GetServerInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new adminMethodDescriptorSupplier("get_server_info"))
              .build();
        }
      }
    }
    return getGetServerInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetCacheUsageRequest,
      com.uwei.easy_core.AdminProto.GetCacheUsageResponse> getGetCacheUsageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_cache_usage",
      requestType = com.uwei.easy_core.AdminProto.GetCacheUsageRequest.class,
      responseType = com.uwei.easy_core.AdminProto.GetCacheUsageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetCacheUsageRequest,
      com.uwei.easy_core.AdminProto.GetCacheUsageResponse> getGetCacheUsageMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.AdminProto.GetCacheUsageRequest, com.uwei.easy_core.AdminProto.GetCacheUsageResponse> getGetCacheUsageMethod;
    if ((getGetCacheUsageMethod = adminGrpc.getGetCacheUsageMethod) == null) {
      synchronized (adminGrpc.class) {
        if ((getGetCacheUsageMethod = adminGrpc.getGetCacheUsageMethod) == null) {
          adminGrpc.getGetCacheUsageMethod = getGetCacheUsageMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.AdminProto.GetCacheUsageRequest, com.uwei.easy_core.AdminProto.GetCacheUsageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_cache_usage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.AdminProto.GetCacheUsageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.AdminProto.GetCacheUsageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new adminMethodDescriptorSupplier("get_cache_usage"))
              .build();
        }
      }
    }
    return getGetCacheUsageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static adminStub newStub(io.grpc.Channel channel) {
    return new adminStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static adminBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new adminBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static adminFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new adminFutureStub(channel);
  }

  /**
   */
  public static abstract class adminImplBase implements io.grpc.BindableService {

    /**
     */
    public void getServerInfo(com.uwei.easy_core.AdminProto.GetServerInfoRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetServerInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServerInfoMethod(), responseObserver);
    }

    /**
     */
    public void getCacheUsage(com.uwei.easy_core.AdminProto.GetCacheUsageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetCacheUsageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCacheUsageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetServerInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.AdminProto.GetServerInfoRequest,
                com.uwei.easy_core.AdminProto.GetServerInfoResponse>(
                  this, METHODID_GET_SERVER_INFO)))
          .addMethod(
            getGetCacheUsageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.AdminProto.GetCacheUsageRequest,
                com.uwei.easy_core.AdminProto.GetCacheUsageResponse>(
                  this, METHODID_GET_CACHE_USAGE)))
          .build();
    }
  }

  /**
   */
  public static final class adminStub extends io.grpc.stub.AbstractStub<adminStub> {
    private adminStub(io.grpc.Channel channel) {
      super(channel);
    }

    private adminStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected adminStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new adminStub(channel, callOptions);
    }

    /**
     */
    public void getServerInfo(com.uwei.easy_core.AdminProto.GetServerInfoRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetServerInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCacheUsage(com.uwei.easy_core.AdminProto.GetCacheUsageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetCacheUsageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCacheUsageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class adminBlockingStub extends io.grpc.stub.AbstractStub<adminBlockingStub> {
    private adminBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private adminBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected adminBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new adminBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.AdminProto.GetServerInfoResponse getServerInfo(com.uwei.easy_core.AdminProto.GetServerInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetServerInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.AdminProto.GetCacheUsageResponse getCacheUsage(com.uwei.easy_core.AdminProto.GetCacheUsageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCacheUsageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class adminFutureStub extends io.grpc.stub.AbstractStub<adminFutureStub> {
    private adminFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private adminFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected adminFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new adminFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.AdminProto.GetServerInfoResponse> getServerInfo(
        com.uwei.easy_core.AdminProto.GetServerInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServerInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.AdminProto.GetCacheUsageResponse> getCacheUsage(
        com.uwei.easy_core.AdminProto.GetCacheUsageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCacheUsageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SERVER_INFO = 0;
  private static final int METHODID_GET_CACHE_USAGE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final adminImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(adminImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SERVER_INFO:
          serviceImpl.getServerInfo((com.uwei.easy_core.AdminProto.GetServerInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetServerInfoResponse>) responseObserver);
          break;
        case METHODID_GET_CACHE_USAGE:
          serviceImpl.getCacheUsage((com.uwei.easy_core.AdminProto.GetCacheUsageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.AdminProto.GetCacheUsageResponse>) responseObserver);
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

  private static abstract class adminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    adminBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.AdminProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("admin");
    }
  }

  private static final class adminFileDescriptorSupplier
      extends adminBaseDescriptorSupplier {
    adminFileDescriptorSupplier() {}
  }

  private static final class adminMethodDescriptorSupplier
      extends adminBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    adminMethodDescriptorSupplier(String methodName) {
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
      synchronized (adminGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new adminFileDescriptorSupplier())
              .addMethod(getGetServerInfoMethod())
              .addMethod(getGetCacheUsageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
