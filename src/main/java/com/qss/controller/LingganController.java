package com.qss.controller;

import com.qss.model.LingganBean;
import com.qss.model.PageResult;
import com.qss.model.SucaiBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/linggan")
public class LingganController {

    @RequestMapping("/list")
    public String list(){

        return "linggan/list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<LingganBean> listJson(){
        PageResult<LingganBean> result = new PageResult<>();
        result.setCode(0);
        result.setCount(300);
        List<LingganBean> list = new ArrayList<>();
        IntStream.range(1,10).forEach(id -> {
            LingganBean lingganBean = new LingganBean(id,"灵感"+id,id%3==0?"段子内容":"配音内容",id%2==0?"电视剧台词":"电影台词","备注");
            list.add(lingganBean);
        });
        result.setData(list);
        return result;
    }
}
