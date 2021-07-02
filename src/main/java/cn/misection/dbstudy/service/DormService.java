package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.DormDAO;
import cn.misection.dbstudy.entity.Dorm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DormService {

    @Autowired
    private DormDAO dormDAO;

    public ArrayList<Dorm> selectAll(){
        return dormDAO.selectAll();
    }

    public ArrayList<Dorm> selectByZno(String zno){
        return dormDAO.selectByZno(zno);
    }

    public Dorm selectByDno(String zno,String dno){
        return dormDAO.selectByDno(zno,dno);
    }

    public void insertDorm(String zno,String dno,String contain,int electricity,int water){
        dormDAO.insertDorm(zno,dno,contain,electricity,water);
    }

    public void deleteDorm(String zno,String dno){
        dormDAO.deleteDorm(zno,dno);
    }
}
