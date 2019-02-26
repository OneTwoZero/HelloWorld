package com.itheima.dao;

import com.itheima.domain.UserInfo;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Small
 */

public interface UserDao {

    /**查询用户信息通过登录名
     * @param username
     * @return
     */
    @Select("select * from users where username=#{username}")
    @Results({@Result(id = true,property = "id",column = "id"),
    @Result(property ="username" ,column ="username" ),
    @Result(property ="email" ,column ="email" ),
    @Result(property ="password" ,column ="password" ),
    @Result(property ="phoneNum" ,column ="phoneNum" ),
    @Result(property ="status" ,column ="status" ),
    @Result(property ="roles" ,column ="id" ,javaType = List.class,many = @Many(select = "com.itheima.dao.RoleDao.findByUserId")),
    })
    UserInfo findByUserName(String username);
}
