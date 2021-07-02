package com.yang.dao;

import com.yang.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    User getUserById(int id);
    List<User> getListByLimit(Map<String, Integer> map);


}
