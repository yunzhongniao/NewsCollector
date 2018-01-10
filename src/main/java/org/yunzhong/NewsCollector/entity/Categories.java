package org.yunzhong.NewsCollector.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Categories {
    private Long id;

    private String key;

    private String name;

    private String owner;

    private Date createTime;

    private Date updateTime;

}