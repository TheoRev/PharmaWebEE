package com.hrevfdz.dao;

import com.hrevfdz.model.StartWork;
import com.hrevfdz.services.PharmacyService;
import java.util.List;

public class StartWorkDAO extends PharmacyService<StartWork>{

    public StartWorkDAO() {
    }

    @Override
    public List<StartWork> findByCriteriaQuery() {
        return super.findByCriteriaQuery(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StartWork> findByNativeQuery(String nq) throws Exception {
        return super.findByNativeQuery(nq); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StartWork> findByQuery(String q) throws Exception {
        return super.findByQuery(q); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<StartWork> findAll(String table) throws Exception {
        return super.findAll(table); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(StartWork t) throws Exception {
        return super.Delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(StartWork t) throws Exception {
        return super.Update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Create(StartWork t) throws Exception {
        return super.Create(t); //To change body of generated methods, choose Tools | Templates.
    }
    
}
