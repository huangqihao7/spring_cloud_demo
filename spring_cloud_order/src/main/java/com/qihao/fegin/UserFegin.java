package com.qihao.fegin;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.qihao.config.UserFeignFallbackFactory;
import com.qihao.pojo.User;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 16:25
 */
@Component
@FeignClient(value = "userService", fallback = UserFeignFallbackFactory.class)
public interface UserFegin {

    //@HystrixCommand(fallbackMethod = "findUser")
    @RequestMapping(value = "/user/findUser")
    List<User> findUser();

}
