package com.duohe.project.service;

import com.duohe.project.pojo.ChatUser;

public interface IUserService {

    ChatUser getUserById(long userId);

    int insertUser(ChatUser chatUser);

}
