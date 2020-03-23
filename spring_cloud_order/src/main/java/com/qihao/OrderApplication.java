package com.qihao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 16:18
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
//@EnableHystrix //启动Hystrix
@EnableCircuitBreaker
@MapperScan("com.qihao.mapper")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
