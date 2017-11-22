package com.muyiquan.rbac.dao;

import com.muyiquan.rbac.model.User;

import java.util.List;


public interface UserDao {
    List<User> selectUser(User user);
}
