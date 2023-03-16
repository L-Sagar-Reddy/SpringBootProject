package com.nnineleaps.onlineshoppingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nnineleaps.onlineshoppingsystem.entity.Bill;
import com.nnineleaps.onlineshoppingsystem.service.IBillService;

@RestController
public class BillController {
	
	@Autowired
	private IBillService billService;
	
	@PostMapping("/insertbill")
	public String insertBill(@RequestBody Bill newBill) {
		billService.insertBill(newBill);
		return "Bill added successfully!!";
	}
	
	@DeleteMapping("/deletebill/{billid}")
	public void deleteBill( @PathVariable ("billid")Long billId ){
		billService.deleteBill(billId);
	}
	
	@GetMapping("/getallbills")
	public List<Bill>getAllBills(){
		return billService.getAllBills();
	}
	
	@PutMapping("/updatebill/{billid}")
	public Bill updateBill(@PathVariable("billid")Long billId,@RequestBody Bill updatedBill) {
		return billService.updateBill( billId, updatedBill);
	}
	
	@GetMapping("/getbillbyid/{billid}")
	public Bill getCustomerById(@PathVariable("billid")Long billId) {
		return billService.getBillById(billId);

}
}
