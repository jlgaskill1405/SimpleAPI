package com.simpleapi.demo.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmployeeWrapper {
    @JsonProperty("employees")
    private List<Employees> employeesList;

    public EmployeeWrapper() {
    }
    public EmployeeWrapper(List<Employees> employeesList) {
        this.employeesList = employeesList;
    }

    public List<Employees> getEmployeesList() {
        return employeesList;
    }
}
