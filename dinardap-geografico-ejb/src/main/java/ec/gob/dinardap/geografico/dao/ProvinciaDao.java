package ec.gob.dinardap.geografico.dao;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Provincia;
import ec.gob.dinardap.persistence.dao.GenericDao;

@Local
public interface ProvinciaDao extends GenericDao<Provincia, Integer> {

}
