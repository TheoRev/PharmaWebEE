package com.hrevfdz.dao;

import java.util.List;

import com.hrevfdz.model.IngresoProducto;
import com.hrevfdz.services.PharmacyService;

public class IngresoProductoDAO extends PharmacyService<IngresoProducto> {

    public IngresoProductoDAO() {
    }

    @Override
    public boolean Create(IngresoProducto t) throws Exception {
        return super.Create(t);
    }

    @Override
    public boolean Update(IngresoProducto t) throws Exception {
        return super.Update(t);
    }

    @Override
    public boolean Delete(IngresoProducto t) throws Exception {
        return super.Delete(t);
    }

    @Override
    public List<IngresoProducto> findAll(String table) throws Exception {
        return super.findAll(table);
    }

    @Override
    public IngresoProducto findBy(String q) throws Exception {
        return super.findBy(q);
    }

    @Override
    public List<IngresoProducto> findByQuery(String q) throws Exception {
        return super.findByQuery(q);
    }

    @Override
    public List<IngresoProducto> findByNativeQuery(String nq) throws Exception {
        return super.findByNativeQuery(nq);
    }

}
