package ec.gob.dinardap.geografico.servicio;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Zona;
import ec.gob.dinardap.persistence.servicio.GenericService;

@Local
public interface ZonaServicio extends GenericService<Zona, Integer> {

}
