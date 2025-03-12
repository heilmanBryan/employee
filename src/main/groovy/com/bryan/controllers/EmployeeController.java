package com.bryan.controllers

import com.bryan.entities.EmployeeEntity
import com.bryan.models.Employee
import com.bryan.services.EmployeeService
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatusCode
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private ModelMapper mapper;

    @GetMapping
    public ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatusCode.);
    }

    @PostMapping
    public ResponseEntity<Void> createNewEmployee(@RequestBody Employee employee) {
        employeeService.createNewEmployee(employee);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
