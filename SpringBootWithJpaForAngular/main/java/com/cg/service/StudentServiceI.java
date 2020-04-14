package com.cg.service;

import java.util.List;

import com.cg.entity.Student;

public interface StudentServiceI {

	public void create(Student s);

	public List retrive();

	public Student findById(int i);
	
	public void delete(int id);

}
