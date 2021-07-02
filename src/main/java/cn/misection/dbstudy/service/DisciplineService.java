package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.DisciplineDAO;
import cn.misection.dbstudy.entity.Discipline;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DisciplineService {

    @Autowired
    private DisciplineDAO disciplineDAO;

    public ArrayList<Discipline> selectAll(){
        return disciplineDAO.selectAll();
    }

    public Discipline selectOne(String sno,String time){
        return disciplineDAO.selectOne(sno,time);
    }

    public void insertDiscipline(String sno,String time,String information){
        disciplineDAO.insertDiscipline(sno,time,information);
    }

    public void deleteDiscipline(String sno,String time){
        disciplineDAO.deleteDiscipline(sno,time);
    }
}
