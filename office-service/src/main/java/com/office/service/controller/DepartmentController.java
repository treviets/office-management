package com.office.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.service.service.declaration.DepartmentService;


@Controller
@RequestMapping("department")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfProject() {
		return departmentService.findAllOfDepartment();
	}
	
	@GetMapping(path = "/{departmentId}")
	@ResponseBody
	public Object getProjectById(@PathVariable Long departmentId) {
		return departmentService.findDepartmentById(departmentId);
	}

	
}
