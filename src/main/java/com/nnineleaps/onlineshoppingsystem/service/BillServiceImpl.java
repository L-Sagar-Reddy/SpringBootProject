package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Bill;
import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.repository.BillRepository;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;

@Service
public class BillServiceImpl implements IBillService{
	
	@Autowired
	private BillRepository billRepository;

	@Override
	public List<Bill> getAllBills() {
		return billRepository.findAll();
	}

	@Override
	public Bill getBillById(Long billId) {
		return billRepository.findById(billId).get();	
	}

	@Override
	public Bill updateBill(Long billId, Bill updatedBill) {
		Bill bill =getBillById(billId); 
		if(bill!=null) {
			bill.setBillAmount(updatedBill.getBillAmount());
			bill.setBillDesc(updatedBill.getBillDesc());
		  }
		billRepository.save(bill);
		 
		return bill;
	}

	@Override
	public void deleteBill(Long billId) {
		billRepository.deleteById(billId);
		
	}

	@Override
	public Bill insertBill(Bill newBill) {
		return billRepository.save(newBill);
	}

}
