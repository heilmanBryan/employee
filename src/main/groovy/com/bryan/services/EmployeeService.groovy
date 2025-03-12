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

    List<Employee> getAllEmployees() {
        def employeeEntities = repository.findAll()
        mapper.map(employeeEntities, List<Employee>)
    }

    EmployeeEntity createNewEmployee(Employee employee){
        def entity=  mapper.map(employee, EmployeeEntity)
        repository.save(entity)
        entity
    }

}
