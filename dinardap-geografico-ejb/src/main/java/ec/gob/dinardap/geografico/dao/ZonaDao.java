package ec.gob.dinardap.geografico.dao;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Zona;
import ec.gob.dinardap.persistence.dao.GenericDao;

@Local
public interface ZonaDao extends GenericDao<Zona, Integer> {

}
