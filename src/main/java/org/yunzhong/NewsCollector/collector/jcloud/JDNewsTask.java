package org.yunzhong.NewsCollector.collector.jcloud;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;

import org.apache.commons.collections4.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDChannelEntity;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDRawEntity;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDRawResultBody;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDRawResultItem;
import org.yunzhong.NewsCollector.service.ESService;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JDNewsTask implements Callable<Object>{

    @Autowired
    private JDNewsCollector newsCollector;
    
    @Autowired
    private ESService esService;
    
    @Override
    public Object call() throws Exception {
        final JDChannelEntity channels = newsCollector.getChannels();
        if(channels == null || channels.getResult() == null){
            log.error("Failed to get channels ");
            return null;
        }
        final List<String> channelNames = channels.getResult().getResult();
        if(CollectionUtils.isEmpty(channelNames)){
            log.error("Channels is empty.");
            return null;
        }
        for(String channelName: channelNames){
            int pageNum = 0;
            int pageSize = 40;
            for(;pageNum <100; pageNum++){
                final JDRawEntity news = newsCollector.getNews(channelName, pageNum, pageSize);
                if(news == null){
                    log.warn("Failed to get news {} page {} {}",channelName, pageNum, pageSize);
                    break;
                }
                 final List<JDRawResultItem> items = news.getResult().getResult().getList();
                 if(CollectionUtils.isEmpty(items)){
                     log.warn("item is emtpy of news {} page {} {}",channelName, pageNum, pageSize);
                     continue;
                 }
                 for(JDRawResultItem item:items){
                     final Date newsDate = item.getTime();
                     esService.save(item);
                 }
                
            }
        }
        return null;
    }

}
