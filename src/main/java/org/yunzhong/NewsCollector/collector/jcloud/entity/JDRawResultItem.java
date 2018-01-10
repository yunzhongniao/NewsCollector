package org.yunzhong.NewsCollector.collector.jcloud.entity;

import java.util.Date;

import lombok.Data;

@Data
public class JDRawResultItem {
    private String title;
    private Date time;
    private String src;
    private String category;
    private String pic;
    private String content;
    private String url;
    private String weburl;
}
