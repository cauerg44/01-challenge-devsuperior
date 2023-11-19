package com.devsuperior.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.ents.Order;

@Service
public class OrderService {

	@Autowired
	private ShippingService shippingService;

	public double total(Order order) {
		double shippCost = shippingService.shipment(order);
		double discountOrder = order.getBasic() * (order.getDiscount() / 100.0);
		double total = shippCost - discountOrder;
		return total;
	}
}
