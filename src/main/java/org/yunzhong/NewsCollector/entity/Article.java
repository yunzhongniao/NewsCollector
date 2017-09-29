package org.yunzhong.NewsCollector.entity;

import java.util.List;

import lombok.Data;

@Data
public class Article {
    private Long id;
    private String title;
    private String summary;
    private List<ArticleItem> items;
    private String conclusion;
}
