package com.qss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sucai")
public class SucaiController {

    @RequestMapping("/list")
    public String list(){

        return "sucai/list";
    }

}
