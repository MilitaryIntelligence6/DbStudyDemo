package cn.misection.dbstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home(){
        return "redirect:/login";
    }

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String error(){
        return "main";
    }
}
