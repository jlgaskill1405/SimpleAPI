package com.simpleapi.demo.service;

import com.simpleapi.demo.entity.EmployeeWrapper;
import com.simpleapi.demo.entity.Employees;
import com.simpleapi.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;


public interface EmployeeService {

    public EmployeeWrapper findAll();
    public Employees findById(Integer id);

}
