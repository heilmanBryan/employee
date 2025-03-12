package com.bryan.controllers;

import com.bryan.models.Employee;
import com.bryan.services.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createNewEmployee(@RequestBody Employee employee) {
        employeeService.createNewEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    private List<Employee> newEmployeeCreation(List<Employee> employeesInitial) {
        return employeesInitial.stream().map(this::updateFirstName).collect(Collectors.toList());
    }

    private Employee updateFirstName(Employee employee) {
        employee.setFirstName("Steve");
        return employee;
    }
}
