package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:27 2018/11/1
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
