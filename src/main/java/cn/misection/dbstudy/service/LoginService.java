package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.LoginDAO;
import cn.misection.dbstudy.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoginService {

    @Autowired
    private LoginDAO loginDAO;

    public Map<String,String> login(String username,String password){
        Map<String,String> map=new HashMap<>();

        if(StringUtils.isEmpty(username)){
            map.put("msg","用户名不能为空");
            return map;
        }

        if(StringUtils.isEmpty(password)){
            map.put("msg","密码不能为空");
            return map;
        }

        Login login =loginDAO.selectByUserName(username);

        /*System.out.println(login.getUsername());
        System.out.println(login.getPassword());*/
        if(login ==null){
            map.put("msg","用户名不存在");
            return map;
        }

        if(!login.getPassword().equals(login.getPassword())){
            map.put("msg","密码不正确");
            return map;
        }

        map.put("username",username);
        return map;
    }
}
