package com.qss.controller;

import com.qss.model.LingganBean;
import com.qss.model.PageResult;
import com.qss.model.TaiciBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/taici")
public class TaiciController {

    @RequestMapping("/list")
    public String list(){

        return "taici/list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<TaiciBean> listJson(){
        PageResult<TaiciBean> result = new PageResult<>();
        result.setCode(0);
        result.setCount(300);
        List<TaiciBean> list = new ArrayList<>();
        IntStream.range(1,10).forEach(id -> {
            TaiciBean taiciBean = new TaiciBean(id,"长夜漫漫"+id,id%3==0?"一份真诚的爱情":"上天安排的最大嘛",id%2==0?"段子":"配音","《大话西游》");
            list.add(taiciBean);
        });
        result.setData(list);
        return result;
    }

}
