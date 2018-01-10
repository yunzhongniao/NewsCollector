package org.yunzhong.NewsCollector.collector.jcloud.entity;

import java.util.List;

import lombok.Data;

@Data
public class JDRawResultBody {
    private String channel;
    private String num;
    private List<JDRawResultItem> list;
}
