package com.qihao.service.impl;

import com.qihao.mapper.UserMapper;
import com.qihao.pojo.User;
import com.qihao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 11:32
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findUser() {
        return userMapper.selectList(null);
    }
}
