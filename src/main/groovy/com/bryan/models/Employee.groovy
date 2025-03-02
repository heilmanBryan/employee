package com.bryan.models

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Employee {
    Integer id
    String firstName
    String lastName
    Company company
    Role role
    BigDecimal salary
    String middleName
}
