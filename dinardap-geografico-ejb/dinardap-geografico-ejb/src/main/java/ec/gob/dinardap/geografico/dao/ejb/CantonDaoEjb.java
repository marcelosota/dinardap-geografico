package ec.gob.dinardap.geografico.dao.ejb;

import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.CantonDao;
import ec.gob.dinardap.geografico.modelo.Canton;
import ec.gob.dinardap.persistence.dao.ejb.GenericDaoEjb;

@Stateless(name="CantonDao")
public class CantonDaoEjb extends GenericDaoEjb<Canton, Integer> implements CantonDao {

	public CantonDaoEjb() {
		super(Canton.class);
	}

}
