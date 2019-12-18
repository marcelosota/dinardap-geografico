package ec.gob.dinardap.geografico.servicio.impl;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ZonaDao;
import ec.gob.dinardap.geografico.modelo.Zona;
import ec.gob.dinardap.geografico.servicio.ZonaServicio;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;

@Stateless(name="ZonaServicio")
public class ZonaServicioImpl extends GenericServiceImpl<Zona, Integer> implements ZonaServicio {

	@EJB
	private ZonaDao zonaDao;
	
	@Override
	public GenericDao<Zona, Integer> getDao() {
		return zonaDao;
	}

}
