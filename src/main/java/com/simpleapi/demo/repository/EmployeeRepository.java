package com.simpleapi.demo.repository;

import com.simpleapi.demo.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
