package com.commonerror.commonerrorinspring.beans;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
public class Course {
	@Id
	private int courseId;
	@ManyToMany(mappedBy="likedCources")
	private Set<Employee> likes;

}
