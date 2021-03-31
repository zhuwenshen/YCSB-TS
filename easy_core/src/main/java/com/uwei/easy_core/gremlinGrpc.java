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
    comments = "Source: gremlin.proto")
public final class gremlinGrpc {

  private gremlinGrpc() {}

  public static final String SERVICE_NAME = "gremlin.gremlin";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.GremlinProto.GremlinRequest,
      com.uwei.easy_core.InstanceProto.Response> getExecMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "exec",
      requestType = com.uwei.easy_core.GremlinProto.GremlinRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.GremlinProto.GremlinRequest,
      com.uwei.easy_core.InstanceProto.Response> getExecMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.GremlinProto.GremlinRequest, com.uwei.easy_core.InstanceProto.Response> getExecMethod;
    if ((getExecMethod = gremlinGrpc.getExecMethod) == null) {
      synchronized (gremlinGrpc.class) {
        if ((getExecMethod = gremlinGrpc.getExecMethod) == null) {
          gremlinGrpc.getExecMethod = getExecMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.GremlinProto.GremlinRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "exec"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.GremlinProto.GremlinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new gremlinMethodDescriptorSupplier("exec"))
              .build();
        }
      }
    }
    return getExecMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static gremlinStub newStub(io.grpc.Channel channel) {
    return new gremlinStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static gremlinBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new gremlinBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static gremlinFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new gremlinFutureStub(channel);
  }

  /**
   */
  public static abstract class gremlinImplBase implements io.grpc.BindableService {

    /**
     */
    public void exec(com.uwei.easy_core.GremlinProto.GremlinRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getExecMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getExecMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.GremlinProto.GremlinRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_EXEC)))
          .build();
    }
  }

  /**
   */
  public static final class gremlinStub extends io.grpc.stub.AbstractStub<gremlinStub> {
    private gremlinStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gremlinStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gremlinStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gremlinStub(channel, callOptions);
    }

    /**
     */
    public void exec(com.uwei.easy_core.GremlinProto.GremlinRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class gremlinBlockingStub extends io.grpc.stub.AbstractStub<gremlinBlockingStub> {
    private gremlinBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gremlinBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gremlinBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gremlinBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response exec(com.uwei.easy_core.GremlinProto.GremlinRequest request) {
      return blockingUnaryCall(
          getChannel(), getExecMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class gremlinFutureStub extends io.grpc.stub.AbstractStub<gremlinFutureStub> {
    private gremlinFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private gremlinFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected gremlinFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new gremlinFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> exec(
        com.uwei.easy_core.GremlinProto.GremlinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getExecMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXEC = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final gremlinImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(gremlinImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EXEC:
          serviceImpl.exec((com.uwei.easy_core.GremlinProto.GremlinRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
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

  private static abstract class gremlinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    gremlinBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.GremlinProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("gremlin");
    }
  }

  private static final class gremlinFileDescriptorSupplier
      extends gremlinBaseDescriptorSupplier {
    gremlinFileDescriptorSupplier() {}
  }

  private static final class gremlinMethodDescriptorSupplier
      extends gremlinBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    gremlinMethodDescriptorSupplier(String methodName) {
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
      synchronized (gremlinGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new gremlinFileDescriptorSupplier())
              .addMethod(getExecMethod())
              .build();
        }
      }
    }
    return result;
  }
}
