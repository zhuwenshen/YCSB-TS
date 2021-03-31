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
 * 实例相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: metric.proto")
public final class metricGrpc {

  private metricGrpc() {}

  public static final String SERVICE_NAME = "metric.metric";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRequest,
      com.uwei.easy_core.MetricProto.SearchSimpleResponse> getSearchMetricMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_metric",
      requestType = com.uwei.easy_core.MetricProto.SearchRequest.class,
      responseType = com.uwei.easy_core.MetricProto.SearchSimpleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRequest,
      com.uwei.easy_core.MetricProto.SearchSimpleResponse> getSearchMetricMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRequest, com.uwei.easy_core.MetricProto.SearchSimpleResponse> getSearchMetricMethod;
    if ((getSearchMetricMethod = metricGrpc.getSearchMetricMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getSearchMetricMethod = metricGrpc.getSearchMetricMethod) == null) {
          metricGrpc.getSearchMetricMethod = getSearchMetricMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.MetricProto.SearchRequest, com.uwei.easy_core.MetricProto.SearchSimpleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_metric"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchSimpleResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("search_metric"))
              .build();
        }
      }
    }
    return getSearchMetricMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRowRequest,
      com.uwei.easy_core.MetricProto.SearchResponse> getSearchMetricRowDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_metric_row_data",
      requestType = com.uwei.easy_core.MetricProto.SearchRowRequest.class,
      responseType = com.uwei.easy_core.MetricProto.SearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRowRequest,
      com.uwei.easy_core.MetricProto.SearchResponse> getSearchMetricRowDataMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRowRequest, com.uwei.easy_core.MetricProto.SearchResponse> getSearchMetricRowDataMethod;
    if ((getSearchMetricRowDataMethod = metricGrpc.getSearchMetricRowDataMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getSearchMetricRowDataMethod = metricGrpc.getSearchMetricRowDataMethod) == null) {
          metricGrpc.getSearchMetricRowDataMethod = getSearchMetricRowDataMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.MetricProto.SearchRowRequest, com.uwei.easy_core.MetricProto.SearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_metric_row_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchRowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("search_metric_row_data"))
              .build();
        }
      }
    }
    return getSearchMetricRowDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.OlapRequest,
      com.uwei.easy_core.MetricProto.OlapResponse> getOlapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "olap",
      requestType = com.uwei.easy_core.MetricProto.OlapRequest.class,
      responseType = com.uwei.easy_core.MetricProto.OlapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.OlapRequest,
      com.uwei.easy_core.MetricProto.OlapResponse> getOlapMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.OlapRequest, com.uwei.easy_core.MetricProto.OlapResponse> getOlapMethod;
    if ((getOlapMethod = metricGrpc.getOlapMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getOlapMethod = metricGrpc.getOlapMethod) == null) {
          metricGrpc.getOlapMethod = getOlapMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.MetricProto.OlapRequest, com.uwei.easy_core.MetricProto.OlapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "olap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.OlapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.OlapResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("olap"))
              .build();
        }
      }
    }
    return getOlapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest,
      com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_raw_metrics_data",
      requestType = com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest.class,
      responseType = com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest,
      com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest, com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> getSearchRawMetricsDataMethod;
    if ((getSearchRawMetricsDataMethod = metricGrpc.getSearchRawMetricsDataMethod) == null) {
      synchronized (metricGrpc.class) {
        if ((getSearchRawMetricsDataMethod = metricGrpc.getSearchRawMetricsDataMethod) == null) {
          metricGrpc.getSearchRawMetricsDataMethod = getSearchRawMetricsDataMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest, com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_raw_metrics_data"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new metricMethodDescriptorSupplier("search_raw_metrics_data"))
              .build();
        }
      }
    }
    return getSearchRawMetricsDataMethod;
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
   * 实例相关接口
   * </pre>
   */
  public static abstract class metricImplBase implements io.grpc.BindableService {

    /**
     */
    public void searchMetric(com.uwei.easy_core.MetricProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchSimpleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMetricMethod(), responseObserver);
    }

    /**
     */
    public void searchMetricRowData(com.uwei.easy_core.MetricProto.SearchRowRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMetricRowDataMethod(), responseObserver);
    }

    /**
     */
    public void olap(com.uwei.easy_core.MetricProto.OlapRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.OlapResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getOlapMethod(), responseObserver);
    }

    /**
     * <pre>
     * 透传tsdb，多指标查询
     * </pre>
     */
    public void searchRawMetricsData(com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchRawMetricsDataMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSearchMetricMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.MetricProto.SearchRequest,
                com.uwei.easy_core.MetricProto.SearchSimpleResponse>(
                  this, METHODID_SEARCH_METRIC)))
          .addMethod(
            getSearchMetricRowDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.MetricProto.SearchRowRequest,
                com.uwei.easy_core.MetricProto.SearchResponse>(
                  this, METHODID_SEARCH_METRIC_ROW_DATA)))
          .addMethod(
            getOlapMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.MetricProto.OlapRequest,
                com.uwei.easy_core.MetricProto.OlapResponse>(
                  this, METHODID_OLAP)))
          .addMethod(
            getSearchRawMetricsDataMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest,
                com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse>(
                  this, METHODID_SEARCH_RAW_METRICS_DATA)))
          .build();
    }
  }

  /**
   * <pre>
   * 实例相关接口
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
     */
    public void searchMetric(com.uwei.easy_core.MetricProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchSimpleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMetricMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchMetricRowData(com.uwei.easy_core.MetricProto.SearchRowRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMetricRowDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void olap(com.uwei.easy_core.MetricProto.OlapRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.OlapResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getOlapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 透传tsdb，多指标查询
     * </pre>
     */
    public void searchRawMetricsData(com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchRawMetricsDataMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 实例相关接口
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
     */
    public com.uwei.easy_core.MetricProto.SearchSimpleResponse searchMetric(com.uwei.easy_core.MetricProto.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMetricMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.MetricProto.SearchResponse searchMetricRowData(com.uwei.easy_core.MetricProto.SearchRowRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMetricRowDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.MetricProto.OlapResponse olap(com.uwei.easy_core.MetricProto.OlapRequest request) {
      return blockingUnaryCall(
          getChannel(), getOlapMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 透传tsdb，多指标查询
     * </pre>
     */
    public com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse searchRawMetricsData(com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchRawMetricsDataMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 实例相关接口
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.MetricProto.SearchSimpleResponse> searchMetric(
        com.uwei.easy_core.MetricProto.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMetricMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.MetricProto.SearchResponse> searchMetricRowData(
        com.uwei.easy_core.MetricProto.SearchRowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMetricRowDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.MetricProto.OlapResponse> olap(
        com.uwei.easy_core.MetricProto.OlapRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getOlapMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 透传tsdb，多指标查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse> searchRawMetricsData(
        com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchRawMetricsDataMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEARCH_METRIC = 0;
  private static final int METHODID_SEARCH_METRIC_ROW_DATA = 1;
  private static final int METHODID_OLAP = 2;
  private static final int METHODID_SEARCH_RAW_METRICS_DATA = 3;

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
        case METHODID_SEARCH_METRIC:
          serviceImpl.searchMetric((com.uwei.easy_core.MetricProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchSimpleResponse>) responseObserver);
          break;
        case METHODID_SEARCH_METRIC_ROW_DATA:
          serviceImpl.searchMetricRowData((com.uwei.easy_core.MetricProto.SearchRowRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchResponse>) responseObserver);
          break;
        case METHODID_OLAP:
          serviceImpl.olap((com.uwei.easy_core.MetricProto.OlapRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.OlapResponse>) responseObserver);
          break;
        case METHODID_SEARCH_RAW_METRICS_DATA:
          serviceImpl.searchRawMetricsData((com.uwei.easy_core.MetricProto.SearchRawMetricsDataRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.MetricProto.SearchRawMetricsDataResponse>) responseObserver);
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
      return com.uwei.easy_core.MetricProto.getDescriptor();
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
              .addMethod(getSearchMetricMethod())
              .addMethod(getSearchMetricRowDataMethod())
              .addMethod(getOlapMethod())
              .addMethod(getSearchRawMetricsDataMethod())
              .build();
        }
      }
    }
    return result;
  }
}
