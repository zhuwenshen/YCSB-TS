package com.uwei.easy_tsdb;

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
 * 手动打快照
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: snap.proto")
public final class snapGrpc {

  private snapGrpc() {}

  public static final String SERVICE_NAME = "snap.snap";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.SnapProto.SaveSnapRequest,
      com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> getSaveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "save",
      requestType = com.uwei.easy_tsdb.SnapProto.SaveSnapRequest.class,
      responseType = com.uwei.easy_tsdb.SnapProto.SaveSnapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.SnapProto.SaveSnapRequest,
      com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> getSaveMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.SnapProto.SaveSnapRequest, com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> getSaveMethod;
    if ((getSaveMethod = snapGrpc.getSaveMethod) == null) {
      synchronized (snapGrpc.class) {
        if ((getSaveMethod = snapGrpc.getSaveMethod) == null) {
          snapGrpc.getSaveMethod = getSaveMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.SnapProto.SaveSnapRequest, com.uwei.easy_tsdb.SnapProto.SaveSnapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "save"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.SnapProto.SaveSnapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.SnapProto.SaveSnapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new snapMethodDescriptorSupplier("save"))
              .build();
        }
      }
    }
    return getSaveMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static snapStub newStub(io.grpc.Channel channel) {
    return new snapStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static snapBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new snapBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static snapFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new snapFutureStub(channel);
  }

  /**
   * <pre>
   * 手动打快照
   * </pre>
   */
  public static abstract class snapImplBase implements io.grpc.BindableService {

    /**
     */
    public void save(com.uwei.easy_tsdb.SnapProto.SaveSnapRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.SnapProto.SaveSnapRequest,
                com.uwei.easy_tsdb.SnapProto.SaveSnapResponse>(
                  this, METHODID_SAVE)))
          .build();
    }
  }

  /**
   * <pre>
   * 手动打快照
   * </pre>
   */
  public static final class snapStub extends io.grpc.stub.AbstractStub<snapStub> {
    private snapStub(io.grpc.Channel channel) {
      super(channel);
    }

    private snapStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected snapStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new snapStub(channel, callOptions);
    }

    /**
     */
    public void save(com.uwei.easy_tsdb.SnapProto.SaveSnapRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 手动打快照
   * </pre>
   */
  public static final class snapBlockingStub extends io.grpc.stub.AbstractStub<snapBlockingStub> {
    private snapBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private snapBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected snapBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new snapBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_tsdb.SnapProto.SaveSnapResponse save(com.uwei.easy_tsdb.SnapProto.SaveSnapRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 手动打快照
   * </pre>
   */
  public static final class snapFutureStub extends io.grpc.stub.AbstractStub<snapFutureStub> {
    private snapFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private snapFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected snapFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new snapFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.SnapProto.SaveSnapResponse> save(
        com.uwei.easy_tsdb.SnapProto.SaveSnapRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final snapImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(snapImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE:
          serviceImpl.save((com.uwei.easy_tsdb.SnapProto.SaveSnapRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.SnapProto.SaveSnapResponse>) responseObserver);
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

  private static abstract class snapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    snapBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_tsdb.SnapProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("snap");
    }
  }

  private static final class snapFileDescriptorSupplier
      extends snapBaseDescriptorSupplier {
    snapFileDescriptorSupplier() {}
  }

  private static final class snapMethodDescriptorSupplier
      extends snapBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    snapMethodDescriptorSupplier(String methodName) {
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
      synchronized (snapGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new snapFileDescriptorSupplier())
              .addMethod(getSaveMethod())
              .build();
        }
      }
    }
    return result;
  }
}
