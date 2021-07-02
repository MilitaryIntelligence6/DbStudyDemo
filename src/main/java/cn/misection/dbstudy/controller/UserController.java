package cn.misection.dbstudy.controller;

import cn.misection.dbstudy.entity.User;
import cn.misection.dbstudy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectAll",method = RequestMethod.GET)
    public String selectAll(Model model){
        ArrayList<User> users=userService.selectAll();
        model.addAttribute("users",users);
        return "fff";
    }

    @RequestMapping(value = "/selectById",method = RequestMethod.GET)
    public String selectById(Model model, @RequestParam("id") int id){
        User user=userService.selectById(id);
        ArrayList<User> users=new ArrayList<>();
        users.add(user);
        model.addAttribute("users",users);
        return "fff";
    }

    @RequestMapping("/insertUser")
    public String insertUser(@RequestParam("id") int id,@RequestParam("username") String username,@RequestParam("password") String password){
        userService.insertUser(id,username,password);
        return "redirect:/user/selectAll";
    }
}
