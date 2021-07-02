package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Visitor;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface VisitorDAO {

    @Select("select * from visitorlzq order by vid,vtime")
    ArrayList<Visitor> selectAll();

    @Select("select * from visitorlzq where vid=#{vid} and vtime=#{vtime}")
    Visitor selectOne(@Param("vid") String vid,@Param("vtime") String vtime);

    @Insert("insert into visitorlzq values(#{sno},#{vid},#{vname},#{relationship},#{vtime},#{contact})")
    void insertVisitor(@Param("sno") String sno,
                       @Param("vid") String vid,
                       @Param("vname") String vname,
                       @Param("relationship") String relationship,
                       @Param("vtime") String vtime,
                       @Param("contact") String contact);

    @Delete("delete from visitorlzq where vid=#{vid} and vtime=#{vtime}")
    void deleteVisitor(@Param("vid") String vid,@Param("vtime") String vtime);

}
