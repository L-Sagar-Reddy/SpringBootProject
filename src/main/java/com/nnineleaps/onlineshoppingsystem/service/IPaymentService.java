package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Payment;

public interface IPaymentService {
	
	public List<Payment>getAllPayments();
	public Payment getPaymentById(Long paymentId);
	public Payment updatePayment(Long paymentId,Payment updatedPayment);
	public void deletePayment(Long paymentId);
	public Payment insertPayment(Payment newPayment);

}
