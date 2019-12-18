package ec.gob.dinardap.geografico.dao.ejb;

import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ZonaDao;
import ec.gob.dinardap.geografico.modelo.Zona;
import ec.gob.dinardap.persistence.dao.ejb.GenericDaoEjb;

@Stateless(name="ZonaEjb")
public class ZonaDaoEjb extends GenericDaoEjb<Zona, Integer> implements ZonaDao {

	public ZonaDaoEjb() {
		super(Zona.class);
	}

}
