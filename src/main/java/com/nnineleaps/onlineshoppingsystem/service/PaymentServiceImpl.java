package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Payment;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;
import com.nnineleaps.onlineshoppingsystem.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements IPaymentService{
	
	@Autowired
	private PaymentRepository paymRepository;

	@Override
	public List<Payment> getAllPayments() {
		return paymRepository.findAll();
	}

	@Override
	public Payment getPaymentById(Long paymentId) {
		return paymRepository.findById(paymentId).get();	
	}

	@Override
	public Payment updatePayment(Long paymentId, Payment updatedPayment) {
		Payment payment =getPaymentById(paymentId); 
		if(payment!=null) {
			payment.setPaymentType(updatedPayment.getPaymentType());
			payment.setPaymentDate(updatedPayment.getPaymentDate());
			payment.setPaymentTime(updatedPayment.getPaymentTime());
		  }
		paymRepository.save(payment);
		 
		return payment;
	}

	@Override
	public void deletePayment(Long paymentId) {
		paymRepository.deleteById(paymentId);
		
	}

	@Override
	public Payment insertPayment(Payment newPayment) {
		return paymRepository.save(newPayment);
	}

}
