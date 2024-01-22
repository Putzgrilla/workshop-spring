package com.Arthur.Projetospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arthur.Projetospring.Entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
