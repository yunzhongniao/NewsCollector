package org.yunzhong.NewsCollector.entity;

import lombok.Data;

@Data
public class ArticleItem {
    private Long id;
    private Integer number;
    private String imageId;
    private String imageDesc;
    private String description;
}
