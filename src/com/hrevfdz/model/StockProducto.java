package com.hrevfdz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "stock_producto", catalog = "farmasur", schema = "pharmacy")
public class StockProducto implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cod_stock")
	private Integer codStock;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "presentacion")
	private String presentacion;

	@Column(name = "lote")
	private String lote;

	@Column(name = "monto")
	private Double monto;

	@Column(name = "cantidad")
	private Integer cantidad;

	@Column(name = "costo")
	private Double costo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "codStock")
	private List<IngresoProducto> ingresoProductoList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "codStock")
	private List<Sale> saleList;

	@JoinColumn(name = "cod_lab", referencedColumnName = "cod_lab")
	@ManyToOne
	private Laboratory codLab;

	@OneToMany(mappedBy = "codStock")
	private List<Payments> paymentsList;

	public Integer getCodStock() {
		return codStock;
	}

	public void setCodStock(Integer codStock) {
		this.codStock = codStock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPresentacion() {
		return presentacion;
	}

	public void setPresentacion(String presentacion) {
		this.presentacion = presentacion;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getCosto() {
		return costo;
	}

	public void setCosto(Double costo) {
		this.costo = costo;
	}

	public List<IngresoProducto> getIngresoProductoList() {
		return ingresoProductoList;
	}

	public void setIngresoProductoList(List<IngresoProducto> ingresoProductoList) {
		this.ingresoProductoList = ingresoProductoList;
	}

	public List<Sale> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<Sale> saleList) {
		this.saleList = saleList;
	}

	public Laboratory getCodLab() {
		return codLab;
	}

	public void setCodLab(Laboratory codLab) {
		this.codLab = codLab;
	}

	public List<Payments> getPaymentsList() {
		return paymentsList;
	}

	public void setPaymentsList(List<Payments> paymentsList) {
		this.paymentsList = paymentsList;
	}

}
