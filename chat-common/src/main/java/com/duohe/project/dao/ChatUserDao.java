package com.duohe.project.dao;

import com.duohe.project.pojo.ChatUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ChatUserDao {

    int insertUser(ChatUser chatUser);

    ChatUser getUserById(long id);

}
