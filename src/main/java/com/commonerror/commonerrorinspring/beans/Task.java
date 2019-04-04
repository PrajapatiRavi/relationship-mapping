package com.commonerror.commonerrorinspring.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Task {

	@Id
	private int taskId;
	private String taskModule;
	private String taskCompany;

	@ManyToOne
	//@JoinColumn(name = "projectId")
	private Project project;

	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskModule() {
		return taskModule;
	}

	public void setTaskModule(String taskModule) {
		this.taskModule = taskModule;
	}

	public String getTaskCompany() {
		return taskCompany;
	}

	public void setTaskCompany(String taskCompany) {
		this.taskCompany = taskCompany;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskModule=" + taskModule + ", taskCompany=" + taskCompany + ", project="
				+ project + "]";
	}

}
