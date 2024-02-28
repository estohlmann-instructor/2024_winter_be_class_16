package edu.mcc.codeschool.jpaday.repos;

import edu.mcc.codeschool.jpaday.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findFirstByFirstName(String firstName);
}
