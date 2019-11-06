package com.baizhi.dao;

import com.baizhi.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDAO {
    //添加
    public void insert(Users users);
    //查询所有
    public List<Users> selectAll(@Param("page") Integer page, @Param("rows") Integer rows);
    public  Integer  totalcount();
    //修改
    public void update(Users users);
    //删除
    public void delete(String id);
    //批量删除
    public void deletes(String [] ids);
}
