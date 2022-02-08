package com.mouritech.storemanagementwithspringboot.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "store_details")
@EntityListeners(AuditingEntityListener.class)
public class Store {

	@Id
	@Column(name = "store_id",length = 64)
	private String storeId;
	
	@Column(name = "store_addr")
	private String storeAddress;
	
	@Column(name = "store_city")
	private String storeCity;
	
	@Column(name = "store_cntry")
	private String storeCountry;
	
	@Column(name = "store_email")
	private String storeEmail;
	
	@Column(name = "store_cntno")
	private Long storeConNo;
	
	@Column(name = "store_startDt")
	@LastModifiedDate
	private Date storeStrtDate;

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreCity() {
		return storeCity;
	}

	public void setStoreCity(String storeCity) {
		this.storeCity = storeCity;
	}

	public String getStoreCountry() {
		return storeCountry;
	}

	public void setStoreCountry(String storeCountry) {
		this.storeCountry = storeCountry;
	}

	public String getStoreEmail() {
		return storeEmail;
	}

	public void setStoreEmail(String storeEmail) {
		this.storeEmail = storeEmail;
	}

	public Long getStoreConNo() {
		return storeConNo;
	}

	public void setStoreConNo(Long storeConNo) {
		this.storeConNo = storeConNo;
	}

	public Date getStoreStrtDate() {
		return storeStrtDate;
	}

	public void setStoreStrtDate(Date storeStrtDate) {
		this.storeStrtDate = storeStrtDate;
	}

	public Store(String storeAddress, String storeCity, String storeCountry, String storeEmail, Long storeConNo,
			Date storeStrtDate) {
		super();
		this.storeAddress = storeAddress;
		this.storeCity = storeCity;
		this.storeCountry = storeCountry;
		this.storeEmail = storeEmail;
		this.storeConNo = storeConNo;
		this.storeStrtDate = storeStrtDate;
	}

	public Store() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Store(String storeId, String storeAddress, String storeCity, String storeCountry, String storeEmail,
			Long storeConNo, Date storeStrtDate) {
		super();
		this.storeId = storeId;
		this.storeAddress = storeAddress;
		this.storeCity = storeCity;
		this.storeCountry = storeCountry;
		this.storeEmail = storeEmail;
		this.storeConNo = storeConNo;
		this.storeStrtDate = storeStrtDate;
	}

	@Override
	public String toString() {
		return "Store [storeId=" + storeId + ", storeAddress=" + storeAddress + ", storeCity=" + storeCity
				+ ", storeCountry=" + storeCountry + ", storeEmail=" + storeEmail + ", storeConNo=" + storeConNo
				+ ", storeStrtDate=" + storeStrtDate + "]";
	}
	
	
}
