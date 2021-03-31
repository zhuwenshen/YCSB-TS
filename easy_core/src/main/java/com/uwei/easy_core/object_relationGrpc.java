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
    comments = "Source: object_relation.proto")
public final class object_relationGrpc {

  private object_relationGrpc() {}

  public static final String SERVICE_NAME = "object_relation.object_relation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.ObjectRelationProto.ManageRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getCreateMethod;
    if ((getCreateMethod = object_relationGrpc.getCreateMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getCreateMethod = object_relationGrpc.getCreateMethod) == null) {
          object_relationGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.ManageRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.uwei.easy_core.ObjectRelationProto.ManageRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManageRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getUpdateMethod;
    if ((getUpdateMethod = object_relationGrpc.getUpdateMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getUpdateMethod = object_relationGrpc.getUpdateMethod) == null) {
          object_relationGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.ManageRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeleteRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.uwei.easy_core.ObjectRelationProto.DeleteRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeleteRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeleteRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getDeleteMethod;
    if ((getDeleteMethod = object_relationGrpc.getDeleteMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getDeleteMethod = object_relationGrpc.getDeleteMethod) == null) {
          object_relationGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.DeleteRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.GetRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.uwei.easy_core.ObjectRelationProto.GetRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.GetRequest,
      com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.GetRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> getGetMethod;
    if ((getGetMethod = object_relationGrpc.getGetMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getGetMethod = object_relationGrpc.getGetMethod) == null) {
          object_relationGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.GetRequest, com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getCreatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create_property",
      requestType = com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getCreatePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getCreatePropertyMethod;
    if ((getCreatePropertyMethod = object_relationGrpc.getCreatePropertyMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getCreatePropertyMethod = object_relationGrpc.getCreatePropertyMethod) == null) {
          object_relationGrpc.getCreatePropertyMethod = getCreatePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("create_property"))
              .build();
        }
      }
    }
    return getCreatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getUpdatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_property",
      requestType = com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getUpdatePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getUpdatePropertyMethod;
    if ((getUpdatePropertyMethod = object_relationGrpc.getUpdatePropertyMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getUpdatePropertyMethod = object_relationGrpc.getUpdatePropertyMethod) == null) {
          object_relationGrpc.getUpdatePropertyMethod = getUpdatePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("update_property"))
              .build();
        }
      }
    }
    return getUpdatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getDeletePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete_property",
      requestType = com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectRelationProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest,
      com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getDeletePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse> getDeletePropertyMethod;
    if ((getDeletePropertyMethod = object_relationGrpc.getDeletePropertyMethod) == null) {
      synchronized (object_relationGrpc.class) {
        if ((getDeletePropertyMethod = object_relationGrpc.getDeletePropertyMethod) == null) {
          object_relationGrpc.getDeletePropertyMethod = getDeletePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest, com.uwei.easy_core.ObjectRelationProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectRelationProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_relationMethodDescriptorSupplier("delete_property"))
              .build();
        }
      }
    }
    return getDeletePropertyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static object_relationStub newStub(io.grpc.Channel channel) {
    return new object_relationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static object_relationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new object_relationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static object_relationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new object_relationFutureStub(channel);
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static abstract class object_relationImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.uwei.easy_core.ObjectRelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.uwei.easy_core.ObjectRelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.ObjectRelationProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void get(com.uwei.easy_core.ObjectRelationProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void createProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePropertyMethod(), responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePropertyMethod(), responseObserver);
    }

    /**
     */
    public void deleteProperty(com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePropertyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.ManageRequest,
                com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.ManageRequest,
                com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.DeleteRequest,
                com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.GetRequest,
                com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getCreatePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
                com.uwei.easy_core.ObjectRelationProto.PropertyResponse>(
                  this, METHODID_CREATE_PROPERTY)))
          .addMethod(
            getUpdatePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest,
                com.uwei.easy_core.ObjectRelationProto.PropertyResponse>(
                  this, METHODID_UPDATE_PROPERTY)))
          .addMethod(
            getDeletePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest,
                com.uwei.easy_core.ObjectRelationProto.PropertyResponse>(
                  this, METHODID_DELETE_PROPERTY)))
          .build();
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class object_relationStub extends io.grpc.stub.AbstractStub<object_relationStub> {
    private object_relationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_relationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_relationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_relationStub(channel, callOptions);
    }

    /**
     */
    public void create(com.uwei.easy_core.ObjectRelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.uwei.easy_core.ObjectRelationProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.ObjectRelationProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.uwei.easy_core.ObjectRelationProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProperty(com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class object_relationBlockingStub extends io.grpc.stub.AbstractStub<object_relationBlockingStub> {
    private object_relationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_relationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_relationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_relationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse create(com.uwei.easy_core.ObjectRelationProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse update(com.uwei.easy_core.ObjectRelationProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse delete(com.uwei.easy_core.ObjectRelationProto.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse get(com.uwei.easy_core.ObjectRelationProto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.PropertyResponse createProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.PropertyResponse updateProperty(com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectRelationProto.PropertyResponse deleteProperty(com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePropertyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 关系相关接口
   * </pre>
   */
  public static final class object_relationFutureStub extends io.grpc.stub.AbstractStub<object_relationFutureStub> {
    private object_relationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_relationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_relationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_relationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> create(
        com.uwei.easy_core.ObjectRelationProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> update(
        com.uwei.easy_core.ObjectRelationProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> delete(
        com.uwei.easy_core.ObjectRelationProto.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse> get(
        com.uwei.easy_core.ObjectRelationProto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> createProperty(
        com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> updateProperty(
        com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectRelationProto.PropertyResponse> deleteProperty(
        com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_CREATE_PROPERTY = 4;
  private static final int METHODID_UPDATE_PROPERTY = 5;
  private static final int METHODID_DELETE_PROPERTY = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final object_relationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(object_relationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.ObjectRelationProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.uwei.easy_core.ObjectRelationProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.uwei.easy_core.ObjectRelationProto.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.uwei.easy_core.ObjectRelationProto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.ObjectRelationResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROPERTY:
          serviceImpl.createProperty((com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTY:
          serviceImpl.updateProperty((com.uwei.easy_core.ObjectRelationProto.ManagePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTY:
          serviceImpl.deleteProperty((com.uwei.easy_core.ObjectRelationProto.DeletePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectRelationProto.PropertyResponse>) responseObserver);
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

  private static abstract class object_relationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    object_relationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.ObjectRelationProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("object_relation");
    }
  }

  private static final class object_relationFileDescriptorSupplier
      extends object_relationBaseDescriptorSupplier {
    object_relationFileDescriptorSupplier() {}
  }

  private static final class object_relationMethodDescriptorSupplier
      extends object_relationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    object_relationMethodDescriptorSupplier(String methodName) {
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
      synchronized (object_relationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new object_relationFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getCreatePropertyMethod())
              .addMethod(getUpdatePropertyMethod())
              .addMethod(getDeletePropertyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
