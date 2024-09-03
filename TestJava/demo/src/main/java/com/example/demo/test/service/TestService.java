package com.example.demo.test.service;

import com.example.demo.test.model.T1;
import org.springframework.stereotype.Service;
import com.example.demo.test.repository.TestRepository;

import java.util.List;

@Service
public class TestService {
    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }
    
    public List<T1> getT1Data() {
        return testRepository.findAll();
    }
}
