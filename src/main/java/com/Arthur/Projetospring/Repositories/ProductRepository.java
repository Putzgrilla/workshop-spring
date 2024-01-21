package com.Arthur.Projetospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arthur.Projetospring.Entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
