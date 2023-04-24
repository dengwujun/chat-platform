package com.duohe.project.service.impl;

import com.duohe.project.dao.ChatUserDao;
import com.duohe.project.pojo.ChatUser;
import com.duohe.project.service.IUserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Service
@Component
public class UserServiceImpl implements IUserService {

    @Autowired
    private ChatUserDao chatUserDao;

    @Override
    public ChatUser getUserById(long userId) {
        return chatUserDao.getUserById(userId);
    }

    @Override
    public int insertUser(ChatUser chatUser) {
        return chatUserDao.insertUser(chatUser);
    }

}
