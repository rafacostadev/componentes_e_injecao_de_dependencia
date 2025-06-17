package com.aulasjava.aulasjava.services;

import org.springframework.stereotype.Service;

import com.aulasjava.aulasjava.DTO.OrderDTO;

@Service
public class ShippingService {
	public double shipment(OrderDTO order) {
		if(order.getBasic() > 200) {
			return 0.00;
		}
		else if(order.getBasic() > 100) {
			return 12.00;
		}
		else {
			return 20.00;
		}
	}
}
