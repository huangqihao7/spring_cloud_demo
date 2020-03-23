package com.qihao.config;

import com.qihao.fegin.UserFegin;
import com.qihao.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/3/6 16:46
 */
@Slf4j
@Component
public class UserFeignFallbackFactory implements UserFegin {


    @Override
    public List<User> findUser() {

        log.info("UserFeignFallbackFactory methed : findUser");
        return null;
    }
}
