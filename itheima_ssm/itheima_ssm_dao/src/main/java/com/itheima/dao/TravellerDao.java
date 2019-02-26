package com.itheima.dao;

import com.itheima.domain.Orders;
import com.itheima.domain.Traveller;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**游客信息持久层接口
 * @author Small
 */

public interface TravellerDao {


    /**
     * 通过游客id查询
     * @return
     * @param ordersId
     */
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    List<Traveller> findByOrdersId(String ordersId);



}
