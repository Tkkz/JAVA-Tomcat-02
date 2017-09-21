package com.hbzz.crm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 客户管理
 * 编写CustomerController 显示用户列表
 */

@Controller
public class CustomerController {

    //入口
    @RequestMapping(value = "/customer/list")
    public String list(){
        return "customer";
    }
}
