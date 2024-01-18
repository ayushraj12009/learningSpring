package com.spring2.Mock.Spring2.Repository;

import com.spring2.Mock.Spring2.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
