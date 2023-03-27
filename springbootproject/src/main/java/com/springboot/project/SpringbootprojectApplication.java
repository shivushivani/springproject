package com.springboot.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.entity.Student;
import com.springboot.repository.Studentrepository;

@SpringBootApplication
public class SpringbootprojectApplication implements CommandLineRunner {

	@Autowired
	private Studentrepository studentrepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringbootprojectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = Student.builder().name("Anii").email("anii@Gmail.com").build();
		Student student2 = Student.builder().name(" shivu").email("shivu@Gmail.com").build();
		Student student3 = Student.builder().name("Raj ").email("raj@Gmail.com").build();
		Student student4 = Student.builder().name("Tanu").email("tanu@Gmail.com").build();

		studentrepository.save(student);
		studentrepository.save(student2);
		studentrepository.save(student3);
		studentrepository.save(student4);
		System.out.println("-----------------students saved---------------------");

	}

}