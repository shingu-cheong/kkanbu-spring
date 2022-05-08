package com.example.demo.repo;

import java.util.Optional;

import com.example.demo.model.Login;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LoginRepo extends JpaRepository<Login, Integer> {

    Optional<Login> findByUsernameAndPassword(String email, String password);

}
