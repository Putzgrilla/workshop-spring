package com.Arthur.Projetospring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arthur.Projetospring.Entities.Order;
import com.Arthur.Projetospring.Repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
private OrderRepository repository; 
	public List<Order> findAll(){
		
		return repository.findAll();
	}
	public Order FindById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
		
		
	}

}
