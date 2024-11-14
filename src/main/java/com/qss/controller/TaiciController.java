package com.qss.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/taici")
public class TaiciController {

    @RequestMapping("/list")
    public String list(){

        return "taici/list";
    }

}
