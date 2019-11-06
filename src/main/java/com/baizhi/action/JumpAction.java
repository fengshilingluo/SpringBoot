package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jump")
public class JumpAction {
    @RequestMapping("/J")
    public String J()throws Exception{
        System.out.println("我是J方法");
        return "index";
    }
    @RequestMapping("/A")
    public String A()throws Exception{
        System.out.println("我是A方法");
        return "redirect:/jump/B";
    }
    @RequestMapping("/B")
    public String B()throws Exception{
        System.out.println("我是B方法");
        return "index";
    }
}
