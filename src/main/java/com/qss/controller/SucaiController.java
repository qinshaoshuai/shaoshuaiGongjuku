package com.qss.controller;

import com.qss.model.PageResult;
import com.qss.model.SucaiBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Controller
@RequestMapping("/sucai")
public class SucaiController {

    @RequestMapping("/list")
    public String list(){

        return "sucai/list";
    }

    @RequestMapping("/listJson")
    @ResponseBody
    public PageResult<SucaiBean> listJson(){
        PageResult<SucaiBean> result = new PageResult<>();
        result.setCode(0);
        result.setCount(300);
        List<SucaiBean> list = new ArrayList<>();
        IntStream.range(1,10).forEach(id -> {
            SucaiBean sucai = new SucaiBean(id,"素材"+id,id%3==0?"电影":"电视剧","搞笑");
            list.add(sucai);
        });
        result.setData(list);
        return result;
    }
}
