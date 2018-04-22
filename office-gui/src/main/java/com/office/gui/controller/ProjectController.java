package com.office.gui.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.gui.util.OfficeRestApiHelper;
import com.office.gui.util.OfficeUrlHelper;

@Controller
@RequestMapping("project")
public class ProjectController extends BaseController {
	
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfProjects(HttpServletRequest request) {
		String findAllOfProjectsUrl = getMainDomain(request) + OfficeUrlHelper.FIND_ALL_OF_PROJECT;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object projects = OfficeRestApiHelper.get(findAllOfProjectsUrl, result);
		
		return projects;
	}
	
	@GetMapping(path = "/{id}")
	@ResponseBody
	public Object findProjectbyId(HttpServletRequest request, @PathVariable Long projectId) {
		String findProjectByIdUrl = getMainDomain(request) + OfficeUrlHelper.FIND_PROJECT_BY_ID + projectId;
		
		Map<String, Object> result = new HashMap<String, Object>();
		Object project = OfficeRestApiHelper.get(findProjectByIdUrl, result);
		
		return project;
	}
	
	@GetMapping(path = "/detail/")
	public String viewProjectDetail() {
		// Get Detail Information of Project by Id
		/*
		 * Not yet implement
		 */
		
		
		// Return to view
		return "project-detail";
	}

	
}
