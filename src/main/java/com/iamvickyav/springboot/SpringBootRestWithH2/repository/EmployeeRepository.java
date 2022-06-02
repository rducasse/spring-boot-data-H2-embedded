package com.iamvickyav.springboot.SpringBootRestWithH2.repository;

import com.iamvickyav.springboot.SpringBootRestWithH2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
}
