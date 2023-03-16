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
import com.nnineleaps.onlineshoppingsystem.entity.Delivery;
import com.nnineleaps.onlineshoppingsystem.service.ICustomerService;
import com.nnineleaps.onlineshoppingsystem.service.IDeliveryService;

@RestController
public class DeliveryController {
	
	@Autowired
	private IDeliveryService deliService;
	
	@PostMapping("/insertdelivery")
	public String insertDelivery(@RequestBody Delivery newDelivery) {
		deliService.insertDelivery(newDelivery);
		return "Delivery added successfully!!";
	}
	
	@DeleteMapping("/deletedelivery/{deliid}")
	public void deleteDelivery( @PathVariable ("deliid")Long deliveryId ){
		deliService.deleteDelivery(deliveryId);
	}
	
	@GetMapping("/getalldeliveriess")
	public List<Delivery>getAllDeliveries(){
		return deliService.getAllDeliveries();
	}
	
	@PutMapping("/updatedelivery/{deliid}")
	public Delivery updateDelivery(@PathVariable("deliid")Long deliveryId,@RequestBody Delivery updatedDelivery) {
		return deliService.updateDelivery( deliveryId, updatedDelivery);
	}
	
	@GetMapping("/getdeliverybyid/{deliid}")
	public Delivery getDeliveryById(@PathVariable("deliid")Long deliveryId) {
		return deliService.getDeliveryById(deliveryId);
	}

	

}
