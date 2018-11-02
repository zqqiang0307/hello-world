package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:28 2018/11/1
 */
public interface UserService {
    public List<User> findAll();

    public User findOne(int id);

    public void update(User user);
}
