package ec.gob.dinardap.geografico.servicio;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Canton;
import ec.gob.dinardap.persistence.servicio.GenericService;

@Local
public interface CantonServicio extends GenericService<Canton, Integer> {

}
