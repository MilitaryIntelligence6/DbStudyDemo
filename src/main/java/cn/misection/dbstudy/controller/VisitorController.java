package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Visitor;
import cn.misection.dbstudy.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/visitor")
public class VisitorController {

    @Autowired
    private VisitorService visitorService;

    /*所有的访客*/
    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Visitor> visitors=visitorService.selectAll();
        model.addAttribute("visitors",visitors);
        return "visitor";
    }

    /*查询一个访客*/
    @RequestMapping("/one")
    public String selectOne(@RequestParam("vid") String vid, @RequestParam("vtime") String vtime,Model model){
        ArrayList<Visitor> visitors=new ArrayList<>();
        Visitor visitor=visitorService.selectOne(vid,vtime);
        visitors.add(visitor);
        model.addAttribute("visitors",visitors);
        return "visitor";
    }

    /*插入一个访客*/
    @RequestMapping("/insert")
    public String insertVisitor(@RequestParam("sno") String sno,
                                @RequestParam("vid") String vid,
                                @RequestParam("vname") String vname,
                                @RequestParam("relationship") String relationship,
                                @RequestParam("vtime") String vtime,
                                @RequestParam("contact") String contact){
        visitorService.insertVisitor(sno,vid,vname,relationship,vtime,contact);
        return "redirect:/visitor/all";
    }

    /*删除一个访客记录*/
    @RequestMapping("/delete")
    public String deleteVisitor(@RequestParam("vid") String vid,
                                @RequestParam("vtime") String vtime){
        visitorService.deleteVisitor(vid,vtime);
        return "redirect:/visitor/all";
    }
}
