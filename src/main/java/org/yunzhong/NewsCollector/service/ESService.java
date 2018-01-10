package org.yunzhong.NewsCollector.service;

import org.yunzhong.NewsCollector.collector.jcloud.entity.JDRawResultItem;

public interface ESService {

    void save(JDRawResultItem item);

}
