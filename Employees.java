package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Employees {
    private List<Employee> employeeList;

    // Constructor
    public Employees() {
        this.employeeList = new ArrayList<>();
    }

    // Getter for employee list
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    // Setter for employee list
    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
