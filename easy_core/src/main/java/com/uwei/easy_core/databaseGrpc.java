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
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.CreateRequest,
      com.uwei.easy_core.DatabaseProto.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.DatabaseProto.CreateRequest.class,
      responseType = com.uwei.easy_core.DatabaseProto.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.CreateRequest,
      com.uwei.easy_core.DatabaseProto.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.CreateRequest, com.uwei.easy_core.DatabaseProto.CreateResponse> getCreateMethod;
    if ((getCreateMethod = databaseGrpc.getCreateMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getCreateMethod = databaseGrpc.getCreateMethod) == null) {
          databaseGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.DatabaseProto.CreateRequest, com.uwei.easy_core.DatabaseProto.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupRequest,
      com.uwei.easy_core.InstanceProto.Response> getBackupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "backup",
      requestType = com.uwei.easy_core.DatabaseProto.BackupRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupRequest,
      com.uwei.easy_core.InstanceProto.Response> getBackupMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupRequest, com.uwei.easy_core.InstanceProto.Response> getBackupMethod;
    if ((getBackupMethod = databaseGrpc.getBackupMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getBackupMethod = databaseGrpc.getBackupMethod) == null) {
          databaseGrpc.getBackupMethod = getBackupMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.DatabaseProto.BackupRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "backup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.BackupRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("backup"))
              .build();
        }
      }
    }
    return getBackupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupAllRequest,
      com.uwei.easy_core.InstanceProto.Response> getBackupAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "backup_all",
      requestType = com.uwei.easy_core.DatabaseProto.BackupAllRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupAllRequest,
      com.uwei.easy_core.InstanceProto.Response> getBackupAllMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.BackupAllRequest, com.uwei.easy_core.InstanceProto.Response> getBackupAllMethod;
    if ((getBackupAllMethod = databaseGrpc.getBackupAllMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getBackupAllMethod = databaseGrpc.getBackupAllMethod) == null) {
          databaseGrpc.getBackupAllMethod = getBackupAllMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.DatabaseProto.BackupAllRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "backup_all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.BackupAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("backup_all"))
              .build();
        }
      }
    }
    return getBackupAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.RestoreRequest,
      com.uwei.easy_core.InstanceProto.Response> getRestoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "restore",
      requestType = com.uwei.easy_core.DatabaseProto.RestoreRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.RestoreRequest,
      com.uwei.easy_core.InstanceProto.Response> getRestoreMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.RestoreRequest, com.uwei.easy_core.InstanceProto.Response> getRestoreMethod;
    if ((getRestoreMethod = databaseGrpc.getRestoreMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getRestoreMethod = databaseGrpc.getRestoreMethod) == null) {
          databaseGrpc.getRestoreMethod = getRestoreMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.DatabaseProto.RestoreRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "restore"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.RestoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("restore"))
              .build();
        }
      }
    }
    return getRestoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.ListRequest,
      com.uwei.easy_core.DatabaseProto.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.uwei.easy_core.DatabaseProto.ListRequest.class,
      responseType = com.uwei.easy_core.DatabaseProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.ListRequest,
      com.uwei.easy_core.DatabaseProto.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.DatabaseProto.ListRequest, com.uwei.easy_core.DatabaseProto.ListResponse> getListMethod;
    if ((getListMethod = databaseGrpc.getListMethod) == null) {
      synchronized (databaseGrpc.class) {
        if ((getListMethod = databaseGrpc.getListMethod) == null) {
          databaseGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.DatabaseProto.ListRequest, com.uwei.easy_core.DatabaseProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.DatabaseProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new databaseMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
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
    public void create(com.uwei.easy_core.DatabaseProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void backup(com.uwei.easy_core.DatabaseProto.BackupRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getBackupMethod(), responseObserver);
    }

    /**
     */
    public void backupAll(com.uwei.easy_core.DatabaseProto.BackupAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getBackupAllMethod(), responseObserver);
    }

    /**
     */
    public void restore(com.uwei.easy_core.DatabaseProto.RestoreRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRestoreMethod(), responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_core.DatabaseProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.DatabaseProto.CreateRequest,
                com.uwei.easy_core.DatabaseProto.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getBackupMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.DatabaseProto.BackupRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_BACKUP)))
          .addMethod(
            getBackupAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.DatabaseProto.BackupAllRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_BACKUP_ALL)))
          .addMethod(
            getRestoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.DatabaseProto.RestoreRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_RESTORE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.DatabaseProto.ListRequest,
                com.uwei.easy_core.DatabaseProto.ListResponse>(
                  this, METHODID_LIST)))
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
    public void create(com.uwei.easy_core.DatabaseProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void backup(com.uwei.easy_core.DatabaseProto.BackupRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void backupAll(com.uwei.easy_core.DatabaseProto.BackupAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBackupAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restore(com.uwei.easy_core.DatabaseProto.RestoreRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_core.DatabaseProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
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
    public com.uwei.easy_core.DatabaseProto.CreateResponse create(com.uwei.easy_core.DatabaseProto.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response backup(com.uwei.easy_core.DatabaseProto.BackupRequest request) {
      return blockingUnaryCall(
          getChannel(), getBackupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response backupAll(com.uwei.easy_core.DatabaseProto.BackupAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getBackupAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response restore(com.uwei.easy_core.DatabaseProto.RestoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getRestoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.DatabaseProto.ListResponse list(com.uwei.easy_core.DatabaseProto.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.DatabaseProto.CreateResponse> create(
        com.uwei.easy_core.DatabaseProto.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> backup(
        com.uwei.easy_core.DatabaseProto.BackupRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBackupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> backupAll(
        com.uwei.easy_core.DatabaseProto.BackupAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBackupAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> restore(
        com.uwei.easy_core.DatabaseProto.RestoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRestoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.DatabaseProto.ListResponse> list(
        com.uwei.easy_core.DatabaseProto.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_BACKUP = 1;
  private static final int METHODID_BACKUP_ALL = 2;
  private static final int METHODID_RESTORE = 3;
  private static final int METHODID_LIST = 4;

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
          serviceImpl.create((com.uwei.easy_core.DatabaseProto.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.CreateResponse>) responseObserver);
          break;
        case METHODID_BACKUP:
          serviceImpl.backup((com.uwei.easy_core.DatabaseProto.BackupRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_BACKUP_ALL:
          serviceImpl.backupAll((com.uwei.easy_core.DatabaseProto.BackupAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_RESTORE:
          serviceImpl.restore((com.uwei.easy_core.DatabaseProto.RestoreRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.uwei.easy_core.DatabaseProto.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.DatabaseProto.ListResponse>) responseObserver);
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
      return com.uwei.easy_core.DatabaseProto.getDescriptor();
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
              .addMethod(getBackupMethod())
              .addMethod(getBackupAllMethod())
              .addMethod(getRestoreMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
