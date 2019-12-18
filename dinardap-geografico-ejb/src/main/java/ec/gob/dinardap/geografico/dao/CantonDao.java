package ec.gob.dinardap.geografico.dao;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Canton;
import ec.gob.dinardap.persistence.dao.GenericDao;

@Local
public interface CantonDao extends GenericDao<Canton, java.lang.Integer> {

}
