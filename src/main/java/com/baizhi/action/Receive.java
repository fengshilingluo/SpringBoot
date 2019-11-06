package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/receive")
public class Receive {
    @RequestMapping("/r1")
    public String r1(HttpServletRequest request)throws Exception{
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        System.out.println(name);
        System.out.println(age);
        return "index";
    }
    @RequestMapping("/r2")
    public String r2(String name,Integer age)throws Exception{
        System.out.println(name);
        System.out.println(age);
        return "index";
    }
    @RequestMapping("/r3")
    public String r3(User user)throws Exception{
        System.out.println(user);
        return "index";
    }
    @RequestMapping("/r4")
    public String r4(Integer [] hobby)throws Exception{
        for (Integer integer : hobby) {
            System.out.println(integer);
        }
        return "index";
    }
}
