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
 * 指标相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: metric.proto")
public final class metricGrpc {

  private metricGrpc() {}

  public static final String SERVICE_NAME = "metric.metric";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchCreateRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batch_create",
      requestType = com.uwei.easy_tsdb.MetricProto.BatchCreateRequest.class,
      responseType = com.uwei.easy_tsdb.MetricProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchCreateRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchCreateRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchCreateMethod;
    if ((getBatchCreateMethod = metricGrpc.getBatchCreateMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getBatchCreateMethod = metricGrpc.getBatchCreateMethod) == null) {
          metricGrpc.getBatchCreateMethod = getBatchCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.MetricProto.BatchCreateRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batch_create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.BatchCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("batch_create"))
              .build();
        }
      }
    }
    return getBatchCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batch_update",
      requestType = com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest.class,
      responseType = com.uwei.easy_tsdb.MetricProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchUpdateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchUpdateMethod;
    if ((getBatchUpdateMethod = metricGrpc.getBatchUpdateMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getBatchUpdateMethod = metricGrpc.getBatchUpdateMethod) == null) {
          metricGrpc.getBatchUpdateMethod = getBatchUpdateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batch_update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("batch_update"))
              .build();
        }
      }
    }
    return getBatchUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "batch_delete",
      requestType = com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest.class,
      responseType = com.uwei.easy_tsdb.MetricProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest,
      com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse> getBatchDeleteMethod;
    if ((getBatchDeleteMethod = metricGrpc.getBatchDeleteMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getBatchDeleteMethod = metricGrpc.getBatchDeleteMethod) == null) {
          metricGrpc.getBatchDeleteMethod = getBatchDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest, com.uwei.easy_tsdb.MetricProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "batch_delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.MetricProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("batch_delete"))
              .build();
        }
      }
    }
    return getBatchDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static metricStub newStub(io.grpc.Channel channel) {
    return new metricStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static metricBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new metricBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static metricFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new metricFutureStub(channel);
  }

  /**
   * <pre>
   * 指标相关接口
   * </pre>
   */
  public static abstract class metricImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 批量创建指标
     * </pre>
     */
    public void batchCreate(com.uwei.easy_tsdb.MetricProto.BatchCreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量更新指标
     * </pre>
     */
    public void batchUpdate(com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量删除指标
     * </pre>
     */
    public void batchDelete(com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBatchDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBatchCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.MetricProto.BatchCreateRequest,
                com.uwei.easy_tsdb.MetricProto.MetricResponse>(
                  this, METHODID_BATCH_CREATE)))
          .addMethod(
            getBatchUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest,
                com.uwei.easy_tsdb.MetricProto.MetricResponse>(
                  this, METHODID_BATCH_UPDATE)))
          .addMethod(
            getBatchDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest,
                com.uwei.easy_tsdb.MetricProto.MetricResponse>(
                  this, METHODID_BATCH_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * 指标相关接口
   * </pre>
   */
  public static final class metricStub extends io.grpc.stub.AbstractStub<metricStub> {
    private metricStub(io.grpc.Channel channel) {
      super(channel);
    }

    private metricStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected metricStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new metricStub(channel, callOptions);
    }

    /**
     * <pre>
     * 批量创建指标
     * </pre>
     */
    public void batchCreate(com.uwei.easy_tsdb.MetricProto.BatchCreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量更新指标
     * </pre>
     */
    public void batchUpdate(com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量删除指标
     * </pre>
     */
    public void batchDelete(com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 指标相关接口
   * </pre>
   */
  public static final class metricBlockingStub extends io.grpc.stub.AbstractStub<metricBlockingStub> {
    private metricBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private metricBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected metricBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new metricBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 批量创建指标
     * </pre>
     */
    public com.uwei.easy_tsdb.MetricProto.MetricResponse batchCreate(com.uwei.easy_tsdb.MetricProto.BatchCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量更新指标
     * </pre>
     */
    public com.uwei.easy_tsdb.MetricProto.MetricResponse batchUpdate(com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量删除指标
     * </pre>
     */
    public com.uwei.easy_tsdb.MetricProto.MetricResponse batchDelete(com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getBatchDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 指标相关接口
   * </pre>
   */
  public static final class metricFutureStub extends io.grpc.stub.AbstractStub<metricFutureStub> {
    private metricFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private metricFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected metricFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new metricFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 批量创建指标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.MetricProto.MetricResponse> batchCreate(
        com.uwei.easy_tsdb.MetricProto.BatchCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量更新指标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.MetricProto.MetricResponse> batchUpdate(
        com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量删除指标
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.MetricProto.MetricResponse> batchDelete(
        com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBatchDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BATCH_CREATE = 0;
  private static final int METHODID_BATCH_UPDATE = 1;
  private static final int METHODID_BATCH_DELETE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final metricImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(metricImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BATCH_CREATE:
          serviceImpl.batchCreate((com.uwei.easy_tsdb.MetricProto.BatchCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse>) responseObserver);
          break;
        case METHODID_BATCH_UPDATE:
          serviceImpl.batchUpdate((com.uwei.easy_tsdb.MetricProto.BatchUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse>) responseObserver);
          break;
        case METHODID_BATCH_DELETE:
          serviceImpl.batchDelete((com.uwei.easy_tsdb.MetricProto.BatchDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.MetricProto.MetricResponse>) responseObserver);
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

  private static abstract class metricBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    metricBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_tsdb.MetricProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("metric");
    }
  }

  private static final class metricFileDescriptorSupplier
      extends metricBaseDescriptorSupplier {
    metricFileDescriptorSupplier() {}
  }

  private static final class metricMethodDescriptorSupplier
      extends metricBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    metricMethodDescriptorSupplier(String methodName) {
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
      synchronized (metricGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new metricFileDescriptorSupplier())
              .addMethod(getBatchCreateMethod())
              .addMethod(getBatchUpdateMethod())
              .addMethod(getBatchDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
