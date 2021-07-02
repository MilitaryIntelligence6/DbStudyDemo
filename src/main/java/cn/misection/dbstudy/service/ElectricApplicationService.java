package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.Electric_ApplicationDAO;
import cn.misection.dbstudy.entity.ElectricApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ElectricApplicationService {

    @Autowired
    private Electric_ApplicationDAO electric_applicationDAO;

    public ArrayList<ElectricApplication> selectAll(){
        return electric_applicationDAO.selectAll();
    }

    public ElectricApplication selectOne(String eno){
        return electric_applicationDAO.selectOne(eno);
    }

    public void insertElectric_Application(String eno,String sno,String ename){
        electric_applicationDAO.insertElectric_Application(eno,sno,ename);
    }
}
