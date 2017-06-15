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
@Table(name = "ingreso_producto", catalog = "farmasur", schema = "pharmacy")
public class IngresoProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date hora;

	@Basic(optional = false)
	@Column(name = "cantidad")
	private int cantidad;

	@Basic(optional = false)
	@Column(name = "costo")
	private double costo;

	@JoinColumn(name = "cod_stock", referencedColumnName = "cod_stock")
	@ManyToOne(optional = false)
	private StockProducto codStock;

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

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public StockProducto getCodStock() {
		return codStock;
	}

	public void setCodStock(StockProducto codStock) {
		this.codStock = codStock;
	}

}
