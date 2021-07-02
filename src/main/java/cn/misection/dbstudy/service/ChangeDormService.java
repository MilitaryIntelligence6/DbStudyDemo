package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.ChangeDormDAO;
import cn.misection.dbstudy.entity.ChangeDorm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ChangeDormService {

    @Autowired
    private ChangeDormDAO change_dormDAO;

    public ArrayList<ChangeDorm> selectAll(){
        return change_dormDAO.selectAll();
    }

    public ChangeDorm selectOne(String sno, String time){
        return change_dormDAO.selectOne(sno,time);
    }

    public void insertChangeDorm(String sno,String pre_dorm,String now_dorm,String time){
        change_dormDAO.insertChangeDorm(sno,pre_dorm,now_dorm,time);
    }

    public void deleteChangeDorm(String sno,String time){
        change_dormDAO.deleteChangeDorm(sno,time);
    }
}
