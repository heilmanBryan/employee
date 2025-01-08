package com.bryan.repositories

import com.bryan.entities.EmployeeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}