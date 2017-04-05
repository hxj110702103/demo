package com.han.demo.goods.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.AbstractCollection;

/**
 * Created by Amy on 2016/9/1.
 */

@Controller
@RequestMapping(value = "goods")
public class GoodsController {

    @RequestMapping(value = "index")
    public String index(String name, ModelMap map) {
        System.out.println("wo de di yi ge xiang mu"+name);
         map.addAttribute("name", name);

        return "index";
    }

    @RequestMapping(value = "all")
    public String allGoods() {
        System.out.println("查询所有的goods");

        return "index";
    }
}
