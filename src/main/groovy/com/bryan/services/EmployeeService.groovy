package com.bryan.services

import com.bryan.entities.EmployeeEntity
import com.bryan.models.Employee
import com.bryan.repositories.EmployeeRepository
import org.modelmapper.ModelMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class EmployeeService {

    @Autowired
    ModelMapper mapper

    @Autowired
    EmployeeRepository repository

    List<EmployeeEntity> getAllEmployees() {
        def employeeEntities = repository.findAll()
        employeeEntities
    }

}
