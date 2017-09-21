package com.hbzz.controller;


import com.hbzz.springmvc.dao.Items;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 商品管理
 *
 *
 */
@Controller
public class ItemContriller {

    //入门程序 第一 包名。类名，方法名
    @RequestMapping(value = "/item/itemlist.action")
    public ModelAndView itemList(){
        //重Mysql中查询
        ModelAndView mav=new ModelAndView();
        //model添加数据
        mav.addObject("itemList");
        //view
        mav.setViewName("itemList");
        return mav;
    }
}
