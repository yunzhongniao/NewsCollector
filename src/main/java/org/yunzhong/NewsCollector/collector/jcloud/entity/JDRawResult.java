package org.yunzhong.NewsCollector.collector.jcloud.entity;

import lombok.Data;

@Data
public class JDRawResult {

    private String status;
    private String msg;
    private JDRawResultBody result;
}
