package org.yunzhong.NewsCollector.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yunzhong.NewsCollector.entity.Categories;
import org.yunzhong.NewsCollector.entity.News;
import org.yunzhong.NewsCollector.service.CategoryService;
import org.yunzhong.NewsCollector.service.NewsService;

import com.github.pagehelper.Page;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = { "/mobile" })
@Api(value = "news")
@Slf4j
public class NewsController {

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/categories/{owner}", method = RequestMethod.GET)
    public List<Categories> listByOwner(@PathVariable("owner") String owner) {
        log.info("get categories of owner {}", owner);
        List<Categories> result = categoryService.listByOwner(owner);
        return result;
    }

    @RequestMapping(value = "news/{owner}/{category}/{pageNum}/{pageSize}", method = RequestMethod.GET)
    public Page<News> listNews(@PathVariable("owner") String owner, @PathVariable("category") String category,
            @PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        log.info("get news of owner {} category {} page {} pagesize {}", owner, category, pageNum, pageSize);
        Page<News> news = newsService.listNews(owner, category, pageNum, pageSize);
        return news;
    }
}
