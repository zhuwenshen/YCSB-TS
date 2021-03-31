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
    comments = "Source: instance.proto")
public final class instanceGrpc {

  private instanceGrpc() {}

  public static final String SERVICE_NAME = "instance.instance";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CreateRequest,
      com.uwei.easy_core.InstanceProto.Response> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.InstanceProto.CreateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CreateRequest,
      com.uwei.easy_core.InstanceProto.Response> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CreateRequest, com.uwei.easy_core.InstanceProto.Response> getCreateMethod;
    if ((getCreateMethod = instanceGrpc.getCreateMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getCreateMethod = instanceGrpc.getCreateMethod) == null) {
          instanceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.CreateRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.DeleteRequest,
      com.uwei.easy_core.InstanceProto.Response> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.uwei.easy_core.InstanceProto.DeleteRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.DeleteRequest,
      com.uwei.easy_core.InstanceProto.Response> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.DeleteRequest, com.uwei.easy_core.InstanceProto.Response> getDeleteMethod;
    if ((getDeleteMethod = instanceGrpc.getDeleteMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getDeleteMethod = instanceGrpc.getDeleteMethod) == null) {
          instanceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.DeleteRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.BatchUpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getUpdateBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_batch",
      requestType = com.uwei.easy_core.InstanceProto.BatchUpdateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.BatchUpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getUpdateBatchMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.BatchUpdateRequest, com.uwei.easy_core.InstanceProto.Response> getUpdateBatchMethod;
    if ((getUpdateBatchMethod = instanceGrpc.getUpdateBatchMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getUpdateBatchMethod = instanceGrpc.getUpdateBatchMethod) == null) {
          instanceGrpc.getUpdateBatchMethod = getUpdateBatchMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.BatchUpdateRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_batch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.BatchUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("update_batch"))
              .build();
        }
      }
    }
    return getUpdateBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.UpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.uwei.easy_core.InstanceProto.UpdateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.UpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.UpdateRequest, com.uwei.easy_core.InstanceProto.Response> getUpdateMethod;
    if ((getUpdateMethod = instanceGrpc.getUpdateMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getUpdateMethod = instanceGrpc.getUpdateMethod) == null) {
          instanceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.UpdateRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getAddStrToSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "add_str_to_set",
      requestType = com.uwei.easy_core.InstanceProto.AddStrToSetRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getAddStrToSetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response> getAddStrToSetMethod;
    if ((getAddStrToSetMethod = instanceGrpc.getAddStrToSetMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getAddStrToSetMethod = instanceGrpc.getAddStrToSetMethod) == null) {
          instanceGrpc.getAddStrToSetMethod = getAddStrToSetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "add_str_to_set"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AddStrToSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("add_str_to_set"))
              .build();
        }
      }
    }
    return getAddStrToSetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getPushStrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "push_str",
      requestType = com.uwei.easy_core.InstanceProto.AddStrToSetRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getPushStrMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response> getPushStrMethod;
    if ((getPushStrMethod = instanceGrpc.getPushStrMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getPushStrMethod = instanceGrpc.getPushStrMethod) == null) {
          instanceGrpc.getPushStrMethod = getPushStrMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "push_str"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AddStrToSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("push_str"))
              .build();
        }
      }
    }
    return getPushStrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getPullStrMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "pull_str",
      requestType = com.uwei.easy_core.InstanceProto.AddStrToSetRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
      com.uwei.easy_core.InstanceProto.Response> getPullStrMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response> getPullStrMethod;
    if ((getPullStrMethod = instanceGrpc.getPullStrMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getPullStrMethod = instanceGrpc.getPullStrMethod) == null) {
          instanceGrpc.getPullStrMethod = getPullStrMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.AddStrToSetRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "pull_str"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AddStrToSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("pull_str"))
              .build();
        }
      }
    }
    return getPullStrMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.uwei.easy_core.InstanceProto.GetRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetRequest, com.uwei.easy_core.InstanceProto.PageResponse> getGetMethod;
    if ((getGetMethod = instanceGrpc.getGetMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getGetMethod = instanceGrpc.getGetMethod) == null) {
          instanceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.GetRequest, com.uwei.easy_core.InstanceProto.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.PageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_all",
      requestType = com.uwei.easy_core.InstanceProto.GetAllRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.PageResponse> getGetAllMethod;
    if ((getGetAllMethod = instanceGrpc.getGetAllMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getGetAllMethod = instanceGrpc.getGetAllMethod) == null) {
          instanceGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.PageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("get_all"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponse> getGetAllStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_all_stream",
      requestType = com.uwei.easy_core.InstanceProto.GetAllRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.InstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponse> getGetAllStreamMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.InstanceResponse> getGetAllStreamMethod;
    if ((getGetAllStreamMethod = instanceGrpc.getGetAllStreamMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getGetAllStreamMethod = instanceGrpc.getGetAllStreamMethod) == null) {
          instanceGrpc.getGetAllStreamMethod = getGetAllStreamMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.InstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_all_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.InstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("get_all_stream"))
              .build();
        }
      }
    }
    return getGetAllStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponseV2> getGetAllStreamV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get_all_stream_v2",
      requestType = com.uwei.easy_core.InstanceProto.GetAllRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.InstanceResponseV2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponseV2> getGetAllStreamV2Method() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.InstanceResponseV2> getGetAllStreamV2Method;
    if ((getGetAllStreamV2Method = instanceGrpc.getGetAllStreamV2Method) == null) {
      synchronized (instanceGrpc.class) {
        if ((getGetAllStreamV2Method = instanceGrpc.getGetAllStreamV2Method) == null) {
          instanceGrpc.getGetAllStreamV2Method = getGetAllStreamV2Method =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.GetAllRequest, com.uwei.easy_core.InstanceProto.InstanceResponseV2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get_all_stream_v2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.InstanceResponseV2.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("get_all_stream_v2"))
              .build();
        }
      }
    }
    return getGetAllStreamV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountRequest,
      com.uwei.easy_core.InstanceProto.CountResponse> getCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count",
      requestType = com.uwei.easy_core.InstanceProto.CountRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.CountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountRequest,
      com.uwei.easy_core.InstanceProto.CountResponse> getCountMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountRequest, com.uwei.easy_core.InstanceProto.CountResponse> getCountMethod;
    if ((getCountMethod = instanceGrpc.getCountMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getCountMethod = instanceGrpc.getCountMethod) == null) {
          instanceGrpc.getCountMethod = getCountMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.CountRequest, com.uwei.easy_core.InstanceProto.CountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("count"))
              .build();
        }
      }
    }
    return getCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountAllRequest,
      com.uwei.easy_core.InstanceProto.CountAllResponse> getCountAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count_all",
      requestType = com.uwei.easy_core.InstanceProto.CountAllRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.CountAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountAllRequest,
      com.uwei.easy_core.InstanceProto.CountAllResponse> getCountAllMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountAllRequest, com.uwei.easy_core.InstanceProto.CountAllResponse> getCountAllMethod;
    if ((getCountAllMethod = instanceGrpc.getCountAllMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getCountAllMethod = instanceGrpc.getCountAllMethod) == null) {
          instanceGrpc.getCountAllMethod = getCountAllMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.CountAllRequest, com.uwei.easy_core.InstanceProto.CountAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count_all"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("count_all"))
              .build();
        }
      }
    }
    return getCountAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequest,
      com.uwei.easy_core.InstanceProto.AggregateResponse> getAggregateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "aggregate",
      requestType = com.uwei.easy_core.InstanceProto.AggregateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.AggregateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequest,
      com.uwei.easy_core.InstanceProto.AggregateResponse> getAggregateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequest, com.uwei.easy_core.InstanceProto.AggregateResponse> getAggregateMethod;
    if ((getAggregateMethod = instanceGrpc.getAggregateMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getAggregateMethod = instanceGrpc.getAggregateMethod) == null) {
          instanceGrpc.getAggregateMethod = getAggregateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.AggregateRequest, com.uwei.easy_core.InstanceProto.AggregateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "aggregate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AggregateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AggregateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("aggregate"))
              .build();
        }
      }
    }
    return getAggregateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequestV2,
      com.uwei.easy_core.InstanceProto.AggregateResponseV2> getAggregateV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "aggregate_v2",
      requestType = com.uwei.easy_core.InstanceProto.AggregateRequestV2.class,
      responseType = com.uwei.easy_core.InstanceProto.AggregateResponseV2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequestV2,
      com.uwei.easy_core.InstanceProto.AggregateResponseV2> getAggregateV2Method() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.AggregateRequestV2, com.uwei.easy_core.InstanceProto.AggregateResponseV2> getAggregateV2Method;
    if ((getAggregateV2Method = instanceGrpc.getAggregateV2Method) == null) {
      synchronized (instanceGrpc.class) {
        if ((getAggregateV2Method = instanceGrpc.getAggregateV2Method) == null) {
          instanceGrpc.getAggregateV2Method = getAggregateV2Method =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.AggregateRequestV2, com.uwei.easy_core.InstanceProto.AggregateResponseV2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "aggregate_v2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AggregateRequestV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.AggregateResponseV2.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("aggregate_v2"))
              .build();
        }
      }
    }
    return getAggregateV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = com.uwei.easy_core.InstanceProto.SearchRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.PageResponse> getSearchMethod;
    if ((getSearchMethod = instanceGrpc.getSearchMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getSearchMethod = instanceGrpc.getSearchMethod) == null) {
          instanceGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.PageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponse> getSearchStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_stream",
      requestType = com.uwei.easy_core.InstanceProto.SearchRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.InstanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponse> getSearchStreamMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.InstanceResponse> getSearchStreamMethod;
    if ((getSearchStreamMethod = instanceGrpc.getSearchStreamMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getSearchStreamMethod = instanceGrpc.getSearchStreamMethod) == null) {
          instanceGrpc.getSearchStreamMethod = getSearchStreamMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.InstanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.InstanceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("search_stream"))
              .build();
        }
      }
    }
    return getSearchStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponseV2> getSearchStreamV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search_stream_v2",
      requestType = com.uwei.easy_core.InstanceProto.SearchRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.InstanceResponseV2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest,
      com.uwei.easy_core.InstanceProto.InstanceResponseV2> getSearchStreamV2Method() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.InstanceResponseV2> getSearchStreamV2Method;
    if ((getSearchStreamV2Method = instanceGrpc.getSearchStreamV2Method) == null) {
      synchronized (instanceGrpc.class) {
        if ((getSearchStreamV2Method = instanceGrpc.getSearchStreamV2Method) == null) {
          instanceGrpc.getSearchStreamV2Method = getSearchStreamV2Method =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.SearchRequest, com.uwei.easy_core.InstanceProto.InstanceResponseV2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search_stream_v2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.SearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.InstanceResponseV2.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("search_stream_v2"))
              .build();
        }
      }
    }
    return getSearchStreamV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountFieldRequest,
      com.uwei.easy_core.InstanceProto.CountFieldResponse> getCountFieldMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "count_field",
      requestType = com.uwei.easy_core.InstanceProto.CountFieldRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.CountFieldResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountFieldRequest,
      com.uwei.easy_core.InstanceProto.CountFieldResponse> getCountFieldMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.CountFieldRequest, com.uwei.easy_core.InstanceProto.CountFieldResponse> getCountFieldMethod;
    if ((getCountFieldMethod = instanceGrpc.getCountFieldMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getCountFieldMethod = instanceGrpc.getCountFieldMethod) == null) {
          instanceGrpc.getCountFieldMethod = getCountFieldMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.CountFieldRequest, com.uwei.easy_core.InstanceProto.CountFieldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "count_field"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountFieldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.CountFieldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("count_field"))
              .build();
        }
      }
    }
    return getCountFieldMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordSearchRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getKeywordSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "keyword_search",
      requestType = com.uwei.easy_core.InstanceProto.KeywordSearchRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.PageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordSearchRequest,
      com.uwei.easy_core.InstanceProto.PageResponse> getKeywordSearchMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordSearchRequest, com.uwei.easy_core.InstanceProto.PageResponse> getKeywordSearchMethod;
    if ((getKeywordSearchMethod = instanceGrpc.getKeywordSearchMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getKeywordSearchMethod = instanceGrpc.getKeywordSearchMethod) == null) {
          instanceGrpc.getKeywordSearchMethod = getKeywordSearchMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.KeywordSearchRequest, com.uwei.easy_core.InstanceProto.PageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "keyword_search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.KeywordSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.PageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("keyword_search"))
              .build();
        }
      }
    }
    return getKeywordSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordCountRequest,
      com.uwei.easy_core.InstanceProto.KeywordCountResponse> getKeywordCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "keyword_count",
      requestType = com.uwei.easy_core.InstanceProto.KeywordCountRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.KeywordCountResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordCountRequest,
      com.uwei.easy_core.InstanceProto.KeywordCountResponse> getKeywordCountMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.KeywordCountRequest, com.uwei.easy_core.InstanceProto.KeywordCountResponse> getKeywordCountMethod;
    if ((getKeywordCountMethod = instanceGrpc.getKeywordCountMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getKeywordCountMethod = instanceGrpc.getKeywordCountMethod) == null) {
          instanceGrpc.getKeywordCountMethod = getKeywordCountMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.KeywordCountRequest, com.uwei.easy_core.InstanceProto.KeywordCountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "keyword_count"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.KeywordCountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.KeywordCountResponse.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("keyword_count"))
              .build();
        }
      }
    }
    return getKeywordCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixCreateRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mix_create",
      requestType = com.uwei.easy_core.InstanceProto.MixCreateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixCreateRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixCreateRequest, com.uwei.easy_core.InstanceProto.Response> getMixCreateMethod;
    if ((getMixCreateMethod = instanceGrpc.getMixCreateMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getMixCreateMethod = instanceGrpc.getMixCreateMethod) == null) {
          instanceGrpc.getMixCreateMethod = getMixCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.MixCreateRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "mix_create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.MixCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("mix_create"))
              .build();
        }
      }
    }
    return getMixCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixUpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mix_update",
      requestType = com.uwei.easy_core.InstanceProto.MixUpdateRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixUpdateRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixUpdateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixUpdateRequest, com.uwei.easy_core.InstanceProto.Response> getMixUpdateMethod;
    if ((getMixUpdateMethod = instanceGrpc.getMixUpdateMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getMixUpdateMethod = instanceGrpc.getMixUpdateMethod) == null) {
          instanceGrpc.getMixUpdateMethod = getMixUpdateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.MixUpdateRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "mix_update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.MixUpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("mix_update"))
              .build();
        }
      }
    }
    return getMixUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixDeleteRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "mix_delete",
      requestType = com.uwei.easy_core.InstanceProto.MixDeleteRequest.class,
      responseType = com.uwei.easy_core.InstanceProto.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixDeleteRequest,
      com.uwei.easy_core.InstanceProto.Response> getMixDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.InstanceProto.MixDeleteRequest, com.uwei.easy_core.InstanceProto.Response> getMixDeleteMethod;
    if ((getMixDeleteMethod = instanceGrpc.getMixDeleteMethod) == null) {
      synchronized (instanceGrpc.class) {
        if ((getMixDeleteMethod = instanceGrpc.getMixDeleteMethod) == null) {
          instanceGrpc.getMixDeleteMethod = getMixDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.InstanceProto.MixDeleteRequest, com.uwei.easy_core.InstanceProto.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "mix_delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.MixDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.InstanceProto.Response.getDefaultInstance()))
              .setSchemaDescriptor(new instanceMethodDescriptorSupplier("mix_delete"))
              .build();
        }
      }
    }
    return getMixDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static instanceStub newStub(io.grpc.Channel channel) {
    return new instanceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static instanceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new instanceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static instanceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new instanceFutureStub(channel);
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static abstract class instanceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *批量创建实例
     * </pre>
     */
    public void create(com.uwei.easy_core.InstanceProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     *批量删除实例
     * </pre>
     */
    public void delete(com.uwei.easy_core.InstanceProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public void updateBatch(com.uwei.easy_core.InstanceProto.BatchUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBatchMethod(), responseObserver);
    }

    /**
     * <pre>
     *更新实例的单个字段:一般用于快速的数据割接
     * </pre>
     */
    public void update(com.uwei.easy_core.InstanceProto.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     *append数据到数组内, 如果该值尚未存在
     * </pre>
     */
    public void addStrToSet(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getAddStrToSetMethod(), responseObserver);
    }

    /**
     * <pre>
     *append数据到数组内
     * </pre>
     */
    public void pushStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPushStrMethod(), responseObserver);
    }

    /**
     * <pre>
     *删除数组的一个记录
     * </pre>
     */
    public void pullStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getPullStrMethod(), responseObserver);
    }

    /**
     * <pre>
     *根据id获取记录
     * </pre>
     */
    public void get(com.uwei.easy_core.InstanceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     * <pre>
     *获取所有实例列表
     * </pre>
     */
    public void getAll(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void getAllStream(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public void getAllStreamV2(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllStreamV2Method(), responseObserver);
    }

    /**
     * <pre>
     *统计节点数量
     * </pre>
     */
    public void count(com.uwei.easy_core.InstanceProto.CountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountMethod(), responseObserver);
    }

    /**
     * <pre>
     *统计所有模型的节点数量
     * </pre>
     */
    public void countAll(com.uwei.easy_core.InstanceProto.CountAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountAllMethod(), responseObserver);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public void aggregate(com.uwei.easy_core.InstanceProto.AggregateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public void aggregateV2(com.uwei.easy_core.InstanceProto.AggregateRequestV2 request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponseV2> responseObserver) {
      asyncUnimplementedUnaryCall(getAggregateV2Method(), responseObserver);
    }

    /**
     * <pre>
     *通用搜索接口
     * </pre>
     */
    public void search(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void searchStream(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchStreamMethod(), responseObserver);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public void searchStreamV2(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchStreamV2Method(), responseObserver);
    }

    /**
     * <pre>
     *统计字段的数量(count 并且 group by 字段，支持结构体里面的字段的统计)
     * </pre>
     */
    public void countField(com.uwei.easy_core.InstanceProto.CountFieldRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountFieldResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountFieldMethod(), responseObserver);
    }

    /**
     * <pre>
     * 关键字搜索
     * </pre>
     */
    public void keywordSearch(com.uwei.easy_core.InstanceProto.KeywordSearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKeywordSearchMethod(), responseObserver);
    }

    /**
     * <pre>
     * 根据关键字获取数量
     * </pre>
     */
    public void keywordCount(com.uwei.easy_core.InstanceProto.KeywordCountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.KeywordCountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getKeywordCountMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量创建实例
     * </pre>
     */
    public void mixCreate(com.uwei.easy_core.InstanceProto.MixCreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getMixCreateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public void mixUpdate(com.uwei.easy_core.InstanceProto.MixUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getMixUpdateMethod(), responseObserver);
    }

    /**
     * <pre>
     * 批量删除实例
     * </pre>
     */
    public void mixDelete(com.uwei.easy_core.InstanceProto.MixDeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnimplementedUnaryCall(getMixDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.CreateRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_CREATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.DeleteRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_DELETE)))
          .addMethod(
            getUpdateBatchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.BatchUpdateRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_UPDATE_BATCH)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.UpdateRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getAddStrToSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_ADD_STR_TO_SET)))
          .addMethod(
            getPushStrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_PUSH_STR)))
          .addMethod(
            getPullStrMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.AddStrToSetRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_PULL_STR)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.GetRequest,
                com.uwei.easy_core.InstanceProto.PageResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.GetAllRequest,
                com.uwei.easy_core.InstanceProto.PageResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetAllStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.GetAllRequest,
                com.uwei.easy_core.InstanceProto.InstanceResponse>(
                  this, METHODID_GET_ALL_STREAM)))
          .addMethod(
            getGetAllStreamV2Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.GetAllRequest,
                com.uwei.easy_core.InstanceProto.InstanceResponseV2>(
                  this, METHODID_GET_ALL_STREAM_V2)))
          .addMethod(
            getCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.CountRequest,
                com.uwei.easy_core.InstanceProto.CountResponse>(
                  this, METHODID_COUNT)))
          .addMethod(
            getCountAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.CountAllRequest,
                com.uwei.easy_core.InstanceProto.CountAllResponse>(
                  this, METHODID_COUNT_ALL)))
          .addMethod(
            getAggregateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.AggregateRequest,
                com.uwei.easy_core.InstanceProto.AggregateResponse>(
                  this, METHODID_AGGREGATE)))
          .addMethod(
            getAggregateV2Method(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.AggregateRequestV2,
                com.uwei.easy_core.InstanceProto.AggregateResponseV2>(
                  this, METHODID_AGGREGATE_V2)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.SearchRequest,
                com.uwei.easy_core.InstanceProto.PageResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getSearchStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.SearchRequest,
                com.uwei.easy_core.InstanceProto.InstanceResponse>(
                  this, METHODID_SEARCH_STREAM)))
          .addMethod(
            getSearchStreamV2Method(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.SearchRequest,
                com.uwei.easy_core.InstanceProto.InstanceResponseV2>(
                  this, METHODID_SEARCH_STREAM_V2)))
          .addMethod(
            getCountFieldMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.CountFieldRequest,
                com.uwei.easy_core.InstanceProto.CountFieldResponse>(
                  this, METHODID_COUNT_FIELD)))
          .addMethod(
            getKeywordSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.KeywordSearchRequest,
                com.uwei.easy_core.InstanceProto.PageResponse>(
                  this, METHODID_KEYWORD_SEARCH)))
          .addMethod(
            getKeywordCountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.KeywordCountRequest,
                com.uwei.easy_core.InstanceProto.KeywordCountResponse>(
                  this, METHODID_KEYWORD_COUNT)))
          .addMethod(
            getMixCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.MixCreateRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_MIX_CREATE)))
          .addMethod(
            getMixUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.MixUpdateRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_MIX_UPDATE)))
          .addMethod(
            getMixDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.InstanceProto.MixDeleteRequest,
                com.uwei.easy_core.InstanceProto.Response>(
                  this, METHODID_MIX_DELETE)))
          .build();
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class instanceStub extends io.grpc.stub.AbstractStub<instanceStub> {
    private instanceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private instanceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected instanceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new instanceStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量创建实例
     * </pre>
     */
    public void create(com.uwei.easy_core.InstanceProto.CreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *批量删除实例
     * </pre>
     */
    public void delete(com.uwei.easy_core.InstanceProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public void updateBatch(com.uwei.easy_core.InstanceProto.BatchUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBatchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *更新实例的单个字段:一般用于快速的数据割接
     * </pre>
     */
    public void update(com.uwei.easy_core.InstanceProto.UpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *append数据到数组内, 如果该值尚未存在
     * </pre>
     */
    public void addStrToSet(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddStrToSetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *append数据到数组内
     * </pre>
     */
    public void pushStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPushStrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *删除数组的一个记录
     * </pre>
     */
    public void pullStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPullStrMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *根据id获取记录
     * </pre>
     */
    public void get(com.uwei.easy_core.InstanceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *获取所有实例列表
     * </pre>
     */
    public void getAll(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllStream(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public void getAllStreamV2(com.uwei.easy_core.InstanceProto.GetAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetAllStreamV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计节点数量
     * </pre>
     */
    public void count(com.uwei.easy_core.InstanceProto.CountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计所有模型的节点数量
     * </pre>
     */
    public void countAll(com.uwei.easy_core.InstanceProto.CountAllRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public void aggregate(com.uwei.easy_core.InstanceProto.AggregateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public void aggregateV2(com.uwei.easy_core.InstanceProto.AggregateRequestV2 request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponseV2> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAggregateV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *通用搜索接口
     * </pre>
     */
    public void search(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchStream(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchStreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public void searchStreamV2(com.uwei.easy_core.InstanceProto.SearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getSearchStreamV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *统计字段的数量(count 并且 group by 字段，支持结构体里面的字段的统计)
     * </pre>
     */
    public void countField(com.uwei.easy_core.InstanceProto.CountFieldRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountFieldResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountFieldMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 关键字搜索
     * </pre>
     */
    public void keywordSearch(com.uwei.easy_core.InstanceProto.KeywordSearchRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeywordSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 根据关键字获取数量
     * </pre>
     */
    public void keywordCount(com.uwei.easy_core.InstanceProto.KeywordCountRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.KeywordCountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getKeywordCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量创建实例
     * </pre>
     */
    public void mixCreate(com.uwei.easy_core.InstanceProto.MixCreateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMixCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public void mixUpdate(com.uwei.easy_core.InstanceProto.MixUpdateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMixUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 批量删除实例
     * </pre>
     */
    public void mixDelete(com.uwei.easy_core.InstanceProto.MixDeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMixDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class instanceBlockingStub extends io.grpc.stub.AbstractStub<instanceBlockingStub> {
    private instanceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private instanceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected instanceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new instanceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量创建实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response create(com.uwei.easy_core.InstanceProto.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *批量删除实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response delete(com.uwei.easy_core.InstanceProto.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response updateBatch(com.uwei.easy_core.InstanceProto.BatchUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBatchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *更新实例的单个字段:一般用于快速的数据割接
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response update(com.uwei.easy_core.InstanceProto.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *append数据到数组内, 如果该值尚未存在
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response addStrToSet(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddStrToSetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *append数据到数组内
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response pushStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPushStrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *删除数组的一个记录
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response pullStr(com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getPullStrMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *根据id获取记录
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.PageResponse get(com.uwei.easy_core.InstanceProto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *获取所有实例列表
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.PageResponse getAll(com.uwei.easy_core.InstanceProto.GetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.uwei.easy_core.InstanceProto.InstanceResponse> getAllStream(
        com.uwei.easy_core.InstanceProto.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public java.util.Iterator<com.uwei.easy_core.InstanceProto.InstanceResponseV2> getAllStreamV2(
        com.uwei.easy_core.InstanceProto.GetAllRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getGetAllStreamV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *统计节点数量
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.CountResponse count(com.uwei.easy_core.InstanceProto.CountRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *统计所有模型的节点数量
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.CountAllResponse countAll(com.uwei.easy_core.InstanceProto.CountAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.AggregateResponse aggregate(com.uwei.easy_core.InstanceProto.AggregateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAggregateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.AggregateResponseV2 aggregateV2(com.uwei.easy_core.InstanceProto.AggregateRequestV2 request) {
      return blockingUnaryCall(
          getChannel(), getAggregateV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *通用搜索接口
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.PageResponse search(com.uwei.easy_core.InstanceProto.SearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.uwei.easy_core.InstanceProto.InstanceResponse> searchStream(
        com.uwei.easy_core.InstanceProto.SearchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchStreamMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ugly!!!
     * </pre>
     */
    public java.util.Iterator<com.uwei.easy_core.InstanceProto.InstanceResponseV2> searchStreamV2(
        com.uwei.easy_core.InstanceProto.SearchRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getSearchStreamV2Method(), getCallOptions(), request);
    }

    /**
     * <pre>
     *统计字段的数量(count 并且 group by 字段，支持结构体里面的字段的统计)
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.CountFieldResponse countField(com.uwei.easy_core.InstanceProto.CountFieldRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountFieldMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 关键字搜索
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.PageResponse keywordSearch(com.uwei.easy_core.InstanceProto.KeywordSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getKeywordSearchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 根据关键字获取数量
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.KeywordCountResponse keywordCount(com.uwei.easy_core.InstanceProto.KeywordCountRequest request) {
      return blockingUnaryCall(
          getChannel(), getKeywordCountMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量创建实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response mixCreate(com.uwei.easy_core.InstanceProto.MixCreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getMixCreateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response mixUpdate(com.uwei.easy_core.InstanceProto.MixUpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getMixUpdateMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 批量删除实例
     * </pre>
     */
    public com.uwei.easy_core.InstanceProto.Response mixDelete(com.uwei.easy_core.InstanceProto.MixDeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getMixDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class instanceFutureStub extends io.grpc.stub.AbstractStub<instanceFutureStub> {
    private instanceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private instanceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected instanceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new instanceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *批量创建实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> create(
        com.uwei.easy_core.InstanceProto.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *批量删除实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> delete(
        com.uwei.easy_core.InstanceProto.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> updateBatch(
        com.uwei.easy_core.InstanceProto.BatchUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBatchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *更新实例的单个字段:一般用于快速的数据割接
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> update(
        com.uwei.easy_core.InstanceProto.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *append数据到数组内, 如果该值尚未存在
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> addStrToSet(
        com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddStrToSetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *append数据到数组内
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> pushStr(
        com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPushStrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *删除数组的一个记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> pullStr(
        com.uwei.easy_core.InstanceProto.AddStrToSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPullStrMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *根据id获取记录
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.PageResponse> get(
        com.uwei.easy_core.InstanceProto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *获取所有实例列表
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.PageResponse> getAll(
        com.uwei.easy_core.InstanceProto.GetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *统计节点数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.CountResponse> count(
        com.uwei.easy_core.InstanceProto.CountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *统计所有模型的节点数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.CountAllResponse> countAll(
        com.uwei.easy_core.InstanceProto.CountAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.AggregateResponse> aggregate(
        com.uwei.easy_core.InstanceProto.AggregateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 聚合接口，包括sum, max, min
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.AggregateResponseV2> aggregateV2(
        com.uwei.easy_core.InstanceProto.AggregateRequestV2 request) {
      return futureUnaryCall(
          getChannel().newCall(getAggregateV2Method(), getCallOptions()), request);
    }

    /**
     * <pre>
     *通用搜索接口
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.PageResponse> search(
        com.uwei.easy_core.InstanceProto.SearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *统计字段的数量(count 并且 group by 字段，支持结构体里面的字段的统计)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.CountFieldResponse> countField(
        com.uwei.easy_core.InstanceProto.CountFieldRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountFieldMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 关键字搜索
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.PageResponse> keywordSearch(
        com.uwei.easy_core.InstanceProto.KeywordSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKeywordSearchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 根据关键字获取数量
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.KeywordCountResponse> keywordCount(
        com.uwei.easy_core.InstanceProto.KeywordCountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getKeywordCountMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量创建实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> mixCreate(
        com.uwei.easy_core.InstanceProto.MixCreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMixCreateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量更新实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> mixUpdate(
        com.uwei.easy_core.InstanceProto.MixUpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMixUpdateMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 批量删除实例
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.InstanceProto.Response> mixDelete(
        com.uwei.easy_core.InstanceProto.MixDeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMixDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_DELETE = 1;
  private static final int METHODID_UPDATE_BATCH = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_ADD_STR_TO_SET = 4;
  private static final int METHODID_PUSH_STR = 5;
  private static final int METHODID_PULL_STR = 6;
  private static final int METHODID_GET = 7;
  private static final int METHODID_GET_ALL = 8;
  private static final int METHODID_GET_ALL_STREAM = 9;
  private static final int METHODID_GET_ALL_STREAM_V2 = 10;
  private static final int METHODID_COUNT = 11;
  private static final int METHODID_COUNT_ALL = 12;
  private static final int METHODID_AGGREGATE = 13;
  private static final int METHODID_AGGREGATE_V2 = 14;
  private static final int METHODID_SEARCH = 15;
  private static final int METHODID_SEARCH_STREAM = 16;
  private static final int METHODID_SEARCH_STREAM_V2 = 17;
  private static final int METHODID_COUNT_FIELD = 18;
  private static final int METHODID_KEYWORD_SEARCH = 19;
  private static final int METHODID_KEYWORD_COUNT = 20;
  private static final int METHODID_MIX_CREATE = 21;
  private static final int METHODID_MIX_UPDATE = 22;
  private static final int METHODID_MIX_DELETE = 23;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final instanceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(instanceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.InstanceProto.CreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.uwei.easy_core.InstanceProto.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_UPDATE_BATCH:
          serviceImpl.updateBatch((com.uwei.easy_core.InstanceProto.BatchUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.uwei.easy_core.InstanceProto.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_ADD_STR_TO_SET:
          serviceImpl.addStrToSet((com.uwei.easy_core.InstanceProto.AddStrToSetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_PUSH_STR:
          serviceImpl.pushStr((com.uwei.easy_core.InstanceProto.AddStrToSetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_PULL_STR:
          serviceImpl.pullStr((com.uwei.easy_core.InstanceProto.AddStrToSetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.uwei.easy_core.InstanceProto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((com.uwei.easy_core.InstanceProto.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_STREAM:
          serviceImpl.getAllStream((com.uwei.easy_core.InstanceProto.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_STREAM_V2:
          serviceImpl.getAllStreamV2((com.uwei.easy_core.InstanceProto.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2>) responseObserver);
          break;
        case METHODID_COUNT:
          serviceImpl.count((com.uwei.easy_core.InstanceProto.CountRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountResponse>) responseObserver);
          break;
        case METHODID_COUNT_ALL:
          serviceImpl.countAll((com.uwei.easy_core.InstanceProto.CountAllRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountAllResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE:
          serviceImpl.aggregate((com.uwei.easy_core.InstanceProto.AggregateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponse>) responseObserver);
          break;
        case METHODID_AGGREGATE_V2:
          serviceImpl.aggregateV2((com.uwei.easy_core.InstanceProto.AggregateRequestV2) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.AggregateResponseV2>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((com.uwei.easy_core.InstanceProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse>) responseObserver);
          break;
        case METHODID_SEARCH_STREAM:
          serviceImpl.searchStream((com.uwei.easy_core.InstanceProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponse>) responseObserver);
          break;
        case METHODID_SEARCH_STREAM_V2:
          serviceImpl.searchStreamV2((com.uwei.easy_core.InstanceProto.SearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.InstanceResponseV2>) responseObserver);
          break;
        case METHODID_COUNT_FIELD:
          serviceImpl.countField((com.uwei.easy_core.InstanceProto.CountFieldRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.CountFieldResponse>) responseObserver);
          break;
        case METHODID_KEYWORD_SEARCH:
          serviceImpl.keywordSearch((com.uwei.easy_core.InstanceProto.KeywordSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.PageResponse>) responseObserver);
          break;
        case METHODID_KEYWORD_COUNT:
          serviceImpl.keywordCount((com.uwei.easy_core.InstanceProto.KeywordCountRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.KeywordCountResponse>) responseObserver);
          break;
        case METHODID_MIX_CREATE:
          serviceImpl.mixCreate((com.uwei.easy_core.InstanceProto.MixCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_MIX_UPDATE:
          serviceImpl.mixUpdate((com.uwei.easy_core.InstanceProto.MixUpdateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.InstanceProto.Response>) responseObserver);
          break;
        case METHODID_MIX_DELETE:
          serviceImpl.mixDelete((com.uwei.easy_core.InstanceProto.MixDeleteRequest) request,
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

  private static abstract class instanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    instanceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.InstanceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("instance");
    }
  }

  private static final class instanceFileDescriptorSupplier
      extends instanceBaseDescriptorSupplier {
    instanceFileDescriptorSupplier() {}
  }

  private static final class instanceMethodDescriptorSupplier
      extends instanceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    instanceMethodDescriptorSupplier(String methodName) {
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
      synchronized (instanceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new instanceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getUpdateBatchMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getAddStrToSetMethod())
              .addMethod(getPushStrMethod())
              .addMethod(getPullStrMethod())
              .addMethod(getGetMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetAllStreamMethod())
              .addMethod(getGetAllStreamV2Method())
              .addMethod(getCountMethod())
              .addMethod(getCountAllMethod())
              .addMethod(getAggregateMethod())
              .addMethod(getAggregateV2Method())
              .addMethod(getSearchMethod())
              .addMethod(getSearchStreamMethod())
              .addMethod(getSearchStreamV2Method())
              .addMethod(getCountFieldMethod())
              .addMethod(getKeywordSearchMethod())
              .addMethod(getKeywordCountMethod())
              .addMethod(getMixCreateMethod())
              .addMethod(getMixUpdateMethod())
              .addMethod(getMixDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
