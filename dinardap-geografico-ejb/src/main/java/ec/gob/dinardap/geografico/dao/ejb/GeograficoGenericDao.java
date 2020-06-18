package ec.gob.dinardap.geografico.dao.ejb;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ec.gob.dinardap.persistence.dao.ejb.GenericEmDaoEjb;

public class GeograficoGenericDao<T, PK extends Serializable> extends GenericEmDaoEjb<T, PK> {
	/**
	 * @param type
	 */
	public GeograficoGenericDao(Class<T> type) {
		super(type);
	}

	@PersistenceContext(unitName = "geografico-pu")
	protected EntityManager em;

	/*
	 * (non-Javadoc)
	 * 
	 * @see ec.gob.dinardap.persistence.dao.ejb.GenericEmDaoEjb#getEm()
	 */
	@Override
	protected EntityManager getEm() {
		return this.em;
	}
}