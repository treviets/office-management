package com.office.gui.service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.office.gui.model.Task;
import com.office.gui.service.declaration.TaskService;

@Service
public class TaskServiceImp implements TaskService {
	
	
	@Override
	@Transactional
	public List<Task> findAllOfTask() {
		return null;
	}
	

}
