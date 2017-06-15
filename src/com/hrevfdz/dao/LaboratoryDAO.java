package com.hrevfdz.dao;

import com.hrevfdz.model.Laboratory;
import com.hrevfdz.services.PharmacyService;
import java.util.List;

public class LaboratoryDAO extends PharmacyService<Laboratory> {

	private final String tabla = "Laboratory";

	public LaboratoryDAO() {
	}

	@Override
	public List<Laboratory> findByNativeQuery(String nq) throws Exception {
		return super.findByNativeQuery(nq);
	}

	@Override
	public List<Laboratory> findByQuery(String q) throws Exception {
		return super.findByQuery(q);
	}

	@Override
	public Laboratory findBy(String q) throws Exception {
		return super.findBy(q);
	}

	@Override
	public List<Laboratory> findAll(String table) throws Exception {
		return super.findAll(tabla);
	}

	@Override
	public boolean Delete(Laboratory t) throws Exception {
		return super.Delete(t);
	}

	@Override
	public boolean Update(Laboratory t) throws Exception {
		return super.Update(t);
	}

	@Override
	public boolean Create(Laboratory t) throws Exception {
		return super.Create(t);
	}

}
