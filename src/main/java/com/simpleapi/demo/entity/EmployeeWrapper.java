package com.simpleapi.demo.entity;

import java.util.List;

public class EmployeeWrapper {

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
