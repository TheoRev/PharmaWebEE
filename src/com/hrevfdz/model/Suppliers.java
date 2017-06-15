package com.hrevfdz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "suppliers", catalog = "farmasur", schema = "pharmacy")
public class Suppliers implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;

	@Basic(optional = false)
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "encargado")
	private String encargado;

	@Column(name = "telefono")
	private String telefono;

	@Column(name = "email")
	private String email;

	@OneToMany(mappedBy = "codSupplier")
	private List<Laboratory> laboratoryList;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Laboratory> getLaboratoryList() {
		return laboratoryList;
	}

	public void setLaboratoryList(List<Laboratory> laboratoryList) {
		this.laboratoryList = laboratoryList;
	}

}
