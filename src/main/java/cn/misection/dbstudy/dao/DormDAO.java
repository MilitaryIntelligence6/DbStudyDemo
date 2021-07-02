package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Dorm;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface DormDAO {

    @Select("select * from dormlzq order by zno,dno")
    ArrayList<Dorm> selectAll();

    @Select("select * from dormlzq where zno=#{zno} order by dno")
    ArrayList<Dorm> selectByZno(@Param("zno") String zno);

    @Select("select * from dormlzq where zno=#{zno} and dno=#{dno}")
    Dorm selectByDno(@Param("zno") String zno,@Param("dno") String dno);

    @Insert("insert into dormlzq " +
            "values(#{zno},#{dno},#{contain},#{electricity},#{water})")
    void insertDorm(@Param("zno") String zno,@Param("dno") String dno,@Param("contain") String contain,@Param("electricity") int electricity,@Param("water") int water);

    @Delete("delete from dorm where zno=#{zno} and dno=#{dno}")
    void deleteDorm(@Param("zno") String zno,@Param("dno") String dno);
}
