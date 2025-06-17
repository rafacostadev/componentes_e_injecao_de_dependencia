package com.aulasjava.aulasjava;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aulasjava.aulasjava.DTO.OrderDTO;
import com.aulasjava.aulasjava.services.OrderService;
import com.aulasjava.aulasjava.services.ShippingService;

@SpringBootApplication
public class AulasjavaApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(AulasjavaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OrderDTO order = new OrderDTO(1309, 95.90, 0.0);
		OrderService service = new OrderService(new ShippingService());
		System.out.println("Pedido código: " + order.getOrder());
		System.out.println("Valor total: " + service.total(order));

		
	}

}
