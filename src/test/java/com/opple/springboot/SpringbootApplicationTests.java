package com.opple.springboot;

import com.opple.entity.User;
import com.opple.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringbootApplicationTests {
    @Autowired
    private UserService userService;
    @Test
    void contextLoads() {
    }
    @Test
    public void batchInsertUser() {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUsername("liugang1");
        user.setPassword("opple.2019");
        user.setDescription("一个管理员用户");
        user.setRole("管理员");
        User user1 = new User();
        user1.setUsername("liugang2");
        user1.setPassword("opple.2019");
        user1.setDescription("一个管理员用户");
        user1.setRole("管理员");
        userList.add(user);
        userList.add(user1);
        userService.batchInsertUser(userList);
    }

}
