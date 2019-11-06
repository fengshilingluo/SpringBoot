package com.baizhi.service;

import com.baizhi.dao.UsersDAO;
import com.baizhi.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDAO usersDAO;


    @Override
    public void insert(Users users) {
        String id = UUID.randomUUID().toString();
        users.setId(id);
        usersDAO.insert(users);
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public List<Users> selectAll(Integer page, Integer rows) {
        List<Users> users = usersDAO.selectAll(page, rows);
        return users;
    }
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    @Override
    public Integer totalcount() {
        Integer totalcount = usersDAO.totalcount();
        return totalcount;
    }

    @Override
    public void update(Users users) {
        usersDAO.update(users);
    }

    @Override
    public void delete(String id) {
        usersDAO.delete(id);
    }
}
