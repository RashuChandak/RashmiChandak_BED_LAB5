package org.greatlearning.ems.repositories;

import org.greatlearning.ems.entites.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}
