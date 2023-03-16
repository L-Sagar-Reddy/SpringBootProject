package com.nnineleaps.onlineshoppingsystem.service;

import java.util.List;
import com.nnineleaps.onlineshoppingsystem.entity.Delivery;

public interface IDeliveryService {
	public List<Delivery>getAllDeliveries();
	public Delivery getDeliveryById(Long deliveryId);
	public Delivery updateDelivery(Long deliveryId,Delivery updatedDelivery);
	public void deleteDelivery(Long deliveryId);
	public Delivery insertDelivery(Delivery newDelivery);

}
