package violet.video.common.service;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import violet.video.common.proto_gen.DemoGrpc;
import violet.video.common.proto_gen.DemoOuterClass;

@GrpcService
public class DemoServiceImpl extends DemoGrpc.DemoImplBase {
    @Override
    public void getMessage(DemoOuterClass.DemoRequest request, StreamObserver<DemoOuterClass.DemoResponse> responseObserver) {
        String param=request.getParam();
        if(param.equals("1")){
            responseObserver.onNext(DemoOuterClass.DemoResponse.newBuilder().setMessage("success").build());
        }
        else if(param.equals("2")){
            responseObserver.onNext(DemoOuterClass.DemoResponse.newBuilder().setMessage("failed").build());
        }
        System.out.println("get rpc");
        responseObserver.onCompleted();
    }
}
