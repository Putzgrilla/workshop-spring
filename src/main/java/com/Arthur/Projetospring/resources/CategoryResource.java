package com.Arthur.Projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arthur.Projetospring.Entities.Category;
import com.Arthur.Projetospring.Services.CategoryService;

@RestController
@RequestMapping(value = "/categorys")

public class CategoryResource {
	@Autowired
	private CategoryService service;
	@GetMapping
	public ResponseEntity<List<Category>> procurarTudo() {
		List<Category> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
@GetMapping(value = "/{id}")
public ResponseEntity<Category> findbyId(@PathVariable Long id){
	Category obj = service.FindById(id);
	
	return ResponseEntity.ok().body(obj);
	
}
}
