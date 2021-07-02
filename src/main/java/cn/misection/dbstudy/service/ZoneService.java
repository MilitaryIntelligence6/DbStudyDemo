package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.ZoneDAO;
import cn.misection.dbstudy.entity.Zone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ZoneService {

    @Autowired
    private ZoneDAO zoneDAO;

    public ArrayList<Zone> selectAll(){
        return zoneDAO.selectAll();
    }

    public Zone selectByZno(String zno){
        return zoneDAO.selectByZno(zno);
    }

    public void insertZone(String zno,
                           String zname,
                           String sex,
                           int fee,
                           String accommodation,
                           int remain){
        zoneDAO.insertZone(zno,zname,sex,fee,accommodation,remain);
    }

    public void updateZone(int remain,String zno){
        zoneDAO.updateZone(remain,zno);
    }

    public void deleteZone(String zno){
        zoneDAO.deleteByZno(zno);
    }
}
