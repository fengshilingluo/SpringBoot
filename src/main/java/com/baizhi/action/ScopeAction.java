package com.baizhi.action;

import com.baizhi.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/scope")
public class ScopeAction {
    @RequestMapping("/s1")
    public String s1(HttpServletRequest request, HttpSession session)throws Exception{
        request.setAttribute("name","阿瑟东");
        session.setAttribute("a","abc");
        return "scope";
    }
    @RequestMapping("/s2")
    public String s2(Model model)throws Exception{
        User user = new User("1", "长三", "1223", 12);
        model.addAttribute("user",user);
        return "scope";
    }
    @RequestMapping("/s3")
    public String s3(Model model, ModelMap map)throws Exception{
        User user1 = new User("1", "长三", "1223", 12);
        User user2 = new User("2", "长四", "1223", 12);
        User user3 = new User("3", "长五", "1223", 12);
        List<User> users = new ArrayList<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        map.addAttribute("users",users);
        return "scope2";
    }
}
