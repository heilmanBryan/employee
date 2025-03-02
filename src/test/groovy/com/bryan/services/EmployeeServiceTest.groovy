package com.bryan.services

import com.bryan.entities.EmployeeEntity
import com.bryan.models.Employee
import com.bryan.repositories.EmployeeRepository
import spock.lang.Specification

class EmployeeServiceTest extends Specification{

    EmployeeService service
    EmployeeRepository repo

    def setup(){
        repo = Mock(EmployeeRepository)
        repo.findAll() >> [new EmployeeEntity(id:1, firstName: 'Bryan')]
        service = new EmployeeService(repository: repo)
    }

    def 'testIt'(){
        given: 'repo'

        when:
        def result =service.getAllEmployees()

        then:
        result[0].firstName == 'Bryan'
    }
}
