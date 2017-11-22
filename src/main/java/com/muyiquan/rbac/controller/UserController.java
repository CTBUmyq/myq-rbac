package com.muyiquan.rbac.controller;

import com.muyiquan.rbac.service.impl.UserServiceImpl;
import com.muyiquan.rbac.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @ApiOperation(value = "获取用户信息",httpMethod = "POST",response = User.class,notes = "条件查询所有用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "id",required = true,paramType = "query",dataType = "long"),
//            @ApiImplicitParam(name = "email",value = "邮箱",required = true,paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "username",value = "用户名",required = true,paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "password",value = "密码",required = true,paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "role",value = "角色",required = true,paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "status",value = "状态",required = true,paramType = "query",dataType = "int"),
//            @ApiImplicitParam(name = "regIp",value = "注册Ip",required = true,paramType = "query",dataType = "String"),
//            @ApiImplicitParam(name = "regTime",value = "注册时间",required = true,paramType = "query",dataType = "Date")
    })
    @RequestMapping(value = "/selectUser",method = RequestMethod.POST)
    public String selectUser(User user, Model model){
        List<User> userList = userService.selectUser(user);
        return "/index";
    }
}
