package org.lavi.services;

import org.lavi.entities.Employee;

public interface EmployeeService {
// For searching employee
    public Employee getEmployeeById(long id);

// For creating employee
    public boolean addEmployee(Employee employee);
}
