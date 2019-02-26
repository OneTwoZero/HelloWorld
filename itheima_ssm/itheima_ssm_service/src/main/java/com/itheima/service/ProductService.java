package com.itheima.service;

import com.itheima.domain.Product;

import java.util.List;

/**
 * 产品业务层接口
 *
 * @author Small
 */
public interface ProductService {
    /**
     * 查询所有
     *
     * @return
     * @throws Exception
     */
    List<Product> findAll() throws Exception;

    /**
     * 保存单条数据
     *
     * @param product
     */
    void save(Product product) throws Exception;

    /**
     * 查询单条产品信息
     * @param id
     * @return
     */
    Product findById(String id) throws Exception;

}
