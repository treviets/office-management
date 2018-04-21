package com.office.service.service.implementation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.service.dao.TaskRepository;
import com.office.service.model.Result;
import com.office.service.model.Task;
import com.office.service.service.declaration.TaskService;

@Service
public class TaskServiceImp implements TaskService {
	
	@Autowired TaskRepository taskRepository;
	
	@Override
	@Transactional
	public Result findAllOfTask() {
		final List<Task> listOfTasks = (List<Task>) taskRepository.findAll();
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("task", listOfTasks);
		
		return new Result(result, true);
	}

	@Override
	public Result findTaskByTaskId(Long taskId) {
		Optional<Task> task = taskRepository.findById(taskId);
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("task", task);
		
		return new Result(result, true);
	}

	@Override
	public Result findTaskByProjectId(Long projectId) {
		final List<Task> task = taskRepository.findByProjectId(projectId);
		final Map<String, Object> result = new HashMap<String, Object>();
		result.put("task", task);
		
		return new Result(result, true);
	}
	

}
