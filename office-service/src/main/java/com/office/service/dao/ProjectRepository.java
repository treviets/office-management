package com.office.service.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.office.service.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{

}
