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
    comments = "Source: index.proto")
public final class indexGrpc {

  private indexGrpc() {}

  public static final String SERVICE_NAME = "index.index";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.CreateIndexRequest,
      com.uwei.easy_core.IndexProto.CreateIndexResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.IndexProto.CreateIndexRequest.class,
      responseType = com.uwei.easy_core.IndexProto.CreateIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.CreateIndexRequest,
      com.uwei.easy_core.IndexProto.CreateIndexResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.CreateIndexRequest, com.uwei.easy_core.IndexProto.CreateIndexResponse> getCreateMethod;
    if ((getCreateMethod = indexGrpc.getCreateMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getCreateMethod = indexGrpc.getCreateMethod) == null) {
          indexGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.CreateIndexRequest, com.uwei.easy_core.IndexProto.CreateIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.CreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.CreateIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.DeleteIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.uwei.easy_core.IndexProto.DeleteIndexRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.DeleteIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.DeleteIndexRequest, com.uwei.easy_core.InstanceProto.Response> getDeleteMethod;
    if ((getDeleteMethod = indexGrpc.getDeleteMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getDeleteMethod = indexGrpc.getDeleteMethod) == null) {
          indexGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.DeleteIndexRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.DeleteIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getRebuildMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rebuild",
      requestType = com.uwei.easy_core.IndexProto.RebuildIndexRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getRebuildMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildIndexRequest, com.uwei.easy_core.InstanceProto.Response> getRebuildMethod;
    if ((getRebuildMethod = indexGrpc.getRebuildMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getRebuildMethod = indexGrpc.getRebuildMethod) == null) {
          indexGrpc.getRebuildMethod = getRebuildMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.RebuildIndexRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rebuild"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.RebuildIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("rebuild"))
              .build();
        }
      }
    }
    return getRebuildMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildWordRequest,
      com.uwei.easy_core.InstanceProto.Response> getRebuildWordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "rebuild_word",
      requestType = com.uwei.easy_core.IndexProto.RebuildWordRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildWordRequest,
      com.uwei.easy_core.InstanceProto.Response> getRebuildWordMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RebuildWordRequest, com.uwei.easy_core.InstanceProto.Response> getRebuildWordMethod;
    if ((getRebuildWordMethod = indexGrpc.getRebuildWordMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getRebuildWordMethod = indexGrpc.getRebuildWordMethod) == null) {
          indexGrpc.getRebuildWordMethod = getRebuildWordMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.RebuildWordRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "rebuild_word"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.RebuildWordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("rebuild_word"))
              .build();
        }
      }
    }
    return getRebuildWordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationCreateIndexRequest,
      com.uwei.easy_core.IndexProto.CreateIndexResponse> getRelationCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "relation_create",
      requestType = com.uwei.easy_core.IndexProto.RelationCreateIndexRequest.class,
      responseType = com.uwei.easy_core.IndexProto.CreateIndexResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationCreateIndexRequest,
      com.uwei.easy_core.IndexProto.CreateIndexResponse> getRelationCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationCreateIndexRequest, com.uwei.easy_core.IndexProto.CreateIndexResponse> getRelationCreateMethod;
    if ((getRelationCreateMethod = indexGrpc.getRelationCreateMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getRelationCreateMethod = indexGrpc.getRelationCreateMethod) == null) {
          indexGrpc.getRelationCreateMethod = getRelationCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.RelationCreateIndexRequest, com.uwei.easy_core.IndexProto.CreateIndexResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "relation_create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.RelationCreateIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.CreateIndexResponse.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("relation_create"))
              .build();
        }
      }
    }
    return getRelationCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getRelationDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "relation_delete",
      requestType = com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest,
      com.uwei.easy_core.InstanceProto.Response> getRelationDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest, com.uwei.easy_core.InstanceProto.Response> getRelationDeleteMethod;
    if ((getRelationDeleteMethod = indexGrpc.getRelationDeleteMethod) == null) {
      synchronized (indexGrpc.class) {
        if ((getRelationDeleteMethod = indexGrpc.getRelationDeleteMethod) == null) {
          indexGrpc.getRelationDeleteMethod = getRelationDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "relation_delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new indexMethodDescriptorSupplier("relation_delete"))
              .build();
        }
      }
    }
    return getRelationDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static indexStub newStub(io.grpc.Channel channel) {
    return new indexStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static indexBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new indexBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static indexFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new indexFutureStub(channel);
  }

  /**
   */
  public static abstract class indexImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.uwei.easy_core.IndexProto.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.IndexProto.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void rebuild(com.uwei.easy_core.IndexProto.RebuildIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRebuildMethod(), responseObserver);
    }

    /**
     */
    public void rebuildWord(com.uwei.easy_core.IndexProto.RebuildWordRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRebuildWordMethod(), responseObserver);
    }

    /**
     */
    public void relationCreate(com.uwei.easy_core.IndexProto.RelationCreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRelationCreateMethod(), responseObserver);
    }

    /**
     */
    public void relationDelete(com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRelationDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.CreateIndexRequest,
                com.uwei.easy_core.IndexProto.CreateIndexResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.DeleteIndexRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_DELETE)))
          .addMethod(
            getRebuildMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.RebuildIndexRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_REBUILD)))
          .addMethod(
            getRebuildWordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.RebuildWordRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_REBUILD_WORD)))
          .addMethod(
            getRelationCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.RelationCreateIndexRequest,
                com.uwei.easy_core.IndexProto.CreateIndexResponse>(
                  this, METHODID_RELATION_CREATE)))
          .addMethod(
            getRelationDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_RELATION_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class indexStub extends io.grpc.stub.AbstractStub<indexStub> {
    private indexStub(io.grpc.Channel channel) {
      super(channel);
    }

    private indexStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected indexStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new indexStub(channel, callOptions);
    }

    /**
     */
    public void create(com.uwei.easy_core.IndexProto.CreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.IndexProto.DeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rebuild(com.uwei.easy_core.IndexProto.RebuildIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebuildMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void rebuildWord(com.uwei.easy_core.IndexProto.RebuildWordRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRebuildWordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void relationCreate(com.uwei.easy_core.IndexProto.RelationCreateIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelationCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void relationDelete(com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRelationDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class indexBlockingStub extends io.grpc.stub.AbstractStub<indexBlockingStub> {
    private indexBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private indexBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected indexBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new indexBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.IndexProto.CreateIndexResponse create(com.uwei.easy_core.IndexProto.CreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response delete(com.uwei.easy_core.IndexProto.DeleteIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response rebuild(com.uwei.easy_core.IndexProto.RebuildIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getRebuildMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response rebuildWord(com.uwei.easy_core.IndexProto.RebuildWordRequest request) {
      return blockingUnaryCall(
          getChannel(), getRebuildWordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.IndexProto.CreateIndexResponse relationCreate(com.uwei.easy_core.IndexProto.RelationCreateIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelationCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.InstanceProto.Response relationDelete(com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest request) {
      return blockingUnaryCall(
          getChannel(), getRelationDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class indexFutureStub extends io.grpc.stub.AbstractStub<indexFutureStub> {
    private indexFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private indexFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected indexFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new indexFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.IndexProto.CreateIndexResponse> create(
        com.uwei.easy_core.IndexProto.CreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> delete(
        com.uwei.easy_core.IndexProto.DeleteIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> rebuild(
        com.uwei.easy_core.IndexProto.RebuildIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRebuildMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> rebuildWord(
        com.uwei.easy_core.IndexProto.RebuildWordRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRebuildWordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.IndexProto.CreateIndexResponse> relationCreate(
        com.uwei.easy_core.IndexProto.RelationCreateIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelationCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> relationDelete(
        com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRelationDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_REBUILD = 2;
  private static final int METHODID_REBUILD_WORD = 3;
  private static final int METHODID_RELATION_CREATE = 4;
  private static final int METHODID_RELATION_DELETE = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final indexImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(indexImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.IndexProto.CreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.uwei.easy_core.IndexProto.DeleteIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_REBUILD:
          serviceImpl.rebuild((com.uwei.easy_core.IndexProto.RebuildIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_REBUILD_WORD:
          serviceImpl.rebuildWord((com.uwei.easy_core.IndexProto.RebuildWordRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_RELATION_CREATE:
          serviceImpl.relationCreate((com.uwei.easy_core.IndexProto.RelationCreateIndexRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.IndexProto.CreateIndexResponse>) responseObserver);
          break;
        case METHODID_RELATION_DELETE:
          serviceImpl.relationDelete((com.uwei.easy_core.IndexProto.RelationDeleteIndexRequest) request,
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

  private static abstract class indexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    indexBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.IndexProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("index");
    }
  }

  private static final class indexFileDescriptorSupplier
      extends indexBaseDescriptorSupplier {
    indexFileDescriptorSupplier() {}
  }

  private static final class indexMethodDescriptorSupplier
      extends indexBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    indexMethodDescriptorSupplier(String methodName) {
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
      synchronized (indexGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new indexFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getRebuildMethod())
              .addMethod(getRebuildWordMethod())
              .addMethod(getRelationCreateMethod())
              .addMethod(getRelationDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
