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
 * 实例相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: ts_data.proto")
public final class ts_dataGrpc {

  private ts_dataGrpc() {}

  public static final String SERVICE_NAME = "ts_data.ts_data";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.InsertRequest,
      com.uwei.easy_tsdb.TsDataProto.InsertResponse> getInsertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "insert",
      requestType = com.uwei.easy_tsdb.TsDataProto.InsertRequest.class,
      responseType = com.uwei.easy_tsdb.TsDataProto.InsertResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.InsertRequest,
      com.uwei.easy_tsdb.TsDataProto.InsertResponse> getInsertMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.InsertRequest, com.uwei.easy_tsdb.TsDataProto.InsertResponse> getInsertMethod;
    if ((getInsertMethod = ts_dataGrpc.getInsertMethod) == null) {
      synchronized (ts_dataGrpc.class) {
        if ((getInsertMethod = ts_dataGrpc.getInsertMethod) == null) {
          ts_dataGrpc.getInsertMethod = getInsertMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.TsDataProto.InsertRequest, com.uwei.easy_tsdb.TsDataProto.InsertResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "insert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.InsertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.InsertResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ts_dataMethodDescriptorSupplier("insert"))
              .build();
        }
      }
    }
    return getInsertMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchRawDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_raw_data",
      requestType = com.uwei.easy_tsdb.TsDataProto.SearchRawRequest.class,
      responseType = com.uwei.easy_tsdb.TsDataProto.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchRawDataMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawRequest, com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchRawDataMethod;
    if ((getSearchRawDataMethod = ts_dataGrpc.getSearchRawDataMethod) == null) {
      synchronized (ts_dataGrpc.class) {
        if ((getSearchRawDataMethod = ts_dataGrpc.getSearchRawDataMethod) == null) {
          ts_dataGrpc.getSearchRawDataMethod = getSearchRawDataMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.TsDataProto.SearchRawRequest, com.uwei.easy_tsdb.TsDataProto.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_raw_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchRawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ts_dataMethodDescriptorSupplier("search_raw_data"))
              .build();
        }
      }
    }
    return getSearchRawDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.uwei.easy_tsdb.TsDataProto.SearchRequest.class,
      responseType = com.uwei.easy_tsdb.TsDataProto.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRequest, com.uwei.easy_tsdb.TsDataProto.SearchResponse> getSearchMethod;
    if ((getSearchMethod = ts_dataGrpc.getSearchMethod) == null) {
      synchronized (ts_dataGrpc.class) {
        if ((getSearchMethod = ts_dataGrpc.getSearchMethod) == null) {
          ts_dataGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.TsDataProto.SearchRequest, com.uwei.easy_tsdb.TsDataProto.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ts_dataMethodDescriptorSupplier("search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> getSearchInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_instance",
      requestType = com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest.class,
      responseType = com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> getSearchInstanceMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest, com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> getSearchInstanceMethod;
    if ((getSearchInstanceMethod = ts_dataGrpc.getSearchInstanceMethod) == null) {
      synchronized (ts_dataGrpc.class) {
        if ((getSearchInstanceMethod = ts_dataGrpc.getSearchInstanceMethod) == null) {
          ts_dataGrpc.getSearchInstanceMethod = getSearchInstanceMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest, com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_instance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp.getDefaultInstance()))
              .setSchemaDescriptor(new ts_dataMethodDescriptorSupplier("search_instance"))
              .build();
        }
      }
    }
    return getSearchInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_raw_metrics_data",
      requestType = com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest.class,
      responseType = com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest,
      com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest, com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod;
    if ((getSearchRawMetricsDataMethod = ts_dataGrpc.getSearchRawMetricsDataMethod) == null) {
      synchronized (ts_dataGrpc.class) {
        if ((getSearchRawMetricsDataMethod = ts_dataGrpc.getSearchRawMetricsDataMethod) == null) {
          ts_dataGrpc.getSearchRawMetricsDataMethod = getSearchRawMetricsDataMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest, com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_raw_metrics_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ts_dataMethodDescriptorSupplier("search_raw_metrics_data"))
              .build();
        }
      }
    }
    return getSearchRawMetricsDataMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ts_dataStub newStub(io.grpc.Channel channel) {
    return new ts_dataStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ts_dataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ts_dataBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ts_dataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ts_dataFutureStub(channel);
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static abstract class ts_dataImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *插入实例
     * </pre>
     */
    public void insert(com.uwei.easy_tsdb.TsDataProto.InsertRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.InsertResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInsertMethod(), responseObserver);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public void searchRawData(com.uwei.easy_tsdb.TsDataProto.SearchRawRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchRawDataMethod(), responseObserver);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public void search(com.uwei.easy_tsdb.TsDataProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     *查询实例
     * </pre>
     */
    public void searchInstance(com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchInstanceMethod(), responseObserver);
    }

    /**
     */
    public void searchRawMetricsData(com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchRawMetricsDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInsertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.TsDataProto.InsertRequest,
                com.uwei.easy_tsdb.TsDataProto.InsertResponse>(
                  this, METHODID_INSERT)))
          .addMethod(
            getSearchRawDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.TsDataProto.SearchRawRequest,
                com.uwei.easy_tsdb.TsDataProto.SearchResponse>(
                  this, METHODID_SEARCH_RAW_DATA)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.TsDataProto.SearchRequest,
                com.uwei.easy_tsdb.TsDataProto.SearchResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest,
                com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp>(
                  this, METHODID_SEARCH_INSTANCE)))
          .addMethod(
            getSearchRawMetricsDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest,
                com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse>(
                  this, METHODID_SEARCH_RAW_METRICS_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class ts_dataStub extends io.grpc.stub.AbstractStub<ts_dataStub> {
    private ts_dataStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ts_dataStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ts_dataStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ts_dataStub(channel, callOptions);
    }

    /**
     * <pre>
     *插入实例
     * </pre>
     */
    public void insert(com.uwei.easy_tsdb.TsDataProto.InsertRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.InsertResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public void searchRawData(com.uwei.easy_tsdb.TsDataProto.SearchRawRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchRawDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public void search(com.uwei.easy_tsdb.TsDataProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *查询实例
     * </pre>
     */
    public void searchInstance(com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchRawMetricsData(com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchRawMetricsDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class ts_dataBlockingStub extends io.grpc.stub.AbstractStub<ts_dataBlockingStub> {
    private ts_dataBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ts_dataBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ts_dataBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ts_dataBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *插入实例
     * </pre>
     */
    public com.uwei.easy_tsdb.TsDataProto.InsertResponse insert(com.uwei.easy_tsdb.TsDataProto.InsertRequest request) {
      return blockingUnaryCall(
          getChannel(), getInsertMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public com.uwei.easy_tsdb.TsDataProto.SearchResponse searchRawData(com.uwei.easy_tsdb.TsDataProto.SearchRawRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchRawDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public com.uwei.easy_tsdb.TsDataProto.SearchResponse search(com.uwei.easy_tsdb.TsDataProto.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *查询实例
     * </pre>
     */
    public com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp searchInstance(com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse searchRawMetricsData(com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchRawMetricsDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class ts_dataFutureStub extends io.grpc.stub.AbstractStub<ts_dataFutureStub> {
    private ts_dataFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ts_dataFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ts_dataFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ts_dataFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *插入实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.TsDataProto.InsertResponse> insert(
        com.uwei.easy_tsdb.TsDataProto.InsertRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInsertMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.TsDataProto.SearchResponse> searchRawData(
        com.uwei.easy_tsdb.TsDataProto.SearchRawRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchRawDataMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *search ts
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.TsDataProto.SearchResponse> search(
        com.uwei.easy_tsdb.TsDataProto.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *查询实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp> searchInstance(
        com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse> searchRawMetricsData(
        com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchRawMetricsDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INSERT = 0;
  private static final int METHODID_SEARCH_RAW_DATA = 1;
  private static final int METHODID_SEARCH = 2;
  private static final int METHODID_SEARCH_INSTANCE = 3;
  private static final int METHODID_SEARCH_RAW_METRICS_DATA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ts_dataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ts_dataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INSERT:
          serviceImpl.insert((com.uwei.easy_tsdb.TsDataProto.InsertRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.InsertResponse>) responseObserver);
          break;
        case METHODID_SEARCH_RAW_DATA:
          serviceImpl.searchRawData((com.uwei.easy_tsdb.TsDataProto.SearchRawRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.uwei.easy_tsdb.TsDataProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchResponse>) responseObserver);
          break;
        case METHODID_SEARCH_INSTANCE:
          serviceImpl.searchInstance((com.uwei.easy_tsdb.TsDataProto.SearchInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchInstanceResp>) responseObserver);
          break;
        case METHODID_SEARCH_RAW_METRICS_DATA:
          serviceImpl.searchRawMetricsData((com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_tsdb.TsDataProto.SearchRawMetricsDataResponse>) responseObserver);
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

  private static abstract class ts_dataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ts_dataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_tsdb.TsDataProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ts_data");
    }
  }

  private static final class ts_dataFileDescriptorSupplier
      extends ts_dataBaseDescriptorSupplier {
    ts_dataFileDescriptorSupplier() {}
  }

  private static final class ts_dataMethodDescriptorSupplier
      extends ts_dataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ts_dataMethodDescriptorSupplier(String methodName) {
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
      synchronized (ts_dataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ts_dataFileDescriptorSupplier())
              .addMethod(getInsertMethod())
              .addMethod(getSearchRawDataMethod())
              .addMethod(getSearchMethod())
              .addMethod(getSearchInstanceMethod())
              .addMethod(getSearchRawMetricsDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
