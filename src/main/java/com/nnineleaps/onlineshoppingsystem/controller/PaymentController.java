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

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Payment;
import com.nnineleaps.onlineshoppingsystem.service.ICustomerService;
import com.nnineleaps.onlineshoppingsystem.service.IPaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private IPaymentService paymService;
	
	@PostMapping("/insertpayment")
	public String insertPayment(@RequestBody Payment newPayment) {
		paymService.insertPayment(newPayment);
		return "Payment added successfully!!";
	}
	
	@DeleteMapping("/deletepayment/{paymid}")
	public void deletePayment( @PathVariable ("paymid")Long paymentId ){
		paymService.deletePayment(paymentId);
	}
	
	@GetMapping("/getallpaymentss")
	public List<Payment>getAllPayments(){
		return paymService.getAllPayments();
	}
	
	@PutMapping("/updatepayment/{paymid}")
	public Payment updatePayment(@PathVariable("paymid")Long paymentId,@RequestBody Payment updatedPayment) {
		return paymService.updatePayment( paymentId, updatedPayment);
	}
	
	@GetMapping("/getpaymentbyid/{paymid}")
	public Payment getPaymentById(@PathVariable("paymid")Long paymentId) {
		return paymService.getPaymentById(paymentId);
	}

}
