package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.dao.UsersDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)     //开启SpringBoot的测试
@SpringBootTest(classes = Application.class)    //初始化SpringBoot的相关配置
public class TestDAO {
    @Autowired
    private UsersDAO usersDAO;
    @Test
    public void test4(){
        usersDAO.delete("2");
    }
    @Test
    public void test5(){
        String [] ids={"3","2"};
        usersDAO.deletes(ids);
    }
}
