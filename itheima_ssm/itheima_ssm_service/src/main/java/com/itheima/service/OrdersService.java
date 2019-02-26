package com.itheima.service;

import com.itheima.domain.Orders;
import com.itheima.domain.Product;

import java.util.List;

/**
 * 订单业务层接口
 *
 * @author Small
 */
public interface OrdersService {

    /**
     * 查询所有订单
     *
     * @param pageNum
     * @param pageSize
     * @return
     * @throws Exception
     */
    List<Orders> findAll(int pageNum, int pageSize) throws Exception;

    /**
     * 查询详情通过id
     *
     * @param ordersId
     * @return
     */
    Orders findById(String ordersId) throws Exception;
}
