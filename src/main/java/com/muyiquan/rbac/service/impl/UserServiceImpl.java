package com.muyiquan.rbac.service.impl;

import com.muyiquan.rbac.dao.UserDao;
import com.muyiquan.rbac.model.User;
import com.muyiquan.rbac.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> selectUser(User user){
        return userDao.selectUser(user);
    }
}
