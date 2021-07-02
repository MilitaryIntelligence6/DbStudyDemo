package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.ElectricApplication;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;

@Mapper
public interface Electric_ApplicationDAO {

    @Select("select * from electric_applicationlzq order by eno")
    ArrayList<ElectricApplication> selectAll();

    @Select("select * from electric_applicationlzq where eno=#{eno}")
    ElectricApplication selectOne(@Param("eno") String eno);

    @Insert("insert into electric_applicationlzq values(#{eno},#{sno},#{ename})")
    void insertElectric_Application(@Param("eno") String eno,
                                    @Param("sno") String sno,
                                    @Param("ename") String ename);

}
