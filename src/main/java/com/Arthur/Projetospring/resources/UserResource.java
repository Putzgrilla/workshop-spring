package com.Arthur.Projetospring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arthur.Projetospring.Entities.User;
import com.Arthur.Projetospring.UserServices.UserService;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	@Autowired
	private UserService service;
	@GetMapping
	public ResponseEntity<List<User>> procurarTudo() {
		List<User> lista = service.findAll();
		return ResponseEntity.ok().body(lista);
	}
@GetMapping(value = "/{id}")
public ResponseEntity<User> findbyId(@PathVariable Long id){
	User obj = service.FindById(id);
	
	return ResponseEntity.ok().body(obj);
	
}
}
