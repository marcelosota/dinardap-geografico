package ec.gob.dinardap.geografico.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the provincia database table.
 * 
 */
@Entity
@Table(name="provincia", schema="ec_dinardap_geografico")
@NamedQuery(name="Provincia.findAll", query="SELECT p FROM Provincia p")
public class Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PROVINCIA_PROVINCIAID_GENERATOR", sequenceName="PROVINCIA_PROVINCIA_ID_SEQ", schema="ec_dinardap_geografico", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PROVINCIA_PROVINCIAID_GENERATOR")
	@Column(name="provincia_id")
	private Integer provinciaId;

	@Column(name="codigo_inec")
	private String codigoInec;

	private Short estado;

	private String nombre;

	//bi-directional many-to-one association to Canton
	@OneToMany(mappedBy="provincia")
	private List<Canton> cantons;

	public Provincia() {
	}

	public Integer getProvinciaId() {
		return this.provinciaId;
	}

	public void setProvinciaId(Integer provinciaId) {
		this.provinciaId = provinciaId;
	}

	public String getCodigoInec() {
		return this.codigoInec;
	}

	public void setCodigoInec(String codigoInec) {
		this.codigoInec = codigoInec;
	}

	public Short getEstado() {
		return this.estado;
	}

	public void setEstado(Short estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Canton> getCantons() {
		return this.cantons;
	}

	public void setCantons(List<Canton> cantons) {
		this.cantons = cantons;
	}

	public Canton addCanton(Canton canton) {
		getCantons().add(canton);
		canton.setProvincia(this);

		return canton;
	}

	public Canton removeCanton(Canton canton) {
		getCantons().remove(canton);
		canton.setProvincia(null);

		return canton;
	}

}