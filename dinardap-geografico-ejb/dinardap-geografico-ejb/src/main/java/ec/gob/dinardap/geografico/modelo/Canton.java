package ec.gob.dinardap.geografico.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the canton database table.
 * 
 */
@Entity
@Table(name="canton", schema = "ec_dinardap_geografico")
@NamedQuery(name="Canton.findAll", query="SELECT c FROM Canton c")
public class Canton implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="CANTON_CANTONID_GENERATOR", sequenceName="CANTON_CANTON_ID_SEQ", schema = "ec_dinardap_geografico", allocationSize = 1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="CANTON_CANTONID_GENERATOR")
	@Column(name="canton_id")
	private Integer cantonId;

	@Column(name="cabecera_cantonal")
	private String cabeceraCantonal;

	@Column(name="codigo_inec")
	private String codigoInec;

	private Short estado;

	private String nombre;

	//bi-directional many-to-one association to Provincia
	@ManyToOne
	@JoinColumn(name="provincia_id")
	private Provincia provincia;

	//bi-directional many-to-one association to Zona
	@ManyToOne
	@JoinColumn(name="zona_id")
	private Zona zona;

	//bi-directional many-to-one association to Parroquia
	@OneToMany(mappedBy="canton")
	private List<Parroquia> parroquias;

	public Canton() {
	}

	public Integer getCantonId() {
		return this.cantonId;
	}

	public void setCantonId(Integer cantonId) {
		this.cantonId = cantonId;
	}

	public String getCabeceraCantonal() {
		return this.cabeceraCantonal;
	}

	public void setCabeceraCantonal(String cabeceraCantonal) {
		this.cabeceraCantonal = cabeceraCantonal;
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

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Zona getZona() {
		return this.zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	public List<Parroquia> getParroquias() {
		return this.parroquias;
	}

	public void setParroquias(List<Parroquia> parroquias) {
		this.parroquias = parroquias;
	}

	public Parroquia addParroquia(Parroquia parroquia) {
		getParroquias().add(parroquia);
		parroquia.setCanton(this);

		return parroquia;
	}

	public Parroquia removeParroquia(Parroquia parroquia) {
		getParroquias().remove(parroquia);
		parroquia.setCanton(null);

		return parroquia;
	}

}