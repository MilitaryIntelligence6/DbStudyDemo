package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Tenant;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface TenantDAO {

    @Select("select * from tenantlzq order by tid")
    public ArrayList<Tenant> selectAll();

    @Select("select * from tenantlzq where tid=#{tid}")
    Tenant selectOne(@Param("tid") String tid);

    @Insert("insert into tenantlzq(tid,tname,contact,sex) values(#{tid},#{tname},#{contact},#{sex})")
    void insertTenant(@Param("tid") String tid,
                      @Param("tname") String tname,
                      @Param("contact") String contact,
                      @Param("sex") String sex);

    @Delete("delete from tenantlzq where tid=#{tid}")
    void deleteTenant(@Param("tid") String tid);
}
