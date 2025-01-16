package violet.video.common.controller;

import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import violet.video.common.proto_gen.demo.DemoGrpc;
import violet.video.common.proto_gen.demo.DemoRequest;
import violet.video.common.proto_gen.demo.DemoResponse;

import java.util.Map;

@RestController
public class DemoController {
    @GrpcClient("demo")
    private DemoGrpc.DemoBlockingStub demoStub;

    @GetMapping("/message")
    public String getMessage(@RequestParam Map<String, String> data) {
        String param = data.get("param");
        DemoRequest request = DemoRequest.newBuilder().setParam(param).build();
        DemoResponse response=demoStub.getMessage(request);
        return response.getMessage();
    }
}
