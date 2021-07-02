package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Discipline;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface DisciplineDAO {

    @Select("select * from disciplinelzq order by sno,time")
    ArrayList<Discipline> selectAll();

    @Select("select * from disciplinelzq where sno=#{sno} and time=#{time}")
    Discipline selectOne(@Param("sno") String sno,@Param("time") String time);

    @Insert("insert into disciplinelzq values(#{sno},#{time},#{information})")
    void insertDiscipline(@Param("sno") String sno,@Param("time") String time,@Param("information") String information);

    @Delete("delete from disciplinelzq where sno=#{sno} and time=#{time}")
    void deleteDiscipline(@Param("sno") String sno,@Param("time") String time);
}
