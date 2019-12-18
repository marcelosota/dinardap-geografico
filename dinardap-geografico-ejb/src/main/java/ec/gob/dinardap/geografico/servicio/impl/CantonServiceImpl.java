package ec.gob.dinardap.geografico.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.CantonDao;
import ec.gob.dinardap.geografico.modelo.Canton;
import ec.gob.dinardap.geografico.servicio.CantonServicio;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;

@Stateless(name="CantonServicio")
public class CantonServiceImpl extends GenericServiceImpl<Canton, Integer> implements CantonServicio {

	@EJB
	private CantonDao cantonDao;
	
	@Override
	public GenericDao<Canton, Integer> getDao() {
		return cantonDao;
	}

}
