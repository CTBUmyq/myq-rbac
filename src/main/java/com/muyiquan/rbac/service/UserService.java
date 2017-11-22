package com.muyiquan.rbac.service;

import com.muyiquan.rbac.model.User;

import java.util.List;

public interface UserService {
    public List<User> selectUser(User user);

}
