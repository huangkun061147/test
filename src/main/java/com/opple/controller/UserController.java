package com.opple.controller;

import com.opple.entity.User;

import com.opple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 批量插入
     *
     * @param userList
     * @return
     */
    @RequestMapping(value = "/batchInsertUser", method = RequestMethod.POST)
    public void BatchInsertUser(List<User> userList) {
        userService.batchInsertUser(userList);
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test(){
        return "1111";
    }
}
