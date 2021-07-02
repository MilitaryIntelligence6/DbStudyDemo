package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.EmployeeDAO;
import cn.misection.dbstudy.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;

    public ArrayList<Employee> selectAll(){
        return employeeDAO.selectAll();
    }

    public Employee selectByEno(String eno){
        return employeeDAO.selectByEno(eno);
    }

    public void insertEmployee(String eno,
                               String zno,
                               String ename,
                               int eage,
                               String esex,
                               String position,
                               String econtact){
        employeeDAO.insertEmployee(eno,
                zno,
                ename,
                eage,
                esex,
                position,
                econtact);
    }

    public void deleteEmployee(String eno){
        employeeDAO.deleteEmloyee(eno);
    }
}
