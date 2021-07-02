package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.ElectricApplication;
import cn.misection.dbstudy.service.ElectricApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/electric_application")
public class ElectricApplicationController {

    @Autowired
    private ElectricApplicationService electricApplicationService;

    @RequestMapping("/all")
    public String selectAll(Model model) {
        ArrayList<ElectricApplication> electricApplications = electricApplicationService.selectAll();
        model.addAttribute("electric_applications", electricApplications);
        return "electricApplication";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("eno") String eno, Model model) {
        ArrayList<ElectricApplication> electricApplications = new ArrayList<>();
        ElectricApplication electricApplication = electricApplicationService.selectOne(eno);
        electricApplications.add(electricApplication);
        model.addAttribute("electric_applications", electricApplications);
        return "electricApplication";
    }

    @RequestMapping("/insert")
    public String insertElectric_Application(@RequestParam("eno") String eno,
                                             @RequestParam("sno") String sno,
                                             @RequestParam("ename") String ename) {
        electricApplicationService.insertElectric_Application(eno, sno, ename);
        return "redirect:/electric_application/all";
    }
}
