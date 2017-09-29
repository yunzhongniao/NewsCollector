package org.yunzhong.NewsCollector.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yunzhong.NewsCollector.collector.CrawlerCollector;
import org.yunzhong.NewsCollector.collector.CrawlerFactory;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = { "/crawler" })
@Api(value = "crawler")
@Slf4j
public class CrawlerController {

    @ApiOperation(value = "info")
    @RequestMapping(value = { "info" }, method = RequestMethod.GET)
    public Map<String,String> getInfo(){
        log.info("get crawler info.");
        Map<String,String> info = new HashMap<>();
        return info;
    }
    
    @ApiOperation(value = "start")
    @RequestMapping(value = { "start/{name}" }, method = RequestMethod.POST)
    public String start(@PathVariable(name="name") String name){
        log.info("get crawler info.");
        final CrawlerCollector collector = CrawlerFactory.getCollector(name);
        try {
            collector.start();
        } catch (Exception e) {
            log.error("",e);
            return "fail";
        }
        return "success";
    }
    
    
    
}
