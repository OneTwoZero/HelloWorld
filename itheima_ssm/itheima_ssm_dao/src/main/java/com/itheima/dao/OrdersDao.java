package com.itheima.dao;

import com.itheima.domain.Member;
import com.itheima.domain.Orders;
import com.itheima.domain.Product;
import com.itheima.domain.Traveller;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单持久层接口
 *
 * @author Small
 */

public interface OrdersDao {


    /**
     * 查询所有订单
     *
     * @return
     */
    @Select("select * from orders")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "product", column = "productId", javaType = Product.class,
                    one = @One(select = "com.itheima.dao.ProductDao.findById"))
    }
    )
    List<Orders> findAll();


    /**查询订单详情
     * @param id
     * @return
     */

    @Select("select * from orders where id =#{id}")
    @Results({@Result(id = true, property = "id", column = "id"),
            @Result(property = "orderNum", column = "orderNum"),
            @Result(property = "orderTime", column = "orderTime"),
            @Result(property = "peopleCount", column = "peopleCount"),
            @Result(property = "orderDesc", column = "orderDesc"),
            @Result(property = "payType", column = "payType"),
            @Result(property = "orderStatus", column = "orderStatus"),
            @Result(property = "product", column = "productId", javaType = Product.class,
                    one = @One(select = "com.itheima.dao.ProductDao.findById")),
            @Result(property = "travellers", column = "id", javaType = java.util.List.class,
                    many = @Many(select = "com.itheima.dao.TravellerDao.findByOrdersId")),
            @Result(property = "member", column = "memberId", javaType = Member.class,
                    one = @One(select = "com.itheima.dao.MemberDao.findById"))
    }
    )
    Orders findById(String id);
}
