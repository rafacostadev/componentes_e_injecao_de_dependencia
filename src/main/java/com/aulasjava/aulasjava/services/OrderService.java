package com.aulasjava.aulasjava.services;

import org.springframework.stereotype.Service;

import com.aulasjava.aulasjava.DTO.OrderDTO;

@Service
public class OrderService {

	private ShippingService shippingService;

	public OrderService(ShippingService shippingService) {
		this.shippingService = shippingService;
	}

	public double total(OrderDTO order) {
		order.setBasic(order.getBasic() - order.getBasic() * (order.getDiscount() / 100));
		return order.getBasic() + shippingService.shipment(order);
	}
}
