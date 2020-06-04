package com.opple.service;



import com.opple.entity.User;

import java.util.List;

public interface UserService {
    public void batchInsertUser(List<User> userList);
}
