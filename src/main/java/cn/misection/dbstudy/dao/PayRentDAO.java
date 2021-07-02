package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.PayRent;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface PayRentDAO {

    @Select("select * from pay_rentlzq order by tid")
    ArrayList<PayRent> selectAll();

    @Select("select * from pay_rentlzq where tid=#{tid}")
    PayRent selectOne(String tid);

    @Insert("insert into pay_rentlzq(tid,time,type,account) " +
            "values(#{tid},#{time},#{type},#{account})")
    void insertPayRent(@Param("tid") String tid,
                       @Param("time") String time,
                       @Param("type") String type,
                       @Param("account") int account);

    @Delete("delete from pay_rentlzq where tid=#{tid}")
    void deletePayRent(@Param("tid") String tid);
}
