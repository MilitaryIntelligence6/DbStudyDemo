package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Zone;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface ZoneDAO {

    @Select("select * from zonelzq order by zno")
    ArrayList<Zone> selectAll();

    @Select("select * from zonelzq where zno=#{zno}")
    Zone selectByZno(@Param("zno") String zno);

    @Insert("insert into zonelzq values(#{zno},#{zname},#{sex},#{fee},#{accommodation},#{remain})")
    void insertZone(@Param("zno") String zno,
                    @Param("zname") String zname,
                    @Param("sex") String sex,
                    @Param("fee") int fee,
                    @Param("accommodation") String accommodation,
                    @Param("remain") int remain);

    @Update("update zonelzq set remain=#{remain} where zno=#{zno}")
    void updateZone(@Param("remain") int remain,@Param("zno") String zno);

    @Delete("delete from zonelzq where zno=#{zno}")
    void deleteByZno(@Param("zno") String zno);


}
