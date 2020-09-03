package com.mantishell.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping("index")
    public String index(ModelMap mmap){
        mmap.put("title","thymeleaf模板页传递的值，当然可以传递多个值");
        return "home/index";
    }
}
