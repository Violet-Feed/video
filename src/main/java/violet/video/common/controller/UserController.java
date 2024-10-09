package violet.video.common.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import violet.video.common.service.UserServiceImpl;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/add")
    public String add(@RequestParam Map<String, String> data) {
        String name=data.get("name");
        return userService.addUser(name);
    }

    @GetMapping("/get")
    public Long get(@RequestParam Map<String, String> data) {
        String name= data.get("name");
        return userService.getUserByName(name);
    }

    @GetMapping("/follow")
    public String follow(@RequestParam Map<String, String> data) {
        String sender=data.get("sender");
        String receiver=data.get("receiver");
        return userService.follow(sender,receiver);
    }

    @GetMapping("/getlist")
    public List<String> getlist(@RequestParam Map<String, String> data) {
        String name= data.get("name");
        return userService.getFollowList(name);
    }
}
