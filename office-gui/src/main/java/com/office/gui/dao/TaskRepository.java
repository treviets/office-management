package com.office.gui.dao;

import org.springframework.data.repository.CrudRepository;

import com.office.gui.model.Task;

public interface TaskRepository extends CrudRepository<Task, Long>{

}
