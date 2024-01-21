package com.Arthur.Projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arthur.Projetospring.Entities.Product;
import com.Arthur.Projetospring.Services.ProductService;

@RestController
@RequestMapping(value = "/products")

public class ProductResource {
	@Autowired
	private ProductService service;
	@GetMapping
	public ResponseEntity<List<Product>> procurarTudo() {
		List<Product> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
@GetMapping(value = "/{id}")
public ResponseEntity<Product> findbyId(@PathVariable Long id){
	Product obj = service.FindById(id);
	
	return ResponseEntity.ok().body(obj);
	
}
}
