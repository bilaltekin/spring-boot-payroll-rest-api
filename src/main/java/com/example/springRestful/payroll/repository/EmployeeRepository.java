package com.example.springRestful.payroll.repository;

import com.example.springRestful.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


}
