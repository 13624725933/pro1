package com.itheima.dao;

import com.itheima.domain.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    void insertUser(User user);
    void updateUser(User user);
    void deleteUser(Integer userId);
    User findById(Integer userId);
    List<User> findUserByName(String name);
    int findTotal();
}
