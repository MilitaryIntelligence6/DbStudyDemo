package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.BaggageDAO;
import cn.misection.dbstudy.entity.Baggage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BaggageService {

    @Autowired
    private BaggageDAO baggageDAO;

    public ArrayList<Baggage> selectAll(){
        return baggageDAO.selectAll();
    }

    public Baggage selectOne(String sno,String in_time){
        return baggageDAO.selectOne(sno,in_time);
    }

    public void insertBaggage(String sno,
                              String in_time,
                              String ex_time,
                              String note){
        baggageDAO.insertBaggage(sno,in_time,ex_time,note);
    }
}
