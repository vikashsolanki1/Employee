package com.development.employee.Repository;





import com.development.employee.Model.Employee;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	
    // all crud database methods
}

