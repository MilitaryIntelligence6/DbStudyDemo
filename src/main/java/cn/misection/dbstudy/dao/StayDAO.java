package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Stay;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface StayDAO {

    @Select("select * from staylzq order by sno")
    ArrayList<Stay> selectAll();

    @Select("select * from staylzq where sno=#{sno}")
    Stay selectOne(@Param("sno") String sno);

    @Insert("insert into staylzq(sno,ftime,ttime,aggrement) " +
            "values(#{sno},#{ftime},#{ttime},#{aggrement})")
    void insertStay(@Param("sno") String sno,
                    @Param("ftime") String ftime,
                    @Param("ttime") String ttime,
                    @Param("aggrement") String aggrement
                    );

    @Delete("delete from statylzq where sno=#{sno}")
    void deleteStay(@Param("sno") String sno);
}
