package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Employee;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface EmployeeDAO {

    @Select("select * from employeelzq order by eno")
    ArrayList<Employee> selectAll();

    @Select("select * from employeelzq where eno=#{eno}")
    Employee selectByEno(@Param("eno") String eno);

    @Insert("insert into employeelzq " +
            "values(#{eno},#{zno},#{ename},#{eage},#{esex},#{position},#{econtact})")
    void insertEmployee(@Param("eno") String eno,
                        @Param("zno") String zno,
                        @Param("ename") String ename,
                        @Param("eage") int eage,
                        @Param("esex") String esex,
                        @Param("position") String position,
                        @Param("econtact") String econtact);

    @Delete("delete from employeelzq where eno=#{eno}")
    void deleteEmloyee(@Param("eno") String eno);

}
