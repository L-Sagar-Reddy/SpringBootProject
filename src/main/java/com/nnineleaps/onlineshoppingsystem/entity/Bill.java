package com.nnineleaps.onlineshoppingsystem.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="bill")
public class Bill {
	

	@Id
	@Column(name="bill_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long billId;
	
	@Column(name="bill_amount")
	private String billAmount;
	
	@Column(name="bill_desc")
	private String billDesc;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="payment_Id",nullable=false,foreignKey=@ForeignKey(name="fk_bill_payment_id"))
    private Payment bill_payment_upd;
	

	public Bill() {
		// TODO Auto-generated constructor stub
	}


	public Long getBillId() {
		return billId;
	}


	public void setBillId(Long billId) {
		this.billId = billId;
	}


	public String getBillAmount() {
		return billAmount;
	}


	public void setBillAmount(String billAmount) {
		this.billAmount = billAmount;
	}


	public String getBillDesc() {
		return billDesc;
	}


	public void setBillDesc(String billDesc) {
		this.billDesc = billDesc;
	}


	public Payment getBill_payment_upd() {
		return bill_payment_upd;
	}


	public void setBill_payment_upd(Payment bill_payment_upd) {
		this.bill_payment_upd = bill_payment_upd;
	}


	public Bill(Long billId, String billAmount, String billDesc, Payment bill_payment_upd) {
		super();
		this.billId = billId;
		this.billAmount = billAmount;
		this.billDesc = billDesc;
		this.bill_payment_upd = bill_payment_upd;
	}
	
	
	
	
	

}
