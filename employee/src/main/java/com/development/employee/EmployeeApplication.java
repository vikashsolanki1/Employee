package com.development.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.development.employee.Model.Employee;
import com.development.employee.Repository.EmployeeRepository;

@SpringBootApplication
public class EmployeeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeApplication.class, args);
	}
		@Autowired
		private EmployeeRepository employeerepository;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee=new Employee();
		employee.setFirstName("vikash");
		employee.setLastName("Singh");
		employee.setEmailId("Solanki");
		employeerepository.save(employee);
	
	}

}
