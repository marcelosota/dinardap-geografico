package ec.gob.dinardap.geografico.dao;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Parroquia;
import ec.gob.dinardap.persistence.dao.GenericDao;

@Local
public interface ParroquiaDao extends GenericDao<Parroquia, Integer> {

}
