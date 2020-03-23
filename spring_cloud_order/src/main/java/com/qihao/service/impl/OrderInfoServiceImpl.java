package com.qihao.service.impl;

import com.qihao.mapper.OrderInfoMapper;
import com.qihao.pojo.OrderInfo;
import com.qihao.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author huangqihao
 * @version 1.0
 * @date 2020/1/3 16:14
 */
@Service
public class OrderInfoServiceImpl implements OrderInfoService {

    @Autowired
    private OrderInfoMapper orderMapper;

    @Override
    public List<OrderInfo> findOrder() {
        return orderMapper.selectList(null);
    }
}
