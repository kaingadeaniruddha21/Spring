package com.mouritech.sellermanagementsystemwithrestcontroller.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="sellers")
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sellerid")
	private Long sellerId;
	
	@Column(name = "sellername")
	@NotNull
	private String sellerName;
	
	@Column(name = "selleremail")
	@NotNull
	private String sellerEmail;
	
	@Column(name = "sellermobno")
	private Long sellerMobno;
	
	@Column(name = "sellercity")
	@NotNull
	private String sellerCity;
	
	@Column(name = "sellercategory")
	@NotNull
	private String sellerCategory;
	
	
	public Seller() {
		// TODO Auto-generated constructor stub
	}


	public Seller(Long sellerId, String sellerName, String sellerEmail, Long sellerMobno, String sellerCity,
			String sellerCategory) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerEmail = sellerEmail;
		this.sellerMobno = sellerMobno;
		this.sellerCity = sellerCity;
		this.sellerCategory = sellerCategory;
	}


	public Long getSellerId() {
		return sellerId;
	}


	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}


	public String getSellerName() {
		return sellerName;
	}


	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}


	public String getSellerEmail() {
		return sellerEmail;
	}


	public void setSellerEmail(String sellerEmail) {
		this.sellerEmail = sellerEmail;
	}


	public Long getSellerMobno() {
		return sellerMobno;
	}


	public void setSellerMobno(Long sellerMobno) {
		this.sellerMobno = sellerMobno;
	}


	public String getSellerCity() {
		return sellerCity;
	}


	public void setSellerCity(String sellerCity) {
		this.sellerCity = sellerCity;
	}


	public String getSellerCategory() {
		return sellerCategory;
	}


	public void setSellerCategory(String sellerCategory) {
		this.sellerCategory = sellerCategory;
	}


	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerEmail=" + sellerEmail
				+ ", sellerMobno=" + sellerMobno + ", sellerCity=" + sellerCity + ", sellerCategory=" + sellerCategory
				+ "]";
	}
	
	
	
	
	
	
	//sellerid,sellername,selleremail,sellermobno,sellercity,sellercategory
}