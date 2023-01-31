package org.greatlearning.ems;

import org.greatlearning.ems.entites.Employee;
import org.greatlearning.ems.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyAppRunner implements CommandLineRunner{
	@Autowired
private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
	Employee e1=new Employee();
	e1.setFirstName("Sagar");
	e1.setLastName("Chandak");
	e1.setEmail("sagar@gmail.com");
	
	Employee e2=new Employee();
	e2.setFirstName("Snehal");
	e2.setLastName("Rathi");
	e2.setEmail("snehal@gmail.com");
	employeeRepository.save(e1);
	employeeRepository.save(e2);
	
		
	}

}
