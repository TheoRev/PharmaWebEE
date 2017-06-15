package com.hrevfdz.dao;

import java.util.List;

import com.hrevfdz.model.Sale;
import com.hrevfdz.services.PharmacyService;

public class SaleDAO extends PharmacyService<Sale> {

	private final String tabla = "Sale";

	public SaleDAO() {
	}

	@Override
	public boolean Create(Sale t) throws Exception {
		return super.Create(t);
	}

	@Override
	public boolean Update(Sale t) throws Exception {
		return super.Update(t);
	}

	@Override
	public boolean Delete(Sale t) throws Exception {
		return super.Delete(t);
	}

	@Override
	public List<Sale> findAll(String table) throws Exception {
		return super.findAll(tabla);
	}

	// @Override
	// public Sale findBy(String q) throws Exception {
	// return super.findBy(q);
	// }

	@Override
	public List<Sale> findByQuery(String q) throws Exception {
		return super.findByQuery(q);
	}

	@Override
	public List<Sale> findByNativeQuery(String nq) throws Exception {
		return super.findByNativeQuery(nq);
	}

}
