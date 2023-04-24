package com.duohe.project.controller;

import com.duohe.project.pojo.ChatUser;
import com.duohe.project.service.IUserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class TestController {

    @Reference
    private IUserService userService;

    @RequestMapping("getUserById")
    public ChatUser getUserById(long userId) {
        return userService.getUserById(userId);
    }

    @RequestMapping("insertUser")
    public int insertUser(String username, String password) {

        ChatUser chatUser = new ChatUser();
        chatUser.setUsername(username);
        chatUser.setPassword(password);
        chatUser.setAge(18);
        chatUser.setRemark("中国人");

        return userService.insertUser(chatUser);
    }

}
