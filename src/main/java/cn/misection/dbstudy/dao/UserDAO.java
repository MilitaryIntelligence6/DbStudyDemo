package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface UserDAO {

    @Select("select * from userlx order by id")
    ArrayList<User> selectAll();

    @Select("select id,username,password from userlx where id=#{id}")
    User selectById(@Param("id") int id);

    @Insert("insert into userlx values(#{id},#{username},#{password})")
    void insertUser(@Param("id") int id,@Param("username") String username,@Param("password") String password);
}
