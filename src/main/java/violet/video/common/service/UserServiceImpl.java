package violet.video.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import violet.video.common.mapper.UserMapper;
import violet.video.common.pojo.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    private UserMapper userMapper;

    public String addUser(String name) {
        User user = new User(null,name);
        userMapper.save(user);
        return "success";
    }

    public Long getUserByName(String name) {
        return userMapper.getUserByName(name).get(0).getId();
    }

    public String follow(String sender, String receiver) {
        userMapper.createFollow(sender,receiver);
        return "success";
    }

    public List<String> getFollowList(String name) {
        List<User> users = userMapper.getFollowersList(name);
        List<String> followList = new ArrayList<>();
        for (User user : users) {
            followList.add(user.getName());
        }
        return followList;
    }
}
