package com.my.outdoor.service;

import java.util.List;

import com.my.outdoor.pojo.Project;

public interface projectservice {
	public List<Project> listProject();
	public void  projectUpadate(Project project);
	public void projectDelete(Project project);
	public void projectAdd(Project project);
	public List<Project> projectList(Project project);

}
