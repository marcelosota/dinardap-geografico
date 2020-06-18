package ec.gob.dinardap.geografico.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the zona database table.
 * 
 */
@Entity
@Table(name="zona", schema = "ec_dinardap_geografico")
@NamedQuery(name="Zona.findAll", query="SELECT z FROM Zona z")
public class Zona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ZONA_ZONAID_GENERATOR", sequenceName="ZONA_ZONA_ID_SEQ", schema = "ec_dinardap_geografico", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ZONA_ZONAID_GENERATOR")
	@Column(name="zona_id")
	private Integer zonaId;

	private String descripcion;

	private Short estado;

	private String nombre;

	//bi-directional many-to-one association to Canton
	@OneToMany(mappedBy="zona")
	private List<Canton> cantons;

	public Zona() {
	}

	public Integer getZonaId() {
		return this.zonaId;
	}

	public void setZonaId(Integer zonaId) {
		this.zonaId = zonaId;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		canton.setZona(this);

		return canton;
	}

	public Canton removeCanton(Canton canton) {
		getCantons().remove(canton);
		canton.setZona(null);

		return canton;
	}

}