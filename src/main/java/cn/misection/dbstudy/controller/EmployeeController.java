package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Employee;
import cn.misection.dbstudy.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    /*查询所有员工*/
    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Employee> employees=employeeService.selectAll();
        model.addAttribute("employees",employees);
        return "employee";
    }

    /*一个员工*/
    @RequestMapping("/one")
    public String selectByEno(@RequestParam("eno") String eno,Model model){
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(employeeService.selectByEno(eno));
        model.addAttribute("employees",employees);
        return "employee";
    }

    /*插入一个员工*/
    @RequestMapping("/insert")
    public String insertEmployee(@RequestParam("eno") String eno,
                                 @RequestParam("zno") String zno,
                                 @RequestParam("ename") String ename,
                                 @RequestParam("eage") int  eage,
                                 @RequestParam("esex") String esex,
                                 @RequestParam("position") String position,
                                 @RequestParam("econtact") String econtact){
        employeeService.insertEmployee(eno,zno,ename,eage,esex,position,econtact);
        return "redirect:/employee/all";
    }

    /*删除一个员工*/
    @RequestMapping("/delete")
    public String deleteEmployee(@RequestParam("eno") String eno){
        employeeService.deleteEmployee(eno);
        return "redirect:/employee/all";
    }
}
