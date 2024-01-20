package com.Arthur.Projetospring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arthur.Projetospring.Entities.User;
import com.Arthur.Projetospring.Repositories.UserRepository;

@Service
public class UserService {
	@Autowired
private UserRepository repository; 
	public List<User> findAll(){
		
		return repository.findAll();
	}
	public User FindById(long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
		
	}

}
