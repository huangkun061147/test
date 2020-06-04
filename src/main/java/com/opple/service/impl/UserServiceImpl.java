package com.opple.service.impl;


import com.opple.entity.User;
import com.opple.mapper.UserMapper;
import com.opple.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author OP061147
 * @desc User业务实现类
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 批量插入
     *
     * @param userList
     */
    @Override
    public void batchInsertUser(List<User> userList) {
        Integer count = userMapper.batchInsertUser(userList);
        System.out.println("批量插入日志打印");
        System.out.println("插入" + count + "条");
    }
}
