package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.entity.Student;
@Transactional
@Repository
public class StudentDaoImplement implements StudentDaoI {

	@PersistenceContext
	EntityManager em;
	
	

	@Override
	public List retrive() {
		Query q=em.createQuery("from Student s");
		return q.getResultList();
	}



	@Override
	public void create(Student s) {
		em.persist(s);		
	}



	@Override
	public Student findById(int id) {
		
		
		return em.find(Student.class, id);
	}



	@Override
	public void delete(int id) {

		Student stu=em.find(Student.class, id);
		System.out.println(stu.getId()+" "+stu.getName() +" "+stu.getDept());
		
		em.remove(stu);
		System.out.println("Deleted");
		
	}



	@Override
	public void update(int id) {

		Student stu=em.find(Student.class, id);
		System.out.println("Data before update "+ stu.getId()+" "+stu.getName() +" "+stu.getDept());
      
		stu.setDept("hr");
      
		System.out.println("Updated");
		
		Student stu1=em.find(Student.class, id);
		System.out.println("Data After update "+ stu1.getId()+" "+stu1.getName() +" "+stu1.getDept());
      
	}

}
