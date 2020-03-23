package com.qihao.controller;

import com.qihao.pojo.User;
import com.qihao.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 11:28
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findUser")
    public List<User> findUser() {
        throw new RuntimeException();
        //return userService.findUser();
    }

}
