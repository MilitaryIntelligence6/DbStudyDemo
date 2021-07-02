package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.PayRentDAO;
import cn.misection.dbstudy.entity.PayRent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PayRentService {

    @Autowired
    private PayRentDAO payRentDAO;

    public ArrayList<PayRent> selectAll(){
        return payRentDAO.selectAll();
    }

    public PayRent selectOne(String tid){
        return payRentDAO.selectOne(tid);
    }

    public void insertPayRent(String tid,
                              String time,
                              String type,
                              int account){
        payRentDAO.insertPayRent(tid,time,type,account);
    }

    public void deletePayRent(String tid){
        payRentDAO.deletePayRent(tid);
    }
}
