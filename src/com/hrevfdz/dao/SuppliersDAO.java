package com.hrevfdz.dao;

import com.hrevfdz.model.Suppliers;
import com.hrevfdz.services.PharmacyService;
import java.util.List;

public class SuppliersDAO extends PharmacyService<Suppliers>{
    
    public SuppliersDAO() {
    }

    @Override
    public List<Suppliers> findByCriteriaQuery() {
        return super.findByCriteriaQuery(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Suppliers> findByNativeQuery(String nq) throws Exception {
        return super.findByNativeQuery(nq); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Suppliers> findByQuery(String q) throws Exception {
        return super.findByQuery(q); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Suppliers findBy(String q) throws Exception {
        return super.findBy(q); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Suppliers> findAll(String table) throws Exception {
        return super.findAll(table); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Delete(Suppliers t) throws Exception {
        return super.Delete(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Update(Suppliers t) throws Exception {
        return super.Update(t); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean Create(Suppliers t) throws Exception {
        return super.Create(t); //To change body of generated methods, choose Tools | Templates.
    }
    
}
