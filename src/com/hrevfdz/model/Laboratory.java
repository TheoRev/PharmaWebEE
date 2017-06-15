package com.hrevfdz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
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
@Table(name = "laboratory", catalog = "farmasur", schema = "pharmacy")
public class Laboratory implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "cod_lab")
	private Integer codLab;

	@Column(name = "nom_lab")
	private String nomLab;

	@OneToMany(mappedBy = "codLab")
	private List<StockProducto> stockProductoList;

	@JoinColumn(name = "cod_supplier", referencedColumnName = "codigo")
	@ManyToOne
	private Suppliers codSupplier;

	public Integer getCodLab() {
		return codLab;
	}

	public void setCodLab(Integer codLab) {
		this.codLab = codLab;
	}

	public String getNomLab() {
		return nomLab;
	}

	public void setNomLab(String nomLab) {
		this.nomLab = nomLab;
	}

	public List<StockProducto> getStockProductoList() {
		return stockProductoList;
	}

	public void setStockProductoList(List<StockProducto> stockProductoList) {
		this.stockProductoList = stockProductoList;
	}

	public Suppliers getCodSupplier() {
		return codSupplier;
	}

	public void setCodSupplier(Suppliers codSupplier) {
		this.codSupplier = codSupplier;
	}

}
