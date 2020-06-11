package ec.gob.dinardap.geografico.servicio;

import java.util.List;

import javax.ejb.Local;

import ec.gob.dinardap.geografico.modelo.Provincia;
import ec.gob.dinardap.persistence.servicio.GenericService;

@Local
public interface ProvinciaServicio extends GenericService<Provincia, Integer> {

	public List<Provincia> obtenerProvincias();
}
