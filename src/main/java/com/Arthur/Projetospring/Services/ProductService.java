package com.Arthur.Projetospring.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Arthur.Projetospring.Entities.Product;
import com.Arthur.Projetospring.Repositories.ProductRepository;

@Service
public class ProductService {
	@Autowired
private ProductRepository repository; 
	public List<Product> findAll(){
		
		return repository.findAll();
	}
	public Product FindById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
		
		
	}

}
