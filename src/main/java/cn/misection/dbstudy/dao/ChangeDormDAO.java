package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.ChangeDorm;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ChangeDormDAO {

    @Select("select * from change_dormlzq order by sno,time")
    ArrayList<ChangeDorm> selectAll();

    @Select("select * from change_dormlzq where sno=#{sno} and time=#{time}")
    ChangeDorm selectOne(@Param("sno") String sno, @Param("time") String time);

    @Insert("insert into change_dormlzq values(#{sno},#{pre_dorm},#{now_dorm},#{time})")
    void insertChangeDorm(@Param("sno") String sno,
                          @Param("pre_dorm") String preDorm,
                          @Param("now_dorm") String nowDorm,
                          @Param("time") String time);

    @Delete("delete from change_dormlzq where sno=#{sno} and time=#{time}")
    void deleteChangeDorm(@Param("sno") String sno,@Param("time") String time);
}
