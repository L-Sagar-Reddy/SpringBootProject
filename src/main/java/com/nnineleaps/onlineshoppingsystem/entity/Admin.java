package com.nnineleaps.onlineshoppingsystem.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.engine.profile.Fetch;

@Entity
@Table(name="admin")
public class Admin {
	

	@Id
	@Column(name="admId")
	private Long adminId;
	
	@Column(name="admName")
	@Size(min=3,message="customer name should contain minimum three alphabets")
	private String adminName;
	
	@Column(name="admMobno")
	@Size(min=10,max=10,message="phone number should have minimum 10 numbers")
	private String adminMobno;
	
	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "productId", nullable = false, foreignKey = @ForeignKey(name = "fk_admin_product_id"))
	private List<Product> admin_product_upd = new ArrayList<>();

	public Admin() {
	// TODO Auto-generated constructor stub
}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminMobno() {
		return adminMobno;
	}

	public void setAdminMobno(String adminMobno) {
		this.adminMobno = adminMobno;
	}

	public List<Product> getAdmin_product_upd() {
		return admin_product_upd;
	}

	public void setAdmin_product_upd(List<Product> admin_product_upd) {
		this.admin_product_upd = admin_product_upd;
	}

	public Admin(Long adminId,
			@Size(min = 3, message = "customer name should contain minimum three alphabets") String adminName,
			@Size(min = 10, max = 10, message = "phone number should have minimum 10 numbers") String adminMobno,
			List<Product> admin_product_upd) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminMobno = adminMobno;
		this.admin_product_upd = admin_product_upd;
	}
	
	



	
	
	
	
}

