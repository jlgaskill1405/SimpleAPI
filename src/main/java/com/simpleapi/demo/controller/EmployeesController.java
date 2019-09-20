package com.simpleapi.demo.controller;

import com.simpleapi.demo.entity.Employees;
import com.simpleapi.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employees> getAll(){
        return employeeService.findAll();
    }

    @GetMapping("/{id}")
        public Employees findById(@PathVariable final Integer id){
            return employeeService.findById(id);
        }
}
