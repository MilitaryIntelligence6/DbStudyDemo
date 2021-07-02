package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.Tenant;
import cn.misection.dbstudy.service.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("/tenant")
public class TenantController {

    @Autowired
    private TenantService tenantService;

    @RequestMapping("/all")
    public String selectAll(Model model){
        ArrayList<Tenant> tenants=tenantService.selectAll();
        model.addAttribute("tenants",tenants);
        return "tenant";
    }

    @RequestMapping("/one")
    public String selectOne(@RequestParam("tid") String tid,Model model){
        ArrayList<Tenant> tenants=new ArrayList<>();
        tenants.add(tenantService.selectOne(tid));
        model.addAttribute("tenants",tenants);
        return "tenant";
    }

    @RequestMapping("/insert")
    public String insertTenant(@RequestParam("tid") String tid,
                               @RequestParam("tname") String tname,
                               @RequestParam("contact") String contact,
                               @RequestParam("sex") String sex){
        tenantService.insertTenant(tid, tname, contact,sex);
        return "redirect:/tenant/all";
    }

    @RequestMapping("/delete")
    public String deleteTenant(@RequestParam("tid") String tid){
        tenantService.deleteTenant(tid);
        return "redirect:/tenant/all";
    }
}
