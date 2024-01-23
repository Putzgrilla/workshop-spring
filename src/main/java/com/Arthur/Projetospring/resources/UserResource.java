package com.Arthur.Projetospring.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.Arthur.Projetospring.Entities.User;
import com.Arthur.Projetospring.Services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


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
@PostMapping()
public ResponseEntity<User> insert(@RequestBody User obj) {
    //TODO: process POST request
    obj= service.insert(obj);
    URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
	return ResponseEntity.created(uri).body(obj);
}

}
