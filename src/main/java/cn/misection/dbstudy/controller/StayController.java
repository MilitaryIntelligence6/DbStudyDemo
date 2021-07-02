package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.dao.StayDAO;
import cn.misection.dbstudy.entity.Stay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/stay")
public class StayController {

    @Autowired
    private StayDAO stayDAO;

    @RequestMapping("/all")
    public String selectAll(Model model){
        model.addAttribute("stays",stayDAO.selectAll());
        return "stay";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("sno") String sno,
                            Model model){
        ArrayList<Stay> stays=new ArrayList<>();
        stays.add(stayDAO.selectOne(sno));
        model.addAttribute("stays",stays);
        return "stay";
    }

    @RequestMapping("/insert")
    public String insertStay(@RequestParam("sno") String sno,
                             @RequestParam("ftime") String ftime,
                             @RequestParam("ttime") String ttime,
                             @RequestParam("aggrement") String aggrement){
        stayDAO.insertStay(sno, ftime, ttime, aggrement);
        return "redirect:/stay/all";
    }

    @RequestMapping("/delete")
    public String deleteStay(@RequestParam("sno") String sno){
        stayDAO.deleteStay(sno);
        return "redirect:/stay/all";
    }
}
