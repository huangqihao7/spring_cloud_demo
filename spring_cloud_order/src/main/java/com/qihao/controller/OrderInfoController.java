package com.qihao.controller;

import com.qihao.fegin.UserFegin;
import com.qihao.pojo.OrderInfo;
import com.qihao.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 16:15
 */
@RestController
@RequestMapping("/order")
public class OrderInfoController {

    @Autowired
    private OrderInfoService orderService;

    @Autowired
    private UserFegin userFegin;

    @RequestMapping("/findOrder")
    public List<OrderInfo> findOrder(){
        System.out.println(userFegin.findUser());
        return orderService.findOrder();
    }
}
