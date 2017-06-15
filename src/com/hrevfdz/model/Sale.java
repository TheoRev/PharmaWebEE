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
@Table(name = "sale", catalog = "farmasur", schema = "pharmacy")
public class Sale implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cod_sale")
	private Integer codSale;

	@Basic(optional = false)
	@Column(name = "cantidad")
	private int cantidad;

	@Basic(optional = false)
	@Column(name = "precio")
	private double precio;

	@Column(name = "subtotal")
	private Double subtotal;

	@Basic(optional = false)
	@Column(name = "fecha")
	@Temporal(TemporalType.DATE)
	private Date fecha;

	@Basic(optional = false)
	@Column(name = "hora")
	@Temporal(TemporalType.TIME)
	private Date hora;

	@JoinColumn(name = "cod_stock", referencedColumnName = "cod_stock")
	@ManyToOne(optional = false)
	private StockProducto codStock;

	@JoinColumn(name = "user_id", referencedColumnName = "id")
	@ManyToOne
	private Users userId;

	public Integer getCodSale() {
		return codSale;
	}

	public void setCodSale(Integer codSale) {
		this.codSale = codSale;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
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
