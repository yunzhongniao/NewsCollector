package org.yunzhong.NewsCollector.entity;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class News {
    private Long id;

    private String url;

    private String title;

    private String category;

    private String owner;

    private Date createTime;

    private Date updateTime;

    private Date publishTime;

    private byte[] icon;

}