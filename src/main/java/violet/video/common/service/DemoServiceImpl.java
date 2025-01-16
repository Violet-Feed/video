package violet.video.common.service;

import violet.video.common.proto_gen.demo.DemoGrpc;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import violet.video.common.proto_gen.demo.DemoRequest;
import violet.video.common.proto_gen.demo.DemoResponse;

@GrpcService
public class DemoServiceImpl extends DemoGrpc.DemoImplBase {
    @Override
    public void getMessage(DemoRequest request, StreamObserver<DemoResponse> responseObserver) {
        String param=request.getParam();
        if(param.equals("1")){
            responseObserver.onNext(DemoResponse.newBuilder().setMessage("success").build());
        }
        else if(param.equals("2")){
            responseObserver.onNext(DemoResponse.newBuilder().setMessage("failed").build());
        }
        System.out.println("get rpc");
        responseObserver.onCompleted();
    }
}
