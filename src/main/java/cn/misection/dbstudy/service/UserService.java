package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.UserDAO;
import cn.misection.dbstudy.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public ArrayList<User> selectAll(){
        return userDAO.selectAll();
    }

    public User selectById(int id){
        return userDAO.selectById(id);
    }

    public void insertUser(int id,String username,String password){
        userDAO.insertUser(id,username,password);
    }
}
