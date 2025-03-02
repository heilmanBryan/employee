package com.bryan.entities

import jakarta.persistence.Entity
import jakarta.persistence.EnumType
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = 'Employees')
class EmployeeEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Integer id
    String firstName
    String lastName
    @Enumerated(EnumType.STRING)
    RoleEntityEnum role
    @Enumerated(EnumType.STRING)
    CompanyEntityEnum company
    BigDecimal salary

}