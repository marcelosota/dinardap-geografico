package ec.gob.dinardap.geografico.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ProvinciaDao;
import ec.gob.dinardap.geografico.modelo.Provincia;
import ec.gob.dinardap.geografico.servicio.ProvinciaServicio;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;

@Stateless(name="ProvinciaServicio")
public class ProvinciaServicioImpl extends GenericServiceImpl<Provincia, Integer> implements ProvinciaServicio{

	@EJB
	private ProvinciaDao provinciaDao;
	
	@Override
	public GenericDao<Provincia, Integer> getDao() {
		return provinciaDao;
	}

}
