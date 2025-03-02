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
@RequestMapping('employees')
class EmployeeController {

    @Autowired
    EmployeeService employeeService

    @Autowired
    ModelMapper mapper

    @GetMapping
    ResponseEntity<List<EmployeeEntity>> getAllEmployees() {
        new ResponseEntity(employeeService.getAllEmployees(), HttpStatusCode.valueOf(200))
    }

    @PostMapping
    def createNewEmployee(@RequestBody Employee employee) {
        employeeService.createNewEmployee(employee)
        new ResponseEntity(HttpStatusCode.valueOf(201))
    }

}
