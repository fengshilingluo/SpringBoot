package com.baizhi.service;

import com.baizhi.entity.Users;

import java.util.List;

public interface UsersService {
    //添加
    public void insert(Users users);
    //查询所有
    public List<Users> selectAll(Integer page,Integer rows);
    public  Integer  totalcount();
    //修改
    public void update(Users users);
    //删除
    public void delete(String id);
}
