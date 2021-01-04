package com.ex.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.demo.error.StudentNotFoundException;
import com.ex.demo.model.Student;
import com.ex.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository repo;

	public Student save(Student st) throws StudentNotFoundException {
		if(st.equals("")){
        throw new StudentNotFoundException();

		}
		else
			return repo.save(st);

	}

	public List<Student> getStudent() {

		return repo.findAll();

	}

}
