package ec.gob.dinardap.geografico.servicio;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Parroquia;
import ec.gob.dinardap.persistence.servicio.GenericService;

@Local
public interface ParroquiaServicio extends GenericService<Parroquia, Integer> {

}
