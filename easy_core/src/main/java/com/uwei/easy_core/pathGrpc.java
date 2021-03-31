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
    comments = "Source: path.proto")
public final class pathGrpc {

  private pathGrpc() {}

  public static final String SERVICE_NAME = "path.path";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest,
      com.uwei.easy_core.PathProto.PathResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.uwei.easy_core.PathProto.PathRequest.class,
      responseType = com.uwei.easy_core.PathProto.PathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest,
      com.uwei.easy_core.PathProto.PathResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest, com.uwei.easy_core.PathProto.PathResponse> getGetMethod;
    if ((getGetMethod = pathGrpc.getGetMethod) == null) {
      synchronized (pathGrpc.class) {
        if ((getGetMethod = pathGrpc.getGetMethod) == null) {
          pathGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.PathProto.PathRequest, com.uwei.easy_core.PathProto.PathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.PathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.PathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new pathMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest,
      com.uwei.easy_core.PathProto.PathResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_all",
      requestType = com.uwei.easy_core.PathProto.PathRequest.class,
      responseType = com.uwei.easy_core.PathProto.PathResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest,
      com.uwei.easy_core.PathProto.PathResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.PathRequest, com.uwei.easy_core.PathProto.PathResponse> getGetAllMethod;
    if ((getGetAllMethod = pathGrpc.getGetAllMethod) == null) {
      synchronized (pathGrpc.class) {
        if ((getGetAllMethod = pathGrpc.getGetAllMethod) == null) {
          pathGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.PathProto.PathRequest, com.uwei.easy_core.PathProto.PathResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.PathRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.PathResponse.getDefaultInstance()))
              .setSchemaDescriptor(new pathMethodDescriptorSupplier("get_all"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.GraphRequest,
      com.uwei.easy_core.PathProto.GraphResponse> getGetGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_graph",
      requestType = com.uwei.easy_core.PathProto.GraphRequest.class,
      responseType = com.uwei.easy_core.PathProto.GraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.GraphRequest,
      com.uwei.easy_core.PathProto.GraphResponse> getGetGraphMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.GraphRequest, com.uwei.easy_core.PathProto.GraphResponse> getGetGraphMethod;
    if ((getGetGraphMethod = pathGrpc.getGetGraphMethod) == null) {
      synchronized (pathGrpc.class) {
        if ((getGetGraphMethod = pathGrpc.getGetGraphMethod) == null) {
          pathGrpc.getGetGraphMethod = getGetGraphMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.PathProto.GraphRequest, com.uwei.easy_core.PathProto.GraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_graph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.GraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.GraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new pathMethodDescriptorSupplier("get_graph"))
              .build();
        }
      }
    }
    return getGetGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest,
      com.uwei.easy_core.PathProto.GraphResponse> getTraverseGraphMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "traverse_graph",
      requestType = com.uwei.easy_core.PathProto.TraverseGraphRequest.class,
      responseType = com.uwei.easy_core.PathProto.GraphResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest,
      com.uwei.easy_core.PathProto.GraphResponse> getTraverseGraphMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest, com.uwei.easy_core.PathProto.GraphResponse> getTraverseGraphMethod;
    if ((getTraverseGraphMethod = pathGrpc.getTraverseGraphMethod) == null) {
      synchronized (pathGrpc.class) {
        if ((getTraverseGraphMethod = pathGrpc.getTraverseGraphMethod) == null) {
          pathGrpc.getTraverseGraphMethod = getTraverseGraphMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.PathProto.TraverseGraphRequest, com.uwei.easy_core.PathProto.GraphResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "traverse_graph"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.TraverseGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.GraphResponse.getDefaultInstance()))
              .setSchemaDescriptor(new pathMethodDescriptorSupplier("traverse_graph"))
              .build();
        }
      }
    }
    return getTraverseGraphMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest,
      com.uwei.easy_core.PathProto.CountNodeResponse> getCountNodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count_node",
      requestType = com.uwei.easy_core.PathProto.TraverseGraphRequest.class,
      responseType = com.uwei.easy_core.PathProto.CountNodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest,
      com.uwei.easy_core.PathProto.CountNodeResponse> getCountNodeMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.PathProto.TraverseGraphRequest, com.uwei.easy_core.PathProto.CountNodeResponse> getCountNodeMethod;
    if ((getCountNodeMethod = pathGrpc.getCountNodeMethod) == null) {
      synchronized (pathGrpc.class) {
        if ((getCountNodeMethod = pathGrpc.getCountNodeMethod) == null) {
          pathGrpc.getCountNodeMethod = getCountNodeMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.PathProto.TraverseGraphRequest, com.uwei.easy_core.PathProto.CountNodeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count_node"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.TraverseGraphRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.PathProto.CountNodeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new pathMethodDescriptorSupplier("count_node"))
              .build();
        }
      }
    }
    return getCountNodeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static pathStub newStub(io.grpc.Channel channel) {
    return new pathStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static pathBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new pathBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static pathFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new pathFutureStub(channel);
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static abstract class pathImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 精确查询
     * </pre>
     */
    public void get(com.uwei.easy_core.PathProto.PathRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     * 全量查询
     * </pre>
     */
    public void getAll(com.uwei.easy_core.PathProto.PathRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 返回图结构
     * </pre>
     */
    public void getGraph(com.uwei.easy_core.PathProto.GraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历 返回图结构
     * </pre>
     */
    public void traverseGraph(com.uwei.easy_core.PathProto.TraverseGraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTraverseGraphMethod(), responseObserver);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历,统计叶子节点个数
     * </pre>
     */
    public void countNode(com.uwei.easy_core.PathProto.TraverseGraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.CountNodeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountNodeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.PathProto.PathRequest,
                com.uwei.easy_core.PathProto.PathResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.PathProto.PathRequest,
                com.uwei.easy_core.PathProto.PathResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.PathProto.GraphRequest,
                com.uwei.easy_core.PathProto.GraphResponse>(
                  this, METHODID_GET_GRAPH)))
          .addMethod(
            getTraverseGraphMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.PathProto.TraverseGraphRequest,
                com.uwei.easy_core.PathProto.GraphResponse>(
                  this, METHODID_TRAVERSE_GRAPH)))
          .addMethod(
            getCountNodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.PathProto.TraverseGraphRequest,
                com.uwei.easy_core.PathProto.CountNodeResponse>(
                  this, METHODID_COUNT_NODE)))
          .build();
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class pathStub extends io.grpc.stub.AbstractStub<pathStub> {
    private pathStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pathStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pathStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pathStub(channel, callOptions);
    }

    /**
     * <pre>
     * 精确查询
     * </pre>
     */
    public void get(com.uwei.easy_core.PathProto.PathRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 全量查询
     * </pre>
     */
    public void getAll(com.uwei.easy_core.PathProto.PathRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 返回图结构
     * </pre>
     */
    public void getGraph(com.uwei.easy_core.PathProto.GraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历 返回图结构
     * </pre>
     */
    public void traverseGraph(com.uwei.easy_core.PathProto.TraverseGraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTraverseGraphMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历,统计叶子节点个数
     * </pre>
     */
    public void countNode(com.uwei.easy_core.PathProto.TraverseGraphRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.CountNodeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountNodeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class pathBlockingStub extends io.grpc.stub.AbstractStub<pathBlockingStub> {
    private pathBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pathBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pathBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pathBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 精确查询
     * </pre>
     */
    public com.uwei.easy_core.PathProto.PathResponse get(com.uwei.easy_core.PathProto.PathRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 全量查询
     * </pre>
     */
    public com.uwei.easy_core.PathProto.PathResponse getAll(com.uwei.easy_core.PathProto.PathRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 返回图结构
     * </pre>
     */
    public com.uwei.easy_core.PathProto.GraphResponse getGraph(com.uwei.easy_core.PathProto.GraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历 返回图结构
     * </pre>
     */
    public com.uwei.easy_core.PathProto.GraphResponse traverseGraph(com.uwei.easy_core.PathProto.TraverseGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getTraverseGraphMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历,统计叶子节点个数
     * </pre>
     */
    public com.uwei.easy_core.PathProto.CountNodeResponse countNode(com.uwei.easy_core.PathProto.TraverseGraphRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountNodeMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class pathFutureStub extends io.grpc.stub.AbstractStub<pathFutureStub> {
    private pathFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private pathFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected pathFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new pathFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 精确查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.PathProto.PathResponse> get(
        com.uwei.easy_core.PathProto.PathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 全量查询
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.PathProto.PathResponse> getAll(
        com.uwei.easy_core.PathProto.PathRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 返回图结构
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.PathProto.GraphResponse> getGraph(
        com.uwei.easy_core.PathProto.GraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历 返回图结构
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.PathProto.GraphResponse> traverseGraph(
        com.uwei.easy_core.PathProto.TraverseGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTraverseGraphMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 由点(实例)通过指定查询条件向指定的关系发散遍历,统计叶子节点个数
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.PathProto.CountNodeResponse> countNode(
        com.uwei.easy_core.PathProto.TraverseGraphRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountNodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET_GRAPH = 2;
  private static final int METHODID_TRAVERSE_GRAPH = 3;
  private static final int METHODID_COUNT_NODE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final pathImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(pathImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.uwei.easy_core.PathProto.PathRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.uwei.easy_core.PathProto.PathRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.PathResponse>) responseObserver);
          break;
        case METHODID_GET_GRAPH:
          serviceImpl.getGraph((com.uwei.easy_core.PathProto.GraphRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse>) responseObserver);
          break;
        case METHODID_TRAVERSE_GRAPH:
          serviceImpl.traverseGraph((com.uwei.easy_core.PathProto.TraverseGraphRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.GraphResponse>) responseObserver);
          break;
        case METHODID_COUNT_NODE:
          serviceImpl.countNode((com.uwei.easy_core.PathProto.TraverseGraphRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.PathProto.CountNodeResponse>) responseObserver);
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

  private static abstract class pathBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    pathBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.PathProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("path");
    }
  }

  private static final class pathFileDescriptorSupplier
      extends pathBaseDescriptorSupplier {
    pathFileDescriptorSupplier() {}
  }

  private static final class pathMethodDescriptorSupplier
      extends pathBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    pathMethodDescriptorSupplier(String methodName) {
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
      synchronized (pathGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new pathFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetGraphMethod())
              .addMethod(getTraverseGraphMethod())
              .addMethod(getCountNodeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
