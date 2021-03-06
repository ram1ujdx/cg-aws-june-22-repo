package com.cg.employeeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.employeeapp.model.Employee;
import com.cg.employeeapp.repository.IEmployeeJPARepository;
import com.cg.employeeapp.repository.IEmployeeRepository;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private IEmployeeJPARepository repo;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		// return repo.saveEmployee(employee);
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(int id) {
		// return repo.getEmployeeById(id);
		return repo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return repo.save(employee);
	}

	@Override
	public boolean deleteEmployee(int id) {
		repo.deleteById(id);
		return !repo.existsById(id);
	}

	
	
}
