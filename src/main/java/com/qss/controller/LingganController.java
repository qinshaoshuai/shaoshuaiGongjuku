package com.qss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/linggan")
public class LingganController {

    @RequestMapping("/list")
    public String list(){

        return "linggan/list";
    }

}
