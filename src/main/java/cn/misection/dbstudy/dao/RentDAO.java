package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Rent;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface RentDAO {

    @Select("select * from rentlzq order by tid")
    ArrayList<Rent> selectAll();

    @Select("select * from rentlzq where tid=#{tid}")
    Rent selectOne(@Param("tid") String tid);

    @Insert("insert into rentlzq(tid,zno,dno,check_in,bed,pick_out) values(#{tid},#{zno},#{dno},#{check_in},#{bed},#{pick_out})")
    void insertRent(@Param("tid") String tid,
                    @Param("zno") String zno,
                    @Param("dno") String dno,
                    @Param("check_in") String check_in,
                    @Param("bed") String bed,
                    @Param("pick_out") String pick_out);

    @Delete("delete from rentlzq where tid=#{tid}")
    void deleteRent(@Param("tid") String tid);
}
