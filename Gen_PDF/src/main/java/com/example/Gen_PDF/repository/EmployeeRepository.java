package com.example.Gen_PDF.repository;

import com.example.Gen_PDF.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("FROM Employee e")
    List<Employee> getAllEmployeeData();

}
