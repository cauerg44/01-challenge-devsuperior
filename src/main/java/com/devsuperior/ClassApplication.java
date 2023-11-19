package com.devsuperior;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.devsuperior.ents.Order;
import com.devsuperior.services.OrderService;
import com.devsuperior.services.ShippingService;

@SpringBootApplication
@ComponentScan({"com.devsuperior"})
public class ClassApplication implements CommandLineRunner{

	@Autowired
	private OrderService orderService;
	
	public static void main(String[] args) {
		SpringApplication.run(ClassApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Integer code =  sc.nextInt();
		Double basic = sc.nextDouble();
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);
		
		System.out.println("Order code: " + order.getCode());
		System.out.printf("Total value: %.2f%n", orderService.total(order));
		
		
		sc.close();
	}
}
