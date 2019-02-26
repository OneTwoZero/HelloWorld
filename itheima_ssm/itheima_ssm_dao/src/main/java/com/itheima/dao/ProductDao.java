package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.security.acls.model.Sid;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 产品持久层接口
 *
 * @author Small
 */

public interface ProductDao {
    /**
     * 查询所有
     *
     * @return
     * @throws Exception
     */
    @Select("select * from product ")
    List<Product> findAll() throws Exception;

    /**
     * 保存product表单条数据
     *
     * @param product
     */
    @Insert("insert into product(productNum,productName,cityName,departureTime,productPrice,productDesc,productStatus) " +
            "values(#{productNum},#{productName},#{cityName},#{departureTime},#{productPrice},#{productDesc},#{productStatus})")
    void save(Product product) throws Exception;

    /**通过id查询product信息
     * @param id
     * @return
     */
    @Select("select * from product where id=#{id}")
    Product findById(String id);
}
