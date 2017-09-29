package org.yunzhong.NewsCollector.entity;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String name;
    private String phone;
    private String password;
    private Group group;
}
