package com.Arthur.Projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arthur.Projetospring.Entities.Order;
import com.Arthur.Projetospring.Services.OrderService;

@RestController
@RequestMapping(value = "/orders")

public class OrderResource {
	@Autowired
	private OrderService service;
	@GetMapping
	public ResponseEntity<List<Order>> procurarTudo() {
		List<Order> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
@GetMapping(value = "/{id}")
public ResponseEntity<Order> findbyId(@PathVariable Long id){
	Order obj = service.FindById(id);
	
	return ResponseEntity.ok().body(obj);
	
}
}
