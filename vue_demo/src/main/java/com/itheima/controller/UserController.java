package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author: Mr_Zhao
 * @Description:
 * @Date: Create in 15:30 2018/11/1
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/findAll")
    public List<User> findAll() {

        return userService.findAll();
    }

    @GetMapping("/findOne/{id}")
    public  User findOne(@PathVariable("id") Integer id){
        return userService.findOne(id);
    }

    @PostMapping("/update")
    public  void update(@RequestBody User user){
        userService.update(user);
    }
}
