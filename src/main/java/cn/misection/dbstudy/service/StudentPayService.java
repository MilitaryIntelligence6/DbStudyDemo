package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.StudentPayDAO;
import cn.misection.dbstudy.entity.StudentPay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentPayService {

    @Autowired
    private StudentPayDAO studentPayDAO;

    public ArrayList<StudentPay> selectAll() {
        return studentPayDAO.selectAll();
    }

    public StudentPay selectOne(String sno) {
        return studentPayDAO.selectOne(sno);
    }

    public void insertStudentPay(String sno,
                                 String stype,
                                 String time,
                                 int amount){
        studentPayDAO.insertStudentPay(sno,stype,time,amount);
    }

    public void deleteStudentPay(String sno){
        studentPayDAO.deleteStudentPay(sno);
    }

}
