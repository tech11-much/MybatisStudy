package com.yang.dao;

import com.yang.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    @Select("select * from mybatis.user")
    List<User> getUsers();
    //当方法有多个参数的时候，都需要添加@Param("")注解
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id);
    @Insert("insert into user(id, name, pwd) values(#{id}, #{name}, #{password})")
    int addUser(User user);
    @Update("update user set name = #{name}, pwd = #{password} where id = #{id}")
    int updateUser(User user);
    @Delete("delete from user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
