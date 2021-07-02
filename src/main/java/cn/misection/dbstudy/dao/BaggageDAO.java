package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Baggage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface BaggageDAO {

    @Select("select * from baggagelzq order by sno,in_time")
    ArrayList<Baggage> selectAll();

    @Select("select * from baggagelzq where sno=#{sno} and in_time=#{in_time}")
    Baggage selectOne(@Param("sno") String sno,@Param("in_time") String in_time);

    @Insert("insert into baggagelzq values(#{sno},#{in_time},#{ex_time},#{note})")
    void insertBaggage(@Param("sno") String sno,
                       @Param("in_time") String in_time,
                       @Param("ex_time") String ex_time,
                       @Param("note") String note);


}
