package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Dorm;
import cn.misection.dbstudy.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/dorm")
public class DormController {

    @Autowired
    private DormService dormService;

    /*查询所有寝室*/
    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Dorm> dorms=dormService.selectAll();
        model.addAttribute("dorms",dorms);
        return "dorm";
    }

    /*查询在一个园区中的寝室*/
    @RequestMapping("/list")
    public String selectByZno(@RequestParam("zno") String zno, Model model){
        ArrayList<Dorm> dorms=dormService.selectByZno(zno);
        model.addAttribute("zno",zno);
        model.addAttribute("dorms",dorms);
        return "dorm";
    }

    /*根据园区和寝室号查询寝室*/
    @RequestMapping("/one")
    public String selectByDno(@RequestParam("zno") String zno,@RequestParam("dno") String dno,Model model){
        ArrayList<Dorm> dorms=new ArrayList<>();
        dorms.add(dormService.selectByDno(zno,dno));
        model.addAttribute("zno",zno);
        model.addAttribute("dno",dno);
        model.addAttribute("dorms",dorms);
        return "dorm";
    }

    @RequestMapping("/insert")
    public String insertDorm(@RequestParam("zno") String zno,
                             @RequestParam("dno") String dno,
                             @RequestParam("contain") String contain,
                             @RequestParam("electricity") int electricity,
                             @RequestParam("water") int water){
        dormService.insertDorm(zno,dno,contain,electricity,water);
        return "redirect:/dorm/all";
    }
}
