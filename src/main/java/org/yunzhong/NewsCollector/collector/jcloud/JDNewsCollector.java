package org.yunzhong.NewsCollector.collector.jcloud;

import java.io.IOException;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDChannelEntity;
import org.yunzhong.NewsCollector.collector.jcloud.entity.JDRawEntity;
import org.yunzhong.NewsCollector.util.JsonUtil;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class JDNewsCollector {

    @Value("${news.jcloud.newslist}")
    public String newsURL;

    @Value("${news.jcloud.channels}")
    public String channelsURL;

    @Value("${news.jcloud.appkey}")
    private String appkey;

    public JDChannelEntity getChannels() throws ClientProtocolException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        String uri = String.format(channelsURL, appkey);
        HttpGet get = new HttpGet(uri);
        final HttpResponse response = client.execute(get);
        final int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode < 300) {
            return JsonUtil.toObject(EntityUtils.toString(response.getEntity()), JDChannelEntity.class);
        } else {
            log.error("Failed to get result,status code {}.", statusCode);
            return null;
        }
    }

    public JDRawEntity getNews(String channel, int pageNum, int pageSize) throws ClientProtocolException, IOException {
        HttpClient client = HttpClientBuilder.create().build();
        
        String uri = String.format(newsURL, channel, pageNum, pageSize, appkey);
        HttpGet get = new HttpGet(uri);
        
        final HttpResponse response = client.execute(get);
        final int statusCode = response.getStatusLine().getStatusCode();
        if (statusCode < 300) {
            return JsonUtil.toObject(EntityUtils.toString(response.getEntity()), JDRawEntity.class);
        } else {
            log.error("Failed to get result,status code {}.", statusCode);
            return null;
        }
    }
}
