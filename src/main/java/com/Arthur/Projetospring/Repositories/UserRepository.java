package com.Arthur.Projetospring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Arthur.Projetospring.Entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
