package com.yang.dao;

import java.util.List;
import java.util.Map;

import com.yang.pojo.*;
public interface UserDao {
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
