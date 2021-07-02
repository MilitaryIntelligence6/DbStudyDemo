package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.StudentPay;
import cn.misection.dbstudy.service.StudentPayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/studentPay")
public class StudentPayController {

    @Autowired
    private StudentPayService studentPayService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<StudentPay> studentPays=studentPayService.selectAll();
        model.addAttribute("studentPays",studentPays);
        return "studentPay";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("sno") String sno,Model model){
        ArrayList<StudentPay> studentPays=new ArrayList<>();
        studentPays.add(studentPayService.selectOne(sno));
        model.addAttribute("studentPays",studentPays);
        return "studentPay";
    }

    @RequestMapping("/insert")
    public String insertStudentPay(@RequestParam("sno") String sno,
                                   @RequestParam("stype") String stype,
                                   @RequestParam("time") String time,
                                   @RequestParam("amount") int amount){
        studentPayService.insertStudentPay(sno,stype,time,amount);
        return "redirect:/studentPay/all";
    }

    @RequestMapping("/delete")
    public String deleteStudentPay(@RequestParam("sno") String sno){
        studentPayService.deleteStudentPay(sno);
        return "redirect:/studentPay/all";
    }
}
