package com.liamz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Description 主页控制类
 * Author liam661
 * Date 2021/10/8 10:42
 **/
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
