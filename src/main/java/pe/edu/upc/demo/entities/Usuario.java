package pe.edu.upc.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int IdUsuario;

	@Column(name = "nombreUsuario", nullable = false, length = 60)
	private String nombreUsuario;

	@Column(name = "apellidoUsuario", nullable = false, length = 60)
	private String apellidoUsuario;

	@Column(name = "correoUsuario", nullable = false, length = 60)
	private String correoUsuario;

	@Column(name = "claveUsuario", nullable = false, length = 60)
	private String claveUsuario;

	@Column(name = "telefonoUsuario", nullable = false, length = 60)
	private String telefonoUsuario;

	@ManyToOne
	@JoinColumn(name = "IdCiudad", nullable = false)
	private Ciudad ciudad;

	public Usuario() {
		super();
		
	}

	public Usuario(int idUsuario, String nombreUsuario, String apellidoUsuario, String correoUsuario,
			String claveUsuario, String telefonoUsuario, Ciudad ciudad) {
		super();
		this.IdUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsuario = apellidoUsuario;
		this.correoUsuario = correoUsuario;
		this.claveUsuario = claveUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.ciudad = ciudad;
	}

	public int getIdUsuario() {
		return IdUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		IdUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsuario() {
		return apellidoUsuario;
	}

	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public String getClaveUsuario() {
		return claveUsuario;
	}

	public void setClaveUsuario(String claveUsuario) {
		this.claveUsuario = claveUsuario;
	}

	public String getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(String telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

}
