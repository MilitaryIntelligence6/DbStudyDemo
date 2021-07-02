package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    /*返回login登陆页面*/
    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    /*登陆操作*/
    @RequestMapping(value = "/log",method = RequestMethod.POST)
    public String log(Model model,
                        @RequestParam("username") String username,
                        @RequestParam("password") String password,
                        HttpSession session){
        Map<String,String> map=loginService.login(username,password);
        if(map.containsKey("msg")){
            model.addAttribute("msg",map.get("msg"));
            return "login";
        }
        //成功登陆的情况了，最简单的情况，在session中存放username
        session.setAttribute("username",username);
        model.addAttribute("username",username);
        return "main";
    }
}
