package com.office.service.service.declaration;

import com.office.service.model.Result;

public interface DepartmentService {
	
	Result findAllOfDepartment();
	
	Result findDepartmentById(Long departmentId);
}
