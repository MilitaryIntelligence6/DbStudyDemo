package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Discipline;
import cn.misection.dbstudy.service.DisciplineService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/discipline")
public class DisciplineController {

    @Autowired
    private DisciplineService disciplineService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Discipline> disciplines=disciplineService.selectAll();
        model.addAttribute("disciplines",disciplines);
        return "discipline";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("sno") String sno,@RequestParam("time") String time,Model model){
        ArrayList<Discipline> disciplines=new ArrayList<>();
        Discipline discipline=disciplineService.selectOne(sno,time);
        disciplines.add(discipline);
        model.addAttribute("disciplines",disciplines);
        return "discipline";
    }

    @RequestMapping("/insert")
    public String insertDiscipline(@RequestParam("sno") String sno,
                                   @RequestParam("time") String time,
                                   @RequestParam("information") String information){
        disciplineService.insertDiscipline(sno,time,information);
        return "redirect:/discipline/all";
    }

    @RequestMapping("/delete")
    public String deleteDiscipline(@Param("sno") String sno,
                                   @Param("time") String time){
        disciplineService.deleteDiscipline(sno,time);
        return "redirect:/discipline/all";
    }
}
