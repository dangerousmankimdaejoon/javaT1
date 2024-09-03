package com.example.demo.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.test.model.T1;

public interface TestRepository extends JpaRepository<T1, Integer> {
}