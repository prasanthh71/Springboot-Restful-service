# Spring Boot RESTful Service

This project demonstrates building a RESTful web service using Spring Boot. The service manages a list of employees.

## Features
- GET: Retrieve all employees.
- JSON response format.

## How to Run
1. Clone the repository.
2. Run the application using `DemoApplication.java`.
3. Access the service at `http://localhost:8080/employees`.

## Sample Output
```json
{
  "employeeList": [
    {
      "employee_id": "1",
      "first_name": "John",
      "last_name": "Doe",
      "email": "john.doe@example.com",
      "title": "Software Engineer"
    }
  ]
}
