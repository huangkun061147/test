package com.opple.mapper;

import com.opple.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;
/*@Mapper
@Component(value = "userMapper")*/
public interface UserMapper {
    Integer batchInsertUser(@Param("userList") List<User> userList);
}
