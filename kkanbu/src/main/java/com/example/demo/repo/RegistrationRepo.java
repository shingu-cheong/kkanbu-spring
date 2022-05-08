package com.example.demo.repo;

import com.example.demo.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
