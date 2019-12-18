package ec.gob.dinardap.geografico.modelo;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the parroquia database table.
 * 
 */
@Entity
@Table(name="parroquia", schema="ec_dinardap_geografico")
@NamedQuery(name="Parroquia.findAll", query="SELECT p FROM Parroquia p")
public class Parroquia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="PARROQUIA_PARROQUIAID_GENERATOR", sequenceName="PARROQUIA_PARROQUIA_ID_SEQ", schema="ec_dinardap_geografico", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="PARROQUIA_PARROQUIAID_GENERATOR")
	@Column(name="parroquia_id")
	private Integer parroquiaId;

	@Column(name="codigo_inec")
	private String codigoInec;

	private Short estado;

	private String nombre;

	private String tipo;

	//bi-directional many-to-one association to Canton
	@ManyToOne
	@JoinColumn(name="canton_id")
	private Canton canton;

	public Parroquia() {
	}

	public Integer getParroquiaId() {
		return this.parroquiaId;
	}

	public void setParroquiaId(Integer parroquiaId) {
		this.parroquiaId = parroquiaId;
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

	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Canton getCanton() {
		return this.canton;
	}

	public void setCanton(Canton canton) {
		this.canton = canton;
	}

}