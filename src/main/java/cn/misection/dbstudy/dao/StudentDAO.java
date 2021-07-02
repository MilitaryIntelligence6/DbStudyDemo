package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface StudentDAO {

    @Select("select * from studentlzq order by sno")
    ArrayList<Student> selectAll();

    @Select("select * from studentlzq where sno=#{sno}")
    Student selectBySno(@Param("sno") String sno);

    @Insert("insert into studentlzq " +
            "values(#{sno},#{sname},#{college},#{dept},#{classNo},#{sex},#{scontact},#{discipline})")
    void insertStudent(@Param("sno") String sno,
                       @Param("sname") String sname,
                       @Param("college") String college,
                       @Param("dept") String dept,
                       @Param("classNo") String classNo,
                       @Param("sex") String sex,
                       @Param("scontact") String scontact,
                       @Param("discipline") String discipline
                       );

    @Delete("delete from studentlzq where sno=#{sno}")
    void deleteBySno(@Param("sno") String sno);
}
