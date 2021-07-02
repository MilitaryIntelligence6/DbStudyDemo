package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.RentDAO;
import cn.misection.dbstudy.entity.Rent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RentService {

    @Autowired
    private RentDAO rentDAO;

    public ArrayList<Rent> selectAll(){
        return rentDAO.selectAll();
    }

    public Rent selectOne(String tid){
        return rentDAO.selectOne(tid);
    }

    public void insertRent(String tid,
                           String zno,
                           String dno,
                           String check_in,
                           String bed,
                           String pick_out){
        rentDAO.insertRent(tid, zno, dno, check_in, bed, pick_out);
    }

    public void deleteRent(String tid){
        rentDAO.deleteRent(tid);
    }
}
