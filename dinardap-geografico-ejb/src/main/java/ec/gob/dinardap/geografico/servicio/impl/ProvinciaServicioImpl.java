package ec.gob.dinardap.geografico.servicio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.ProvinciaDao;
import ec.gob.dinardap.geografico.modelo.Provincia;
import ec.gob.dinardap.geografico.servicio.ProvinciaServicio;
import ec.gob.dinardap.persistence.constante.CriteriaTypeEnum;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;
import ec.gob.dinardap.persistence.util.Criteria;
import ec.gob.dinardap.util.constante.EstadoEnum;

@Stateless(name="ProvinciaServicio")
public class ProvinciaServicioImpl extends GenericServiceImpl<Provincia, Integer> implements ProvinciaServicio {

	@EJB
	private ProvinciaDao provinciaDao;
	
	@Override
	public GenericDao<Provincia, Integer> getDao() {
		return provinciaDao;
	}

	@Override
	public List<Provincia> obtenerProvincias() {
		List<Provincia> lista = new ArrayList<Provincia>();
		String[] criteriaNombres = {"estado"};
		CriteriaTypeEnum[] criteriaTipos = {CriteriaTypeEnum.SHORT_EQUALS};
		Object[] criteriaValores = {EstadoEnum.ACTIVO.getEstado()};
		String[] orderBy = {"nombre"};
		boolean[] asc = {true};
		
		Criteria criteria = new Criteria(criteriaNombres, criteriaTipos, criteriaValores, orderBy, asc);
		System.out.println("Listo para consultar");
		lista =	findByCriterias(criteria);
		System.out.println("consulta realizada");
		if(lista.size() < 1) {
			System.out.println("Vacia");
		}else
			System.out.println("llena");
		return lista;
	}

}
