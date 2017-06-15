package com.hrevfdz.dao;

import java.util.List;

import com.hrevfdz.model.StockProducto;
import com.hrevfdz.services.PharmacyService;

public class StockProductoDAO extends PharmacyService<StockProducto> {

	private final String tabla = "StockProducto";

	public StockProductoDAO() {
	}

	@Override
	public boolean Create(StockProducto t) throws Exception {
		return super.Create(t);
	}

	@Override
	public boolean Update(StockProducto t) throws Exception {
		return super.Update(t);
	}

	@Override
	public boolean Delete(StockProducto t) throws Exception {
		return super.Delete(t);
	}

	@Override
	public List<StockProducto> findAll(String table) throws Exception {
		return super.findAll(tabla);
	}

	@Override
	public StockProducto findBy(String q) throws Exception {
		return super.findBy(q);
	}

	@Override
	public List<StockProducto> findByQuery(String q) throws Exception {
		return super.findByQuery(q);
	}

	@Override
	public List<StockProducto> findByNativeQuery(String nq) throws Exception {
		return super.findByNativeQuery(nq);
	}

}
