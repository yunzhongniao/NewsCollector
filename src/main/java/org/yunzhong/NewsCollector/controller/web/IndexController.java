package org.yunzhong.NewsCollector.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    
    /**
     * @return
     * @author yunzhong
     * @time 2017年9月19日上午9:48:51
     */
    @RequestMapping("/")
    public String root(){
        return "index";
    }
    
    /**
     * @return
     * @author yunzhong
     * @time 2017年9月19日上午9:48:49
     */
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
