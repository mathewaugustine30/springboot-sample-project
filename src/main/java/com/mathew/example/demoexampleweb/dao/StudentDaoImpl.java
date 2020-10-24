package com.mathew.example.demoexampleweb.dao;

import com.mathew.example.demoexampleweb.model.Student;
import com.mathew.example.demoexampleweb.repositiory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public int addEmployee(Student student) {
        Student save = studentRepository.save(student);
        return 1;
    }

    @Override
    public int updateStudent(int id, Student student) {
        Optional<Student> byId = studentRepository.findById(student.getId());
        studentRepository.save(student);
        if(byId.isPresent()){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public int deleteStudent(int id) {
        Optional<Student> byId = studentRepository.findById(id);
        if (byId.isPresent()) {
            studentRepository.deleteById(id);
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Student getStudent(int id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}
