package com.duohe.project.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChatUser implements Serializable {

    private long id;

    private String username;

    private String password;

    private int age;

    private String remark;


}
