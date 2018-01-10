package org.yunzhong.NewsCollector.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jd")
public class JDCloudContoller {

    @RequestMapping(value ="collect/news",method=RequestMethod.GET)
    public void cacheNews(){
        
    }
}
