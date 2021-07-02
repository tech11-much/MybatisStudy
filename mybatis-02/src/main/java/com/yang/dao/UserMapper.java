package com.yang.dao;

import com.yang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getListUser();
    User getUserById(int id);
    //插入一个用户
    int addUser(User user);
    //修改用户
    int updateUser(User user);
    int addUserOne(Map<String, Object> map);
    //删除一个用户
    int deleteUser(int id);
    List<User> getUserLike(String s);
}
