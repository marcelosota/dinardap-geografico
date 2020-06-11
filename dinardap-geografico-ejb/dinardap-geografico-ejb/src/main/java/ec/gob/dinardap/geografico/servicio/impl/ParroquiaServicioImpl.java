package ec.gob.dinardap.geografico.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ParroquiaDao;
import ec.gob.dinardap.geografico.modelo.Parroquia;
import ec.gob.dinardap.geografico.servicio.ParroquiaServicio;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;

@Stateless(name="ParroquiaServicio")
public class ParroquiaServicioImpl extends GenericServiceImpl<Parroquia, Integer> implements ParroquiaServicio {

	@EJB
	private ParroquiaDao parroquiaDao;
	
	@Override
	public GenericDao<Parroquia, Integer> getDao() {
		return parroquiaDao;
	}

}
