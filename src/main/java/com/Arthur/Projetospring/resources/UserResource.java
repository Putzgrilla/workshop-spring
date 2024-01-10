package com.Arthur.Projetospring.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Arthur.Projetospring.Entities.User;

@RestController
@RequestMapping(value = "/users")

public class UserResource {
	@GetMapping
	public ResponseEntity<User> procurarTudo() {
		User u = new User(1L, "jonas", "jonas@gmail.com", "13887403312", "12345");
		return ResponseEntity.ok().body(u);

	}
}
