package org.greatlearning.ems.services;

import java.util.List;

import org.greatlearning.ems.entites.Employee;

public interface EmployeeService {
Employee insertEmployee(Employee employee);
void deleteEmployeeById(int id);
List<Employee> getAllEmployee();
Employee getEmployeeById(int id);
Employee updateEmployee(Employee e);

}
