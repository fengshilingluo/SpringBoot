package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jsp")
public class JspAction {
    @RequestMapping("/boot")
    public String boot()throws Exception{
        System.out.println("我是JSP");
        return "index";
    }
}
