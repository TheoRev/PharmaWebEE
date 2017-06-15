package com.hrevfdz.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "payments", catalog = "farmasur", schema = "pharmacy")
public class Payments implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;

	@Basic(optional = false)
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Basic(optional = false)
	@Column(name = "monto")
	private double monto;

	@Column(name = "descripcion")
	private String descripcion;

	@JoinColumn(name = "cod_stock", referencedColumnName = "cod_stock")
	@ManyToOne
	private StockProducto codStock;

	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Users userId;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public StockProducto getCodStock() {
		return codStock;
	}

	public void setCodStock(StockProducto codStock) {
		this.codStock = codStock;
	}

	public Users getUserId() {
		return userId;
	}

	public void setUserId(Users userId) {
		this.userId = userId;
	}

}
