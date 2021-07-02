package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.PayRent;
import cn.misection.dbstudy.service.PayRentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/payrent")
public class PayRentController {

    @Autowired
    private PayRentService payRentService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<PayRent> payRents=payRentService.selectAll();
        model.addAttribute("payRents",payRents);
        return "payrent";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("tid")String tid,Model model){
        ArrayList<PayRent> payRents=new ArrayList<>();
        payRents.add(payRentService.selectOne(tid));
        model.addAttribute("payRents",payRents);
        return "payrent";
    }

    @RequestMapping("/insert")
    public String insertPayRent(@RequestParam("tid") String tid,
                                @RequestParam("time") String time,
                                @RequestParam("type") String type,
                                @RequestParam("account") int account
                                ){
        payRentService.insertPayRent(tid,time,type,account);
        return "redirect:/payrent/all";
    }

    @RequestMapping("/delete")
    public String deletePayRent(@RequestParam("tid") String tid){
        payRentService.deletePayRent(tid);
        return "redirect:/payrent/all";
    }
}
