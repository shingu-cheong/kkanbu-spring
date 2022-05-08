package com.example.demo.repo;

import com.example.demo.model.Olderman;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OldermanRepo extends JpaRepository <Olderman, Integer> {


}
