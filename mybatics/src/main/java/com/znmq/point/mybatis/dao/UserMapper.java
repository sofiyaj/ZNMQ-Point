package com.znmq.point.mybatis.dao;

import com.znmq.point.mybatis.entity.UserPoint;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


/**
 * @Author: Sofiya
 * @Description: TODO
 * @Date 2020/4/23:59 下午
 * @Email: wangjie@znjs.com
 */

@Repository
@Mapper
public interface UserMapper {

    @Select("select * from user_point where id = #{id}")
    UserPoint Sel (@Param("id") int id);
}
