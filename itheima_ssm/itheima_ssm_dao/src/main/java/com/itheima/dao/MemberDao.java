package com.itheima.dao;

import com.itheima.domain.Member;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**联系人持久层
 * @author Small
 */

public interface MemberDao {


    /**查询单条会员信息
     * @return
     * @throws Exception
     * @param id
     *
     */
    @Select("select * from member where id=#{id}")
    Member findById(String id) throws Exception;

}
