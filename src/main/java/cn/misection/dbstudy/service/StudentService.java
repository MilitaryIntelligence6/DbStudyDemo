package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.StudentDAO;
import cn.misection.dbstudy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    public ArrayList<Student> selectAll(){
        return studentDAO.selectAll();
    }

    public Student selectBySno(String sno){
        return studentDAO.selectBySno(sno);
    }

    public void insertStudent(String sno,
                              String sname,
                              String college,
                              String dept,
                              String classNo,
                              String sex,
                              String scontact,
                              String discipline
                              ){
        studentDAO.insertStudent(
                sno,
                sname,
                college,
                dept,
                classNo,
                sex,
                scontact,
                discipline);
    }

    public void deleteBySno(String sno){
        studentDAO.deleteBySno(sno);
    }
}
