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
 * 关系相关接口
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: relation.proto")
public final class relationGrpc {

  private relationGrpc() {}

  public static final String SERVICE_NAME = "relation.relation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetRequest,
      com.uwei.easy_core.RelationProto.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.uwei.easy_core.RelationProto.GetRequest.class,
      responseType = com.uwei.easy_core.RelationProto.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetRequest,
      com.uwei.easy_core.RelationProto.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetRequest, com.uwei.easy_core.RelationProto.GetResponse> getGetMethod;
    if ((getGetMethod = relationGrpc.getGetMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getGetMethod = relationGrpc.getGetMethod) == null) {
          relationGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.GetRequest, com.uwei.easy_core.RelationProto.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.AddPropertyRequest,
      com.uwei.easy_core.RelationProto.PropertyResponse> getAddPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add_property",
      requestType = com.uwei.easy_core.RelationProto.AddPropertyRequest.class,
      responseType = com.uwei.easy_core.RelationProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.AddPropertyRequest,
      com.uwei.easy_core.RelationProto.PropertyResponse> getAddPropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.AddPropertyRequest, com.uwei.easy_core.RelationProto.PropertyResponse> getAddPropertyMethod;
    if ((getAddPropertyMethod = relationGrpc.getAddPropertyMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getAddPropertyMethod = relationGrpc.getAddPropertyMethod) == null) {
          relationGrpc.getAddPropertyMethod = getAddPropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.AddPropertyRequest, com.uwei.easy_core.RelationProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.AddPropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("add_property"))
              .build();
        }
      }
    }
    return getAddPropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.UpdatePropertyRequest,
      com.uwei.easy_core.RelationProto.PropertyResponse> getUpdatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_property",
      requestType = com.uwei.easy_core.RelationProto.UpdatePropertyRequest.class,
      responseType = com.uwei.easy_core.RelationProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.UpdatePropertyRequest,
      com.uwei.easy_core.RelationProto.PropertyResponse> getUpdatePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.UpdatePropertyRequest, com.uwei.easy_core.RelationProto.PropertyResponse> getUpdatePropertyMethod;
    if ((getUpdatePropertyMethod = relationGrpc.getUpdatePropertyMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getUpdatePropertyMethod = relationGrpc.getUpdatePropertyMethod) == null) {
          relationGrpc.getUpdatePropertyMethod = getUpdatePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.UpdatePropertyRequest, com.uwei.easy_core.RelationProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.UpdatePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("update_property"))
              .build();
        }
      }
    }
    return getUpdatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest,
      com.uwei.easy_core.RelationProto.ManageResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.RelationProto.ManageRequest.class,
      responseType = com.uwei.easy_core.RelationProto.ManageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest,
      com.uwei.easy_core.RelationProto.ManageResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest, com.uwei.easy_core.RelationProto.ManageResponse> getCreateMethod;
    if ((getCreateMethod = relationGrpc.getCreateMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getCreateMethod = relationGrpc.getCreateMethod) == null) {
          relationGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.ManageRequest, com.uwei.easy_core.RelationProto.ManageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.ManageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest,
      com.uwei.easy_core.RelationProto.ManageResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.uwei.easy_core.RelationProto.ManageRequest.class,
      responseType = com.uwei.easy_core.RelationProto.ManageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest,
      com.uwei.easy_core.RelationProto.ManageResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.ManageRequest, com.uwei.easy_core.RelationProto.ManageResponse> getDeleteMethod;
    if ((getDeleteMethod = relationGrpc.getDeleteMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getDeleteMethod = relationGrpc.getDeleteMethod) == null) {
          relationGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.ManageRequest, com.uwei.easy_core.RelationProto.ManageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.ManageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.CountRequest,
      com.uwei.easy_core.RelationProto.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count",
      requestType = com.uwei.easy_core.RelationProto.CountRequest.class,
      responseType = com.uwei.easy_core.RelationProto.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.CountRequest,
      com.uwei.easy_core.RelationProto.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.CountRequest, com.uwei.easy_core.RelationProto.CountResponse> getCountMethod;
    if ((getCountMethod = relationGrpc.getCountMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getCountMethod = relationGrpc.getCountMethod) == null) {
          relationGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.CountRequest, com.uwei.easy_core.RelationProto.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetByInstanceRequest,
      com.uwei.easy_core.RelationProto.GetResponse> getGetByInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_by_instance",
      requestType = com.uwei.easy_core.RelationProto.GetByInstanceRequest.class,
      responseType = com.uwei.easy_core.RelationProto.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetByInstanceRequest,
      com.uwei.easy_core.RelationProto.GetResponse> getGetByInstanceMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.RelationProto.GetByInstanceRequest, com.uwei.easy_core.RelationProto.GetResponse> getGetByInstanceMethod;
    if ((getGetByInstanceMethod = relationGrpc.getGetByInstanceMethod) == null) {
      synchronized (relationGrpc.class) {
        if ((getGetByInstanceMethod = relationGrpc.getGetByInstanceMethod) == null) {
          relationGrpc.getGetByInstanceMethod = getGetByInstanceMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.RelationProto.GetByInstanceRequest, com.uwei.easy_core.RelationProto.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_by_instance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.GetByInstanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.RelationProto.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new relationMethodDescriptorSupplier("get_by_instance"))
              .build();
        }
      }
    }
    return getGetByInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static relationStub newStub(io.grpc.Channel channel) {
    return new relationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static relationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new relationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static relationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new relationFutureStub(channel);
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static abstract class relationImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 查询关系列表, 用于关系发现
     * </pre>
     */
    public void get(com.uwei.easy_core.RelationProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     *rpc get_property (GetPropertyRequest) returns (stream PropertyStreamResponse) {}
     * </pre>
     */
    public void addProperty(com.uwei.easy_core.RelationProto.AddPropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddPropertyMethod(), responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.RelationProto.UpdatePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     *指定两端模型，批量创建关系
     * </pre>
     */
    public void create(com.uwei.easy_core.RelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     *指定两端模型，批量删除关系
     * </pre>
     */
    public void delete(com.uwei.easy_core.RelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询关系信息列表, 用于drop 关系定义时候的判断
     * </pre>
     */
    public void count(com.uwei.easy_core.RelationProto.CountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.CountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * 查询指定实例的所有关系
     * </pre>
     */
    public void getByInstance(com.uwei.easy_core.RelationProto.GetByInstanceRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetByInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.GetRequest,
                com.uwei.easy_core.RelationProto.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getAddPropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.AddPropertyRequest,
                com.uwei.easy_core.RelationProto.PropertyResponse>(
                  this, METHODID_ADD_PROPERTY)))
          .addMethod(
            getUpdatePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.UpdatePropertyRequest,
                com.uwei.easy_core.RelationProto.PropertyResponse>(
                  this, METHODID_UPDATE_PROPERTY)))
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.ManageRequest,
                com.uwei.easy_core.RelationProto.ManageResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.ManageRequest,
                com.uwei.easy_core.RelationProto.ManageResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.CountRequest,
                com.uwei.easy_core.RelationProto.CountResponse>(
                  this, METHODID_COUNT)))
          .addMethod(
            getGetByInstanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.RelationProto.GetByInstanceRequest,
                com.uwei.easy_core.RelationProto.GetResponse>(
                  this, METHODID_GET_BY_INSTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class relationStub extends io.grpc.stub.AbstractStub<relationStub> {
    private relationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private relationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected relationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new relationStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询关系列表, 用于关系发现
     * </pre>
     */
    public void get(com.uwei.easy_core.RelationProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *rpc get_property (GetPropertyRequest) returns (stream PropertyStreamResponse) {}
     * </pre>
     */
    public void addProperty(com.uwei.easy_core.RelationProto.AddPropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddPropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.RelationProto.UpdatePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *指定两端模型，批量创建关系
     * </pre>
     */
    public void create(com.uwei.easy_core.RelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *指定两端模型，批量删除关系
     * </pre>
     */
    public void delete(com.uwei.easy_core.RelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询关系信息列表, 用于drop 关系定义时候的判断
     * </pre>
     */
    public void count(com.uwei.easy_core.RelationProto.CountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.CountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 查询指定实例的所有关系
     * </pre>
     */
    public void getByInstance(com.uwei.easy_core.RelationProto.GetByInstanceRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetByInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class relationBlockingStub extends io.grpc.stub.AbstractStub<relationBlockingStub> {
    private relationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private relationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected relationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new relationBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询关系列表, 用于关系发现
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.GetResponse get(com.uwei.easy_core.RelationProto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *rpc get_property (GetPropertyRequest) returns (stream PropertyStreamResponse) {}
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.PropertyResponse addProperty(com.uwei.easy_core.RelationProto.AddPropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddPropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.RelationProto.PropertyResponse updateProperty(com.uwei.easy_core.RelationProto.UpdatePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *指定两端模型，批量创建关系
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.ManageResponse create(com.uwei.easy_core.RelationProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *指定两端模型，批量删除关系
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.ManageResponse delete(com.uwei.easy_core.RelationProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询关系信息列表, 用于drop 关系定义时候的判断
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.CountResponse count(com.uwei.easy_core.RelationProto.CountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 查询指定实例的所有关系
     * </pre>
     */
    public com.uwei.easy_core.RelationProto.GetResponse getByInstance(com.uwei.easy_core.RelationProto.GetByInstanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetByInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class relationFutureStub extends io.grpc.stub.AbstractStub<relationFutureStub> {
    private relationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private relationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected relationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new relationFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 查询关系列表, 用于关系发现
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.GetResponse> get(
        com.uwei.easy_core.RelationProto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *rpc get_property (GetPropertyRequest) returns (stream PropertyStreamResponse) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.PropertyResponse> addProperty(
        com.uwei.easy_core.RelationProto.AddPropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddPropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.PropertyResponse> updateProperty(
        com.uwei.easy_core.RelationProto.UpdatePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *指定两端模型，批量创建关系
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.ManageResponse> create(
        com.uwei.easy_core.RelationProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *指定两端模型，批量删除关系
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.ManageResponse> delete(
        com.uwei.easy_core.RelationProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询关系信息列表, 用于drop 关系定义时候的判断
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.CountResponse> count(
        com.uwei.easy_core.RelationProto.CountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 查询指定实例的所有关系
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.RelationProto.GetResponse> getByInstance(
        com.uwei.easy_core.RelationProto.GetByInstanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetByInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET = 0;
  private static final int METHODID_ADD_PROPERTY = 1;
  private static final int METHODID_UPDATE_PROPERTY = 2;
  private static final int METHODID_CREATE = 3;
  private static final int METHODID_DELETE = 4;
  private static final int METHODID_COUNT = 5;
  private static final int METHODID_GET_BY_INSTANCE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final relationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(relationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET:
          serviceImpl.get((com.uwei.easy_core.RelationProto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse>) responseObserver);
          break;
        case METHODID_ADD_PROPERTY:
          serviceImpl.addProperty((com.uwei.easy_core.RelationProto.AddPropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTY:
          serviceImpl.updateProperty((com.uwei.easy_core.RelationProto.UpdatePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.RelationProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.uwei.easy_core.RelationProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.ManageResponse>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.uwei.easy_core.RelationProto.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.CountResponse>) responseObserver);
          break;
        case METHODID_GET_BY_INSTANCE:
          serviceImpl.getByInstance((com.uwei.easy_core.RelationProto.GetByInstanceRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.RelationProto.GetResponse>) responseObserver);
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

  private static abstract class relationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    relationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.RelationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("relation");
    }
  }

  private static final class relationFileDescriptorSupplier
      extends relationBaseDescriptorSupplier {
    relationFileDescriptorSupplier() {}
  }

  private static final class relationMethodDescriptorSupplier
      extends relationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    relationMethodDescriptorSupplier(String methodName) {
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
      synchronized (relationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new relationFileDescriptorSupplier())
              .addMethod(getGetMethod())
              .addMethod(getAddPropertyMethod())
              .addMethod(getUpdatePropertyMethod())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getCountMethod())
              .addMethod(getGetByInstanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
