package violet.video.common.proto_gen.demo;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.6.1)",
    comments = "Source: proto/demo.proto")
public final class DemoGrpc {

  private DemoGrpc() {}

  public static final String SERVICE_NAME = "Demo";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<violet.video.common.proto_gen.demo.DemoRequest,
      violet.video.common.proto_gen.demo.DemoResponse> METHOD_GET_MESSAGE =
      io.grpc.MethodDescriptor.<violet.video.common.proto_gen.demo.DemoRequest, violet.video.common.proto_gen.demo.DemoResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "Demo", "GetMessage"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              violet.video.common.proto_gen.demo.DemoRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              violet.video.common.proto_gen.demo.DemoResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DemoStub newStub(io.grpc.Channel channel) {
    return new DemoStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DemoBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DemoBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DemoFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DemoFutureStub(channel);
  }

  /**
   */
  public static abstract class DemoImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMessage(violet.video.common.proto_gen.demo.DemoRequest request,
        io.grpc.stub.StreamObserver<violet.video.common.proto_gen.demo.DemoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_MESSAGE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_MESSAGE,
            asyncUnaryCall(
              new MethodHandlers<
                violet.video.common.proto_gen.demo.DemoRequest,
                violet.video.common.proto_gen.demo.DemoResponse>(
                  this, METHODID_GET_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class DemoStub extends io.grpc.stub.AbstractStub<DemoStub> {
    private DemoStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoStub(channel, callOptions);
    }

    /**
     */
    public void getMessage(violet.video.common.proto_gen.demo.DemoRequest request,
        io.grpc.stub.StreamObserver<violet.video.common.proto_gen.demo.DemoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DemoBlockingStub extends io.grpc.stub.AbstractStub<DemoBlockingStub> {
    private DemoBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoBlockingStub(channel, callOptions);
    }

    /**
     */
    public violet.video.common.proto_gen.demo.DemoResponse getMessage(violet.video.common.proto_gen.demo.DemoRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_MESSAGE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DemoFutureStub extends io.grpc.stub.AbstractStub<DemoFutureStub> {
    private DemoFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DemoFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DemoFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DemoFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<violet.video.common.proto_gen.demo.DemoResponse> getMessage(
        violet.video.common.proto_gen.demo.DemoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_MESSAGE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MESSAGE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DemoImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DemoImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((violet.video.common.proto_gen.demo.DemoRequest) request,
              (io.grpc.stub.StreamObserver<violet.video.common.proto_gen.demo.DemoResponse>) responseObserver);
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

  private static final class DemoDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return violet.video.common.proto_gen.demo.DemoOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DemoGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DemoDescriptorSupplier())
              .addMethod(METHOD_GET_MESSAGE)
              .build();
        }
      }
    }
    return result;
  }
}
