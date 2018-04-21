package com.office.service.service.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.service.dao.ProjectRepository;
import com.office.service.model.Result;
import com.office.service.model.Project;
import com.office.service.service.declaration.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService {
	
	@Autowired ProjectRepository projectRepository;
	
	@Override
	@Transactional
	public Result findAllOfProject() {
		final List<Project> listOfGroup = (List<Project>) projectRepository.findAll();
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("project", listOfGroup);
		
		return new Result(result, true);
	}

	@Override
	public Result findProjectById(Long projectId) {
		Object project = projectRepository.findById(projectId);
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("project", project);
		
		return new Result(result, true);
	}
	

}
