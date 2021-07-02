package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Baggage;
import cn.misection.dbstudy.service.BaggageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/baggage")
public class BaggageController {

    @Autowired
    private BaggageService baggageService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Baggage> baggages=baggageService.selectAll();
        model.addAttribute("baggages",baggages);
        return "baggage";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("sno") String sno,@RequestParam("in_time") String in_time,Model model){
        ArrayList<Baggage> baggages=new ArrayList<>();
        baggages.add(baggageService.selectOne(sno,in_time));
        model.addAttribute("baggages",baggages);
        return "baggage";
    }

    @RequestMapping("/insert")
    public String insertBaggages(@RequestParam("sno") String sno,
                                 @RequestParam("in_time") String in_time,
                                 @RequestParam("ex_time") String ex_time,
                                 @RequestParam("note") String note){
        baggageService.insertBaggage(sno,in_time,ex_time,note);
        return "redirect:/baggage/all";
    }
}
