package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.VisitorDAO;
import cn.misection.dbstudy.entity.Visitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class VisitorService {

    @Autowired
    private VisitorDAO visitorDAO;

    public ArrayList<Visitor> selectAll(){
        return visitorDAO.selectAll();
    }

    public Visitor selectOne(String vid,String vtime){
        return visitorDAO.selectOne(vid,vtime);
    }

    public void insertVisitor(String sno,
                              String vid,
                              String vname,
                              String relationship,
                              String vtime,
                              String contact){
        visitorDAO.insertVisitor(sno,
                vid,
                vname,
                relationship,
                vtime,
                contact);
    }

    public void deleteVisitor(String vid,String vtime){
        visitorDAO.deleteVisitor(vid,vtime);
    }
}
