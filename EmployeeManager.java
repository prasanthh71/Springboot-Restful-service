package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {
    private Employees employees;

    // Constructor
    public EmployeeManager() {
        this.employees = new Employees();

        // Add example employees
        employees.getEmployeeList().add(new Employee("1", "John", "Doe", "john.doe@example.com", "Software Engineer"));
        employees.getEmployeeList().add(new Employee("2", "Jane", "Smith", "jane.smith@example.com", "Project Manager"));
        employees.getEmployeeList().add(new Employee("3", "Alice", "Johnson", "alice.johnson@example.com", "HR Specialist"));
    }

    // Getter for Employees
    public Employees getEmployees() {
        return employees;
    }
}
