package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Rent;
import cn.misection.dbstudy.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/rent")
public class RentController {

    @Autowired
    private RentService rentService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Rent> rents=rentService.selectAll();
        model.addAttribute("rents",rents);
        return "rent";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("tid") String tid,
                            Model model){
        ArrayList<Rent> rents=new ArrayList<>();
        rents.add(rentService.selectOne(tid));
        model.addAttribute("rents",rents);
        return "rent";
    }

    @RequestMapping("/insert")
    public String insertRent(@RequestParam("tid") String tid,
                             @RequestParam("zno") String zno,
                             @RequestParam("dno") String dno,
                             @RequestParam("check_in") String check_in,
                             @RequestParam("bed") String bed,
                             @RequestParam("pick_out") String pick_out){
        rentService.insertRent(tid, zno, dno, check_in,bed, pick_out);
        return "redirect:/rent/all";
    }

    @RequestMapping("/delete")
    public String deleteRent(@RequestParam("tid") String tid){
        rentService.deleteRent(tid);
        return "redirect:/rent/all";
    }
}
