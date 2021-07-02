package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.CourseDAO;
import cn.misection.dbstudy.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseDAO courseDAO;

    public int addCourse(Course course){
        return courseDAO.addCourse(course);
    }

    public void deleteById(int id){
        courseDAO.deleteById(id);
    }

    public Course selectById(int id){
        return courseDAO.selectById(id);
    }
}
