package com.hrevfdz.services;

import java.util.List;

public abstract class PharmacyService<T> extends PharmacySession implements IPharmacy<T> {

	@Override
	public boolean Create(T t) throws Exception {
		try {
			getSession().save(t);
			// getSession().getTransaction().commit();
			// getSession().close();
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean Update(T t) throws Exception {
		try {
			getSession().update(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean Delete(T t) throws Exception {
		try {
			getSession().delete(t);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public List<T> findAll(String table) throws Exception {
		List<T> lista = null;

		try {
			lista = getSession().createQuery("SELECT t FROM " + table + " t").list();
		} catch (Exception e) {
			throw e;
		}
		return lista;
	}

	@Override
	public T findBy(String q) throws Exception {
		T t = null;
		try {
			t = (T) getSession().createQuery(q).uniqueResult();
		} catch (Exception e) {
			throw e;
		}
		return t;
	}

	@Override
	public List<T> findByQuery(String q) throws Exception {
		List<T> lista = null;

		try {
			lista = getSession().createQuery(q).list();
		} catch (Exception e) {
			throw e;
		}
		return lista;
	}

	@Override
	public List<T> findByNativeQuery(String nq) throws Exception {
		List<T> lista = null;

		try {
			lista = getSession().createSQLQuery(nq).list();
		} catch (Exception e) {
			throw e;
		}
		return lista;
	}

	@Override
	public List<T> findByCriteriaQuery() {
		// TODO Auto-generated method stub
		return null;
	}

}
