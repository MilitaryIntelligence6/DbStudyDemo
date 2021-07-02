package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Zone;
import cn.misection.dbstudy.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/zone")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    /*显示园区列表*/
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String selectAll(Model model){
        ArrayList<Zone> zones=zoneService.selectAll();
        model.addAttribute("zones",zones);
        return "zone";
    }

    /*查询某一个园区*/
    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public String selectByZno(@RequestParam("zno") String zno,Model model) {
        ArrayList<Zone> zones=new ArrayList<>();
        zones.add(zoneService.selectByZno(zno));
        model.addAttribute("zones",zones);
        return "zone";
    }

    /*添加按钮*/
    @RequestMapping("/insert")
    public String insertZone(@RequestParam("zno") String zno,
                             @RequestParam("zname") String zname,
                             @RequestParam("sex") String sex,
                             @RequestParam("fee") int fee,
                             @RequestParam("accommodation") String accommodation,
                             @RequestParam("remain") int remain){
        zoneService.insertZone(zno,zname,sex,fee,accommodation,remain);

        return "redirect:/zone/all";
    }

    /*删除按钮*/
    @RequestMapping("/delete")
    public String deleteZone(@RequestParam("zno") String zno){
        zoneService.deleteZone(zno);
        return "redirect:/zone/all";
    }
}
