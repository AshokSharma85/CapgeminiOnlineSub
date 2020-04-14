package com.cg;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.StudentDaoI;
import com.cg.entity.Student;

@SpringBootApplication
public class SpringBootProjectDataJpaRestApplication implements  CommandLineRunner{

	@Autowired
	StudentDaoI studao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProjectDataJpaRestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Student s1=new Student(5,"ashok","dev");
		Student s2=new Student(2,"ashok","ca");
		Student s3=new Student(3,"ashok","ca");
		Student s4=new Student(4,"ashok","ca");
		
	
		studao.create(s1);
		studao.create(s2);
		studao.create(s3);
		studao.create(s4);
		System.out.println("Inserted");*/
		
		/*List<Student> studentList =studao.retrive();
		
		for(Student stu:studentList)
		{
			System.out.println(stu.getId()+" "+stu.getName() +" "+stu.getDept());
		}
		*/
		
		 
		/*Student stu=studao.findById(2);
		System.out.println(stu.getId()+" "+stu.getName() +" "+stu.getDept());
		*/
	
		/*studao.delete(3);*/
		/*studao.update(4);*/
	}

}
