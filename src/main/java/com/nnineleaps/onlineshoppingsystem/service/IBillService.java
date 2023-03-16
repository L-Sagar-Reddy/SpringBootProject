package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Bill;

public interface IBillService {
	
	public List<Bill>getAllBills();
	public Bill getBillById(Long billId);
	public Bill updateBill(Long billId,Bill updatedBill);
	public void deleteBill(Long billId);
	public Bill insertBill(Bill newBill);

}
