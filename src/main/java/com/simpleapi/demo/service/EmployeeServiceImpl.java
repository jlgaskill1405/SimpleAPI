package com.simpleapi.demo.service;

import com.simpleapi.demo.entity.Employees;
import com.simpleapi.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public List<Employees> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employees findById(Integer id) {
        return employeeRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("No employee was found with id: " + id));
    }
}
