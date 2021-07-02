package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Student;
import cn.misection.dbstudy.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    /*所有学生*/
    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Student> students=studentService.selectAll();
        model.addAttribute("students",students);
        return "student";
    }

    /*根据学号查询*/
    @RequestMapping("/one")
    public String selectBySno(@RequestParam("sno") String sno,Model model){
        ArrayList<Student> students=new ArrayList<>();
        Student student=studentService.selectBySno(sno);
        students.add(student);
        model.addAttribute("students",students);
        return "student";
    }

    /*插入一个学生*/
    @RequestMapping("/insert")
    public String insertStudent(@Param("sno") String sno,
                                @Param("sname") String sname,
                                @Param("college") String college,
                                @Param("dept") String dept,
                                @Param("classNo") String classNo,
                                @Param("sex") String sex,
                                @Param("scontact") String scontact,
                                @Param("discipline") String discipline
                                ){
        studentService.insertStudent(sno,sname,college,dept,classNo,sex,scontact,discipline);
        return "redirect:/student/all";
    }

    /*删除一个学生*/
    @RequestMapping("/delete")
    public String deleteBySno(@Param("sno") String sno){
        studentService.deleteBySno(sno);
        return "redirect:/student/all";
    }
}
