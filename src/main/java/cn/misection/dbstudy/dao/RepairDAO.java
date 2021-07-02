package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Repair;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface RepairDAO {

    @Select("select * from repairlzq order by zno")
    ArrayList<Repair> selectAll();

    @Select("select * from repairlzq where zno=#{zno}")
    Repair selectOne(@Param("zno") String zno);

    @Insert("insert into repairlzq(zno,dno,gdate,contact,note)" +
            " values(#{zno},#{dno},#{gdate},#{contact},#{note})")
    void insertRepair(@Param("zno") String zno,
                      @Param("dno") String dno,
                      @Param("gdate") String gdate,
                      @Param("contact") String contact,
                      @Param("note") String note);

}
