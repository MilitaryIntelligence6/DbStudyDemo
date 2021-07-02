package cn.misection.dbstudy.service;

import cn.misection.dbstudy.dao.TenantDAO;
import cn.misection.dbstudy.entity.Tenant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TenantService {

    @Autowired
    private TenantDAO tenantDAO;

    public ArrayList<Tenant> selectAll(){
        return tenantDAO.selectAll();
    }

    public Tenant selectOne(String tid){
        return tenantDAO.selectOne(tid);
    }

    public void insertTenant(String tid,
                             String tname,
                             String contact,
                             String sex){
        tenantDAO.insertTenant(tid,tname,contact,sex);
    }

    public void deleteTenant(String tid){
        tenantDAO.deleteTenant(tid);
    }
}
