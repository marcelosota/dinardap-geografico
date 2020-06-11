package ec.gob.dinardap.geografico.dao.ejb;

import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ParroquiaDao;
import ec.gob.dinardap.geografico.modelo.Parroquia;
import ec.gob.dinardap.persistence.dao.ejb.GenericDaoEjb;

@Stateless(name="ParroquiaDao")
public class ParroquiaDaoEjb extends GenericDaoEjb<Parroquia, Integer> implements ParroquiaDao {

	public ParroquiaDaoEjb() {
		super(Parroquia.class);
	}

}
