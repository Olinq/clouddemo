package com.hokli.seataorderservice.service;


import com.hokli.seataorderservice.domain.Order;

public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);
}
