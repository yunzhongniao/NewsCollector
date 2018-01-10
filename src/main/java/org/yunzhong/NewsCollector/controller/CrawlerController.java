package org.yunzhong.NewsCollector.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.yunzhong.NewsCollector.collector.CrawlerCollector;
import org.yunzhong.NewsCollector.collector.CrawlerFactory;
import org.yunzhong.NewsCollector.controller.vo.CrawlerVO;
import org.yunzhong.NewsCollector.controller.vo.ResponseEntity;

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
    @RequestMapping(value = { "start" }, method = RequestMethod.POST)
    public ResponseEntity<String> start(@RequestBody CrawlerVO crawlerVO){
        log.info("get crawler info.");
        final CrawlerCollector collector = CrawlerFactory.getCollector(crawlerVO.getName());
        try {
            collector.start(crawlerVO);
        } catch (Exception e) {
            log.error("",e);
            return ResponseEntity.entity("fail");
        }
        return ResponseEntity.entity("success");
    }
    
    
    
}
