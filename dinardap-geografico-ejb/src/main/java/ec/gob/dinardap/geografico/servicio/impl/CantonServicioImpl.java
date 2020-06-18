package ec.gob.dinardap.geografico.servicio.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import ec.gob.dinardap.geografico.dao.CantonDao;
import ec.gob.dinardap.geografico.modelo.Canton;
import ec.gob.dinardap.geografico.servicio.CantonServicio;
import ec.gob.dinardap.persistence.constante.CriteriaTypeEnum;
import ec.gob.dinardap.persistence.dao.GenericDao;
import ec.gob.dinardap.persistence.servicio.impl.GenericServiceImpl;
import ec.gob.dinardap.persistence.util.Criteria;

@Stateless(name="CantonServicio")
public class CantonServicioImpl extends GenericServiceImpl<Canton, Integer> implements CantonServicio {

	@EJB
	private CantonDao cantonDao;

	@Override
	public GenericDao<Canton, Integer> getDao() {
		return cantonDao;
	}

	@Override
	public List<Canton> buscarCantonesPorProvincia(Integer provinciaId) {
		String[] criteriasPropiedad = {"provincia.provinciaId"};
		CriteriaTypeEnum[] criteriaOperador = {CriteriaTypeEnum.INTEGER_EQUALS};
		Object[] criteriaValores = {provinciaId};
		String[] orderBy = {"nombre"};
		boolean[] asc = {true};
		
		Criteria criteria = new Criteria(criteriasPropiedad, criteriaOperador, criteriaValores, orderBy, asc);
		return findByCriterias(criteria);
	}

}
