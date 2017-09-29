package org.yunzhong.NewsCollector.entity;

import lombok.Data;

@Data
public class Permission {
    private Long id;
    private String source;
    private Integer permission;
    private String type;
}
