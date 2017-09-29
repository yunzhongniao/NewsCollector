package org.yunzhong.NewsCollector.collector;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CrawlerFactory {

    public static Map<String, CrawlerCollector> collectors = new ConcurrentHashMap<>();

    public static CrawlerCollector getCollector(String name) {
        if (!collectors.containsKey(name)) {
            CrawlerCollector collector = new CrawlerCollector();
            collectors.put(name, collector);
        }
        return collectors.get(name);
    }

}
