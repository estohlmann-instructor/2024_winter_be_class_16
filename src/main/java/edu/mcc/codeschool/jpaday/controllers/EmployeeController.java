package edu.mcc.codeschool.jpaday.controllers;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/findByFirstName/{firstName}")
    public ResponseEntity<Employee> findFirstName(@PathVariable String firstName){
        return employeeService.findEmployeeByFirstName(firstName);
    }
}
