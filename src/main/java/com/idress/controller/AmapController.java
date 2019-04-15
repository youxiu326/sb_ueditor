package com.idress.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 高德地图测试
 */
@Controller
public class AmapController {

    @RequestMapping("/amap")
    public String toIndex(){
        return "amap";
    }

    @RequestMapping("/editor")
    public String ueditor(){
        return "editor";
    }

    @RequestMapping("/demo")
    public String toDemo(){
        return "demo";
    }
} 