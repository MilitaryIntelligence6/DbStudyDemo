package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.dao.RepairDAO;
import cn.misection.dbstudy.entity.Repair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/repair")
public class RepairController {

    @Autowired
    private RepairDAO repairDAO;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Repair> repairs=repairDAO.selectAll();
        model.addAttribute("repairs",repairs);
        return "repair";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("zno") String zno,Model model){
        ArrayList<Repair> repairs=new ArrayList<>();
        repairs.add(repairDAO.selectOne(zno));
        model.addAttribute("repairs",repairs);
        return "repair";
    }

    @RequestMapping("/insert")
    public String insertRepair(@RequestParam("zno") String zno,
                               @RequestParam("dno") String dno,
                               @RequestParam("gdate") String gdate,
                               @RequestParam("contact") String contact,
                               @RequestParam("note") String note
                               ){
        repairDAO.insertRepair(zno, dno, gdate, contact, note);
        return "redirect:/repair/all";
    }
}
