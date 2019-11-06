package com.baizhi.action;

import com.baizhi.entity.Users;
import com.baizhi.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/users")
public class UsersAction {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/selectAll")
    @ResponseBody
    public Map<String,Object> selectAll(Integer page,Integer rows)throws Exception{
        Map<String,Object> maps=new HashMap<String,Object>();
        List<Users> users = usersService.selectAll(page,rows);
        Integer totalcount = usersService.totalcount();
        Integer pageCount;
        if (totalcount%rows==0){
            pageCount=totalcount/rows;
        }else {
            pageCount=totalcount/rows+1;
        }
        maps.put("total",pageCount);
        maps.put("records",totalcount);
        maps.put("page",page);
        maps.put("rows",users);
        return  maps;
    }
    @RequestMapping("/edit")
    @ResponseBody
    public void edit(String oper,Users users)throws Exception{
        if ("add".equals(oper)){
            usersService.insert(users);
        }else  if ("del".equals(oper)){
            usersService.delete(users.getId());
        }else  if ("edit".equals(oper)){
            usersService.update(users);
        }
    }
}
