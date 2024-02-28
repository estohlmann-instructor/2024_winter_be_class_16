package edu.mcc.codeschool.jpaday.services;

import edu.mcc.codeschool.jpaday.models.Employee;
import edu.mcc.codeschool.jpaday.repos.EmployeeRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ResponseEntity<List<Employee>> getAllEmployees(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }

    public ResponseEntity<Employee> findEmployeeByFirstName(String firstName){
        return ResponseEntity.ok(employeeRepository.findFirstByFirstName(firstName));
    }
}
