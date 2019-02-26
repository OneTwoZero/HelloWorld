package com.itheima.controller;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import com.itheima.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 订单Controller
 *
 * @author Small
 */
@Controller
@RequestMapping("/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;
    private  ModelAndView mav = new ModelAndView();

    @RequestMapping("/findAll")
    public ModelAndView findAll(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum, @RequestParam(name = "pageSize") Integer pageSize) throws Exception {
        List<Orders> orders = ordersService.findAll(pageNum, pageSize);
        PageInfo pageInfo = new PageInfo(orders);
        mav.addObject("pageInfo", pageInfo);
        mav.setViewName("orders-list");
        return mav;
    }

    @RequestMapping("/findById")
    public ModelAndView findById(@RequestParam(name = "id") String ordersId) throws Exception {
        Orders orders = ordersService.findById(ordersId);
        System.out.println(orders);
        mav.addObject("orders", orders);
        mav.setViewName("orders-show");
        return mav;
    }
}
