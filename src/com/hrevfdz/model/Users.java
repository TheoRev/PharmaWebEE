package com.hrevfdz.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users", catalog = "farmasur", schema = "pharmacy")
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@OneToMany(mappedBy = "userId")
	private List<Sale> saleList;

	@OneToMany(mappedBy = "userId")
	private List<Access> accessList;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userId")
	private List<StartWork> startWorkList;

	@OneToMany(mappedBy = "userId", cascade = CascadeType.ALL)
	private List<Payments> paymentsList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Sale> getSaleList() {
		return saleList;
	}

	public void setSaleList(List<Sale> saleList) {
		this.saleList = saleList;
	}

	public List<Access> getAccessList() {
		return accessList;
	}

	public void setAccessList(List<Access> accessList) {
		this.accessList = accessList;
	}

	public List<StartWork> getStartWorkList() {
		return startWorkList;
	}

	public void setStartWorkList(List<StartWork> startWorkList) {
		this.startWorkList = startWorkList;
	}

	public List<Payments> getPaymentsList() {
		return paymentsList;
	}

	public void setPaymentsList(List<Payments> paymentsList) {
		this.paymentsList = paymentsList;
	}

}
