package org.yunzhong.NewsCollector.collector.jcloud.entity;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JDChannelResult {
    private String status;
    private String msg;
    private List<String> result;
}
