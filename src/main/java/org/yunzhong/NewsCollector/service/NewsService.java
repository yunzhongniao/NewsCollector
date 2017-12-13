package org.yunzhong.NewsCollector.service;

import org.yunzhong.NewsCollector.entity.News;

import com.github.pagehelper.Page;

public interface NewsService {

    Page<News> listNews(String owner, String category, int pageNum, int pageSize);

}
