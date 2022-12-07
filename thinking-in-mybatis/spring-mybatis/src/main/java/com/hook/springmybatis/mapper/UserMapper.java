package com.hook.springmybatis.mapper;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {


    @Insert(" insert into user (id, user_name,password) values(#{id},#{userName},#{password})")
    void addUser(@Param("id") Long id, @Param("userName") String userName, @Param("password") String password);
}
