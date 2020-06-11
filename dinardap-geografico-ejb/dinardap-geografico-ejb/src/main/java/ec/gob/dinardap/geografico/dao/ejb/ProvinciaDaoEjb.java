package ec.gob.dinardap.geografico.dao.ejb;

import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ProvinciaDao;
import ec.gob.dinardap.geografico.modelo.Provincia;
import ec.gob.dinardap.persistence.dao.ejb.GenericDaoEjb;

@Stateless(name="ProvinciaDao")
public class ProvinciaDaoEjb extends GenericDaoEjb<Provincia, Integer> implements ProvinciaDao {

	public ProvinciaDaoEjb() {
		super(Provincia.class);
	}

}
