package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nnineleaps.onlineshoppingsystem.entity.Customer;
import com.nnineleaps.onlineshoppingsystem.entity.Delivery;
import com.nnineleaps.onlineshoppingsystem.repository.CustomerRepository;
import com.nnineleaps.onlineshoppingsystem.repository.DeliveryRepository;

@Service
public class DeliveryServiceImpl implements IDeliveryService{
	
	@Autowired
	private DeliveryRepository deliRepository;

	@Override
	public List<Delivery> getAllDeliveries() {
		return deliRepository.findAll();
	}

	@Override
	public Delivery getDeliveryById(Long deliveryId) {
		return deliRepository.findById(deliveryId).get();
	}

	@Override
	public Delivery updateDelivery(Long deliveryId, Delivery updatedDelivery) {

		Delivery delivery =getDeliveryById(deliveryId); 
		if(delivery!=null) {
			delivery.setPartnerName(updatedDelivery.getPartnerName());
			delivery.setPartnerMobno(updatedDelivery.getPartnerMobno());
			delivery.setCustomer_Name(updatedDelivery.getCustomer_Name());
			delivery.setCustomer_Mobno(updatedDelivery.getCustomer_Mobno());
			delivery.setCustomer_Address(updatedDelivery.getCustomer_Address());
		  }
		deliRepository.save(delivery);
		 
		return delivery;
	}

	@Override
	public void deleteDelivery(Long deliveryId) {
		deliRepository.deleteById(deliveryId);
		
	}

	@Override
	public Delivery insertDelivery(Delivery newDelivery) {
		return deliRepository.save(newDelivery);
	}
	

}
