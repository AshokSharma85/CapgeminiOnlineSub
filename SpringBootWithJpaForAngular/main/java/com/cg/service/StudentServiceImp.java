package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@Service
public class StudentServiceImp implements StudentServiceI{

	@Autowired
	StudentDaoI studentDao;
	
	@Override
	public void create(Student s)
	{
		studentDao.create(s);
	}
	
	@Override
	public List retrive()
	{
		return studentDao.retrive();
	}
	
	@Override
	public Student findById(int i) {
		return studentDao.findById(i);
	}

	@Override
	public void delete(int id) {
		studentDao.delete(id);
	}
	

}
