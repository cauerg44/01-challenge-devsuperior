package com.devsuperior.services;

import org.springframework.stereotype.Service;

import com.devsuperior.ents.Order;

@Service
public class ShippingService {

	public double shipment(Order order) {
		double basicPrice = order.getBasic();
		if(basicPrice < 100.0) {
			return basicPrice + 20.00;
		} else if (basicPrice >= 100.0 && basicPrice < 200.0) {
			return basicPrice + 12.00;
		} else {
			return basicPrice;
		}
    }
}
