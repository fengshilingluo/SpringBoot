package com.baizhi.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserAction {
    @RequestMapping("/boot")
    @ResponseBody
    public String boot()throws Exception{
        System.out.println("Hello SpringBoot");
        return "Hello SpringBoot";
    }
}
