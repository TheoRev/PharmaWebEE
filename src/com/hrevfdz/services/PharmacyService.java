package com.hrevfdz.services;

import java.util.List;

public abstract class PharmacyService<T> implements IPharmacy<T> {

	@Override
	public boolean Create(T t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(T t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(T t) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<T> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T findBy(String q) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByQuery(String q) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByNativeQuery(String nq) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> findByCriteriaQuery() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
