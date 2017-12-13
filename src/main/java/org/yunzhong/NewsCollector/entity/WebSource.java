package org.yunzhong.NewsCollector.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WebSource {

    private Long id;
    private String name;
    private String endpoint;
    private byte[] icon;
}
