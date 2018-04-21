package com.office.service.service.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.service.dao.DepartmentRepository;
import com.office.service.model.Result;
import com.office.service.model.Department;
import com.office.service.service.declaration.DepartmentService;

@Service
public class DepartmentServiceImp implements DepartmentService {
	
	@Autowired DepartmentRepository departmentRepository;
	
	@Override
	@Transactional
	public Result findAllOfDepartment() {
		final List<Department> listOfDepartments = (List<Department>) departmentRepository.findAll();
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("department", listOfDepartments);
		
		return new Result(result, true);
	}

	@Override
	public Result findDepartmentById(Long departmentId) {
		return null;
	}

	

}
