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
    comments = "Source: object_service.proto")
public final class object_serviceGrpc {

  private object_serviceGrpc() {}

  public static final String SERVICE_NAME = "object_service.object_service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create",
      requestType = com.uwei.easy_core.ObjectServiceProto.ManageRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.ManageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse> getCreateMethod;
    if ((getCreateMethod = object_serviceGrpc.getCreateMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getCreateMethod = object_serviceGrpc.getCreateMethod) == null) {
          object_serviceGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ManageRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update",
      requestType = com.uwei.easy_core.ObjectServiceProto.ManageRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.ManageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManageRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse> getUpdateMethod;
    if ((getUpdateMethod = object_serviceGrpc.getUpdateMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getUpdateMethod = object_serviceGrpc.getUpdateMethod) == null) {
          object_serviceGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ManageRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete",
      requestType = com.uwei.easy_core.ObjectServiceProto.DeleteRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.ManageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteRequest,
      com.uwei.easy_core.ObjectServiceProto.ManageResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse> getDeleteMethod;
    if ((getDeleteMethod = object_serviceGrpc.getDeleteMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getDeleteMethod = object_serviceGrpc.getDeleteMethod) == null) {
          object_serviceGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.DeleteRequest, com.uwei.easy_core.ObjectServiceProto.ManageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest,
      com.uwei.easy_core.ObjectServiceProto.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get",
      requestType = com.uwei.easy_core.ObjectServiceProto.GetRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest,
      com.uwei.easy_core.ObjectServiceProto.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest, com.uwei.easy_core.ObjectServiceProto.GetResponse> getGetMethod;
    if ((getGetMethod = object_serviceGrpc.getGetMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getGetMethod = object_serviceGrpc.getGetMethod) == null) {
          object_serviceGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.GetRequest, com.uwei.easy_core.ObjectServiceProto.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ListRequest,
      com.uwei.easy_core.ObjectServiceProto.ListResponse> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.uwei.easy_core.ObjectServiceProto.ListRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ListRequest,
      com.uwei.easy_core.ObjectServiceProto.ListResponse> getListMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ListRequest, com.uwei.easy_core.ObjectServiceProto.ListResponse> getListMethod;
    if ((getListMethod = object_serviceGrpc.getListMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getListMethod = object_serviceGrpc.getListMethod) == null) {
          object_serviceGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ListRequest, com.uwei.easy_core.ObjectServiceProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.TruncateRequest,
      com.uwei.easy_core.ObjectServiceProto.TruncateResponse> getTruncateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "truncate",
      requestType = com.uwei.easy_core.ObjectServiceProto.TruncateRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.TruncateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.TruncateRequest,
      com.uwei.easy_core.ObjectServiceProto.TruncateResponse> getTruncateMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.TruncateRequest, com.uwei.easy_core.ObjectServiceProto.TruncateResponse> getTruncateMethod;
    if ((getTruncateMethod = object_serviceGrpc.getTruncateMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getTruncateMethod = object_serviceGrpc.getTruncateMethod) == null) {
          object_serviceGrpc.getTruncateMethod = getTruncateMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.TruncateRequest, com.uwei.easy_core.ObjectServiceProto.TruncateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "truncate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.TruncateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.TruncateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("truncate"))
              .build();
        }
      }
    }
    return getTruncateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest,
      com.uwei.easy_core.ObjectServiceProto.ListResponse> getListChildrenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list_children",
      requestType = com.uwei.easy_core.ObjectServiceProto.GetRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.ListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest,
      com.uwei.easy_core.ObjectServiceProto.ListResponse> getListChildrenMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.GetRequest, com.uwei.easy_core.ObjectServiceProto.ListResponse> getListChildrenMethod;
    if ((getListChildrenMethod = object_serviceGrpc.getListChildrenMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getListChildrenMethod = object_serviceGrpc.getListChildrenMethod) == null) {
          object_serviceGrpc.getListChildrenMethod = getListChildrenMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.GetRequest, com.uwei.easy_core.ObjectServiceProto.ListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list_children"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("list_children"))
              .build();
        }
      }
    }
    return getListChildrenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getCreatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create_property",
      requestType = com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getCreatePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getCreatePropertyMethod;
    if ((getCreatePropertyMethod = object_serviceGrpc.getCreatePropertyMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getCreatePropertyMethod = object_serviceGrpc.getCreatePropertyMethod) == null) {
          object_serviceGrpc.getCreatePropertyMethod = getCreatePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("create_property"))
              .build();
        }
      }
    }
    return getCreatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getUpdatePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "update_property",
      requestType = com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getUpdatePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getUpdatePropertyMethod;
    if ((getUpdatePropertyMethod = object_serviceGrpc.getUpdatePropertyMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getUpdatePropertyMethod = object_serviceGrpc.getUpdatePropertyMethod) == null) {
          object_serviceGrpc.getUpdatePropertyMethod = getUpdatePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "update_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("update_property"))
              .build();
        }
      }
    }
    return getUpdatePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getDeletePropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete_property",
      requestType = com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.PropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest,
      com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getDeletePropertyMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse> getDeletePropertyMethod;
    if ((getDeletePropertyMethod = object_serviceGrpc.getDeletePropertyMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getDeletePropertyMethod = object_serviceGrpc.getDeletePropertyMethod) == null) {
          object_serviceGrpc.getDeletePropertyMethod = getDeletePropertyMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest, com.uwei.easy_core.ObjectServiceProto.PropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete_property"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.PropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("delete_property"))
              .build();
        }
      }
    }
    return getDeletePropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getCreateMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "create_metrics",
      requestType = com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getCreateMetricsMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse> getCreateMetricsMethod;
    if ((getCreateMetricsMethod = object_serviceGrpc.getCreateMetricsMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getCreateMetricsMethod = object_serviceGrpc.getCreateMetricsMethod) == null) {
          object_serviceGrpc.getCreateMetricsMethod = getCreateMetricsMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "create_metrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("create_metrics"))
              .build();
        }
      }
    }
    return getCreateMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getImportMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "import_metrics",
      requestType = com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getImportMetricsMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse> getImportMetricsMethod;
    if ((getImportMetricsMethod = object_serviceGrpc.getImportMetricsMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getImportMetricsMethod = object_serviceGrpc.getImportMetricsMethod) == null) {
          object_serviceGrpc.getImportMetricsMethod = getImportMetricsMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "import_metrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("import_metrics"))
              .build();
        }
      }
    }
    return getImportMetricsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getDeleteMetricsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "delete_metrics",
      requestType = com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest.class,
      responseType = com.uwei.easy_core.ObjectServiceProto.MetricResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest,
      com.uwei.easy_core.ObjectServiceProto.MetricResponse> getDeleteMetricsMethod() {
    io.grpc.MethodDescriptor<com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse> getDeleteMetricsMethod;
    if ((getDeleteMetricsMethod = object_serviceGrpc.getDeleteMetricsMethod) == null) {
      synchronized (object_serviceGrpc.class) {
        if ((getDeleteMetricsMethod = object_serviceGrpc.getDeleteMetricsMethod) == null) {
          object_serviceGrpc.getDeleteMetricsMethod = getDeleteMetricsMethod =
              io.grpc.MethodDescriptor.<com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest, com.uwei.easy_core.ObjectServiceProto.MetricResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "delete_metrics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.uwei.easy_core.ObjectServiceProto.MetricResponse.getDefaultInstance()))
              .setSchemaDescriptor(new object_serviceMethodDescriptorSupplier("delete_metrics"))
              .build();
        }
      }
    }
    return getDeleteMetricsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static object_serviceStub newStub(io.grpc.Channel channel) {
    return new object_serviceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static object_serviceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new object_serviceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static object_serviceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new object_serviceFutureStub(channel);
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static abstract class object_serviceImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.uwei.easy_core.ObjectServiceProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.uwei.easy_core.ObjectServiceProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.ObjectServiceProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void get(com.uwei.easy_core.ObjectServiceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_core.ObjectServiceProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void truncate(com.uwei.easy_core.ObjectServiceProto.TruncateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.TruncateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTruncateMethod(), responseObserver);
    }

    /**
     */
    public void listChildren(com.uwei.easy_core.ObjectServiceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListChildrenMethod(), responseObserver);
    }

    /**
     */
    public void createProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreatePropertyMethod(), responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdatePropertyMethod(), responseObserver);
    }

    /**
     */
    public void deleteProperty(com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeletePropertyMethod(), responseObserver);
    }

    /**
     */
    public void createMetrics(com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMetricsMethod(), responseObserver);
    }

    /**
     */
    public void importMetrics(com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getImportMetricsMethod(), responseObserver);
    }

    /**
     */
    public void deleteMetrics(com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMetricsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ManageRequest,
                com.uwei.easy_core.ObjectServiceProto.ManageResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ManageRequest,
                com.uwei.easy_core.ObjectServiceProto.ManageResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.DeleteRequest,
                com.uwei.easy_core.ObjectServiceProto.ManageResponse>(
                  this, METHODID_DELETE)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.GetRequest,
                com.uwei.easy_core.ObjectServiceProto.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ListRequest,
                com.uwei.easy_core.ObjectServiceProto.ListResponse>(
                  this, METHODID_LIST)))
          .addMethod(
            getTruncateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.TruncateRequest,
                com.uwei.easy_core.ObjectServiceProto.TruncateResponse>(
                  this, METHODID_TRUNCATE)))
          .addMethod(
            getListChildrenMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.GetRequest,
                com.uwei.easy_core.ObjectServiceProto.ListResponse>(
                  this, METHODID_LIST_CHILDREN)))
          .addMethod(
            getCreatePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
                com.uwei.easy_core.ObjectServiceProto.PropertyResponse>(
                  this, METHODID_CREATE_PROPERTY)))
          .addMethod(
            getUpdatePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest,
                com.uwei.easy_core.ObjectServiceProto.PropertyResponse>(
                  this, METHODID_UPDATE_PROPERTY)))
          .addMethod(
            getDeletePropertyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest,
                com.uwei.easy_core.ObjectServiceProto.PropertyResponse>(
                  this, METHODID_DELETE_PROPERTY)))
          .addMethod(
            getCreateMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest,
                com.uwei.easy_core.ObjectServiceProto.MetricResponse>(
                  this, METHODID_CREATE_METRICS)))
          .addMethod(
            getImportMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest,
                com.uwei.easy_core.ObjectServiceProto.MetricResponse>(
                  this, METHODID_IMPORT_METRICS)))
          .addMethod(
            getDeleteMetricsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest,
                com.uwei.easy_core.ObjectServiceProto.MetricResponse>(
                  this, METHODID_DELETE_METRICS)))
          .build();
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class object_serviceStub extends io.grpc.stub.AbstractStub<object_serviceStub> {
    private object_serviceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_serviceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_serviceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_serviceStub(channel, callOptions);
    }

    /**
     */
    public void create(com.uwei.easy_core.ObjectServiceProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.uwei.easy_core.ObjectServiceProto.ManageRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.uwei.easy_core.ObjectServiceProto.DeleteRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(com.uwei.easy_core.ObjectServiceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.uwei.easy_core.ObjectServiceProto.ListRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void truncate(com.uwei.easy_core.ObjectServiceProto.TruncateRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.TruncateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTruncateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listChildren(com.uwei.easy_core.ObjectServiceProto.GetRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProperty(com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMetrics(com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void importMetrics(com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportMetricsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMetrics(com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest request,
        io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMetricsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class object_serviceBlockingStub extends io.grpc.stub.AbstractStub<object_serviceBlockingStub> {
    private object_serviceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_serviceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_serviceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_serviceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.ManageResponse create(com.uwei.easy_core.ObjectServiceProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.ManageResponse update(com.uwei.easy_core.ObjectServiceProto.ManageRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.ManageResponse delete(com.uwei.easy_core.ObjectServiceProto.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.GetResponse get(com.uwei.easy_core.ObjectServiceProto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.ListResponse list(com.uwei.easy_core.ObjectServiceProto.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.TruncateResponse truncate(com.uwei.easy_core.ObjectServiceProto.TruncateRequest request) {
      return blockingUnaryCall(
          getChannel(), getTruncateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.ListResponse listChildren(com.uwei.easy_core.ObjectServiceProto.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getListChildrenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.PropertyResponse createProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.PropertyResponse updateProperty(com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdatePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.PropertyResponse deleteProperty(com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeletePropertyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.MetricResponse createMetrics(com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.MetricResponse importMetrics(com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportMetricsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.uwei.easy_core.ObjectServiceProto.MetricResponse deleteMetrics(com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMetricsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 实例相关接口
   * </pre>
   */
  public static final class object_serviceFutureStub extends io.grpc.stub.AbstractStub<object_serviceFutureStub> {
    private object_serviceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private object_serviceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected object_serviceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new object_serviceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.ManageResponse> create(
        com.uwei.easy_core.ObjectServiceProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.ManageResponse> update(
        com.uwei.easy_core.ObjectServiceProto.ManageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.ManageResponse> delete(
        com.uwei.easy_core.ObjectServiceProto.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.GetResponse> get(
        com.uwei.easy_core.ObjectServiceProto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.ListResponse> list(
        com.uwei.easy_core.ObjectServiceProto.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.TruncateResponse> truncate(
        com.uwei.easy_core.ObjectServiceProto.TruncateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTruncateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.ListResponse> listChildren(
        com.uwei.easy_core.ObjectServiceProto.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListChildrenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> createProperty(
        com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreatePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> updateProperty(
        com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdatePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.PropertyResponse> deleteProperty(
        com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeletePropertyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.MetricResponse> createMetrics(
        com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.MetricResponse> importMetrics(
        com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportMetricsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.uwei.easy_core.ObjectServiceProto.MetricResponse> deleteMetrics(
        com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMetricsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DELETE = 2;
  private static final int METHODID_GET = 3;
  private static final int METHODID_LIST = 4;
  private static final int METHODID_TRUNCATE = 5;
  private static final int METHODID_LIST_CHILDREN = 6;
  private static final int METHODID_CREATE_PROPERTY = 7;
  private static final int METHODID_UPDATE_PROPERTY = 8;
  private static final int METHODID_DELETE_PROPERTY = 9;
  private static final int METHODID_CREATE_METRICS = 10;
  private static final int METHODID_IMPORT_METRICS = 11;
  private static final int METHODID_DELETE_METRICS = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final object_serviceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(object_serviceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.uwei.easy_core.ObjectServiceProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.uwei.easy_core.ObjectServiceProto.ManageRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.uwei.easy_core.ObjectServiceProto.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ManageResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((com.uwei.easy_core.ObjectServiceProto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.GetResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.uwei.easy_core.ObjectServiceProto.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse>) responseObserver);
          break;
        case METHODID_TRUNCATE:
          serviceImpl.truncate((com.uwei.easy_core.ObjectServiceProto.TruncateRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.TruncateResponse>) responseObserver);
          break;
        case METHODID_LIST_CHILDREN:
          serviceImpl.listChildren((com.uwei.easy_core.ObjectServiceProto.GetRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.ListResponse>) responseObserver);
          break;
        case METHODID_CREATE_PROPERTY:
          serviceImpl.createProperty((com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_UPDATE_PROPERTY:
          serviceImpl.updateProperty((com.uwei.easy_core.ObjectServiceProto.ManagePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_DELETE_PROPERTY:
          serviceImpl.deleteProperty((com.uwei.easy_core.ObjectServiceProto.DeletePropertyRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.PropertyResponse>) responseObserver);
          break;
        case METHODID_CREATE_METRICS:
          serviceImpl.createMetrics((com.uwei.easy_core.ObjectServiceProto.CreateMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse>) responseObserver);
          break;
        case METHODID_IMPORT_METRICS:
          serviceImpl.importMetrics((com.uwei.easy_core.ObjectServiceProto.ImportMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse>) responseObserver);
          break;
        case METHODID_DELETE_METRICS:
          serviceImpl.deleteMetrics((com.uwei.easy_core.ObjectServiceProto.DeleteMetricsRequest) request,
              (io.grpc.stub.StreamObserver<com.uwei.easy_core.ObjectServiceProto.MetricResponse>) responseObserver);
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

  private static abstract class object_serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    object_serviceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.uwei.easy_core.ObjectServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("object_service");
    }
  }

  private static final class object_serviceFileDescriptorSupplier
      extends object_serviceBaseDescriptorSupplier {
    object_serviceFileDescriptorSupplier() {}
  }

  private static final class object_serviceMethodDescriptorSupplier
      extends object_serviceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    object_serviceMethodDescriptorSupplier(String methodName) {
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
      synchronized (object_serviceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new object_serviceFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getGetMethod())
              .addMethod(getListMethod())
              .addMethod(getTruncateMethod())
              .addMethod(getListChildrenMethod())
              .addMethod(getCreatePropertyMethod())
              .addMethod(getUpdatePropertyMethod())
              .addMethod(getDeletePropertyMethod())
              .addMethod(getCreateMetricsMethod())
              .addMethod(getImportMetricsMethod())
              .addMethod(getDeleteMetricsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
