package com.itheima.dao;

import com.itheima.domain.Role;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Small
 */
public interface RoleDao {

    /**findByUserId
     * @param userId
     * @return
     */
    @Select("select * from role where id in (select roleId from users_role where userId=#{userId})")
    List<Role> findByUserId(String userId);
}
