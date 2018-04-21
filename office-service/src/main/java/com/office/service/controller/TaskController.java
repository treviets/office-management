package com.office.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.office.service.service.declaration.TaskService;


@Controller
@RequestMapping("task")
public class TaskController {
	
	@Autowired
	private TaskService taskService;
	
	@GetMapping(path = "/")
	@ResponseBody
	public Object findAllOfTask() {
		return taskService.findAllOfTask();
	}
	
	@GetMapping(path = "/{taskId}")
	@ResponseBody
	public Object findTaskByTaskId(@PathVariable Long taskId) {
		System.out.println("find Task By Task Id");
		return taskService.findTaskByTaskId(taskId);
	}
	
	@GetMapping(path = "/project/{projectId}")
	@ResponseBody
	public Object findTaskByProjectId(@PathVariable Long projectId) {
		System.out.println("find Task By Project Id");
		return taskService.findTaskByProjectId(projectId);
	}
	
	
	
	
}
