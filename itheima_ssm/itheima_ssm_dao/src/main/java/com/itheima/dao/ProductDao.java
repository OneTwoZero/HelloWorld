package com.itheima.dao;

import com.itheima.domain.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**产品持久层接口
 * @author Small
 */
@Repository
public interface ProductDao {
    /**查询所有
     * @return
     * @throws Exception
     */
    @Select("select * from product ")
    List<Product> findAll() throws Exception;
}
