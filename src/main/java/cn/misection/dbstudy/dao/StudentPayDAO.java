package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.StudentPay;
import org.apache.ibatis.annotations.*;

import java.util.ArrayList;

@Mapper
public interface StudentPayDAO {

    @Select("select * from student_paylzq order by sno")
    ArrayList<StudentPay> selectAll();

    @Select("select * from student_paylzq where sno=#{sno}")
    StudentPay selectOne(@Param("sno") String sno);

    @Insert("insert into student_paylzq(sno,stype,time,amount) values(#{sno},#{stype},#{time},#{amount}) ")
    void insertStudentPay(@Param("sno") String sno,
                          @Param("stype") String stype,
                          @Param("time") String time,
                          @Param("amount") int amount);

    @Delete("delete from student_paylzq where sno=#{sno}")
    void deleteStudentPay(@Param("sno") String sno);
}
