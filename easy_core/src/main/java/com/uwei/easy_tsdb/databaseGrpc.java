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
 * 数据库相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: database.proto")
public final class databaseGrpc {

  private databaseGrpc() {}

  public static final String SERVICE_NAME = "database.database";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.CreateRequest,
      com.uwei.easy_tsdb.DatabaseProto.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_tsdb.DatabaseProto.CreateRequest.class,
      responseType = com.uwei.easy_tsdb.DatabaseProto.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.CreateRequest,
      com.uwei.easy_tsdb.DatabaseProto.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.CreateRequest, com.uwei.easy_tsdb.DatabaseProto.CreateResponse> getCreateMethod;
    if ((getCreateMethod = databaseGrpc.getCreateMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getCreateMethod = databaseGrpc.getCreateMethod) == null) {
          databaseGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.DatabaseProto.CreateRequest, com.uwei.easy_tsdb.DatabaseProto.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.ListRequest,
      com.uwei.easy_tsdb.DatabaseProto.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.uwei.easy_tsdb.DatabaseProto.ListRequest.class,
      responseType = com.uwei.easy_tsdb.DatabaseProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.ListRequest,
      com.uwei.easy_tsdb.DatabaseProto.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.ListRequest, com.uwei.easy_tsdb.DatabaseProto.ListResponse> getListMethod;
    if ((getListMethod = databaseGrpc.getListMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getListMethod = databaseGrpc.getListMethod) == null) {
          databaseGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.DatabaseProto.ListRequest, com.uwei.easy_tsdb.DatabaseProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest,
      com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> getUpdateTtlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_ttl",
      requestType = com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest.class,
      responseType = com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest,
      com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> getUpdateTtlMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest, com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> getUpdateTtlMethod;
    if ((getUpdateTtlMethod = databaseGrpc.getUpdateTtlMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getUpdateTtlMethod = databaseGrpc.getUpdateTtlMethod) == null) {
          databaseGrpc.getUpdateTtlMethod = getUpdateTtlMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest, com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_ttl"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("update_ttl"))
              .build();
        }
      }
    }
    return getUpdateTtlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static databaseStub newStub(io.grpc.Channel channel) {
    return new databaseStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static databaseBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new databaseBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static databaseFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new databaseFutureStub(channel);
  }

  /**
   * <pre>
   * 数据库相关接口
   * </pre>
   */
  public static abstract class databaseImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.uwei.easy_tsdb.DatabaseProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_tsdb.DatabaseProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void updateTtl(com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTtlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.DatabaseProto.CreateRequest,
                com.uwei.easy_tsdb.DatabaseProto.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.DatabaseProto.ListRequest,
                com.uwei.easy_tsdb.DatabaseProto.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getUpdateTtlMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest,
                com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse>(
                  this, METHODID_UPDATE_TTL)))
          .build();
    }
  }

  /**
   * <pre>
   * 数据库相关接口
   * </pre>
   */
  public static final class databaseStub extends io.grpc.stub.AbstractStub<databaseStub> {
    private databaseStub(io.grpc.Channel channel) {
      super(channel);
    }

    private databaseStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected databaseStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new databaseStub(channel, callOptions);
    }

    /**
     */
    public void create(com.uwei.easy_tsdb.DatabaseProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_tsdb.DatabaseProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTtl(com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTtlMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 数据库相关接口
   * </pre>
   */
  public static final class databaseBlockingStub extends io.grpc.stub.AbstractStub<databaseBlockingStub> {
    private databaseBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private databaseBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected databaseBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new databaseBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_tsdb.DatabaseProto.CreateResponse create(com.uwei.easy_tsdb.DatabaseProto.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_tsdb.DatabaseProto.ListResponse list(com.uwei.easy_tsdb.DatabaseProto.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse updateTtl(com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTtlMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 数据库相关接口
   * </pre>
   */
  public static final class databaseFutureStub extends io.grpc.stub.AbstractStub<databaseFutureStub> {
    private databaseFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private databaseFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected databaseFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new databaseFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.DatabaseProto.CreateResponse> create(
        com.uwei.easy_tsdb.DatabaseProto.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.DatabaseProto.ListResponse> list(
        com.uwei.easy_tsdb.DatabaseProto.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse> updateTtl(
        com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTtlMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_LIST = 1;
  private static final int METHODID_UPDATE_TTL = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final databaseImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(databaseImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_tsdb.DatabaseProto.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.CreateResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.uwei.easy_tsdb.DatabaseProto.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.ListResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TTL:
          serviceImpl.updateTtl((com.uwei.easy_tsdb.DatabaseProto.UpdateTTLRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.DatabaseProto.UpdateTTLResponse>) responseObserver);
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

  private static abstract class databaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    databaseBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_tsdb.DatabaseProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("database");
    }
  }

  private static final class databaseFileDescriptorSupplier
      extends databaseBaseDescriptorSupplier {
    databaseFileDescriptorSupplier() {}
  }

  private static final class databaseMethodDescriptorSupplier
      extends databaseBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    databaseMethodDescriptorSupplier(String methodName) {
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
      synchronized (databaseGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new databaseFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getListMethod())
              .addMethod(getUpdateTtlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
