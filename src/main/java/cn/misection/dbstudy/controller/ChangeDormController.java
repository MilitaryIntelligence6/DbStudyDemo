package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.ChangeDorm;
import cn.misection.dbstudy.service.ChangeDormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/changeDorm")
public class ChangeDormController {

    @Autowired
    private ChangeDormService changeDormService;

    @RequestMapping("/all")
    public String selectAll(Model model) {
        ArrayList<ChangeDorm> changeDorms = changeDormService.selectAll();
        model.addAttribute("changeDorms", changeDorms);
        return "changeDorm";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("sno") String sno,
                            @RequestParam("time") String time, Model model) {
        ArrayList<ChangeDorm> changeDorms = new ArrayList<>();
        changeDorms.add(changeDormService.selectOne(sno, time));
        model.addAttribute("changeDorms", changeDorms);
        return "changeDorm";
    }

    @RequestMapping("/insert")
    public String insertChangeDorm(@RequestParam("sno") String sno,
                                   @RequestParam("pre_dorm") String preDorm,
                                   @RequestParam("now_dorm") String nowDorm,
                                   @RequestParam("time") String time) {
        changeDormService.insertChangeDorm(sno, preDorm, nowDorm, time);
        return "redirect:/changeDorm/all";
    }

    @RequestMapping("/delete")
    public String deleteChangeDorm(@RequestParam("sno") String sno,
                                   @RequestParam("time") String time) {
        changeDormService.deleteChangeDorm(sno, time);
        return "redirect:/changeDorm/all";
    }
}
