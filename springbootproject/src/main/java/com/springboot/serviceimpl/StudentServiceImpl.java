package com.springboot.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Student;
import com.springboot.repository.Studentrepository;
import com.springboot.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private Studentrepository Studentrepository;

	@Override
	public Student postStudent(Student s) {

		return Studentrepository.save(s);
	}

	@Override
	public Student getStudent(int id) {
		// TODO Auto-generated method stub
		return Studentrepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return Studentrepository.findAll();
	}

	@Override
	public Student updateStudent(Student params, int id) {
		// TODO Auto-generated method stub
		Student _student = Studentrepository.findById(id).get();
		_student.setName(params.getName());
		_student.setEmail(params.getEmail());
		return Studentrepository.save(_student);
	}

	@Override
	public String deleteStudent(int id) {
		// TODO Auto-generated method stub
		Studentrepository.deleteById(id);
		return "the student with id " + id + " has been deleted...";
	}
}