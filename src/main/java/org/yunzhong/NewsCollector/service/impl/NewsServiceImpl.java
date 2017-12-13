package org.yunzhong.NewsCollector.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yunzhong.NewsCollector.entity.News;
import org.yunzhong.NewsCollector.service.NewsService;
import org.yunzhong.NewsCollector.service.dao.NewsMapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsMapper newsMapper;

    @Override
    public Page<News> listNews(String owner, String category, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<News> news = newsMapper.listNews(owner, category);
        return (Page<News>) news;
    }
}
