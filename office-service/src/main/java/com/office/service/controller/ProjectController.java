package com.office.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.service.service.declaration.ProjectService;


@Controller
@RequestMapping("project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfProject() {
		return projectService.findAllOfProject();
	}
	
	@GetMapping(path = "/{projectId}")
	@ResponseBody
	public Object getProjectById(@PathVariable Long projectId) {
		return projectService.findProjectById(projectId);
	}
	
	
	
	
	
}
