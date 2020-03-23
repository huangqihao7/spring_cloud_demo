package com.qihao.service;

import com.qihao.pojo.OrderInfo;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 16:13
 */
public interface OrderInfoService {

    List<OrderInfo> findOrder();
}
