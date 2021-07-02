package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Login;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface LoginDAO {

    @Select("select * from userlx where username=#{username}")
    Login selectByUserName(@Param("username") String username);
}
