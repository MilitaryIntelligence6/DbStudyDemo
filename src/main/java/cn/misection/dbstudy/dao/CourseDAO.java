package cn.misection.dbstudy.dao;

import cn.misection.dbstudy.entity.Course;
import org.apache.ibatis.annotations.*;

@Mapper
public interface CourseDAO {

    /**
     * 新增
     **/
    @Insert("insert into course(cname,cpno,credit) values (#{cname},#{cpno},#{credit})")
    int addCourse(Course course);

    /**
     * 删除
     **/
    @Delete("delete from course where cno=#{cno}")
    void deleteById(@Param("cno") int cno);

    /**
     * 查询
     **/
    @Select("select * from course where cno=#{cno}")
    Course selectById(@Param("cno") int cno);
}
