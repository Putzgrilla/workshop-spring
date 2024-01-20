package com.Arthur.Projetospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arthur.Projetospring.Entities.Order;

public interface OrderRepository  extends JpaRepository<Order, Long>{

}
