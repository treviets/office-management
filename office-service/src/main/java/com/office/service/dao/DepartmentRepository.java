package com.office.service.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.office.service.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
}
