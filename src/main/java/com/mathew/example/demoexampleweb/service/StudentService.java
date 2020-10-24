package com.mathew.example.demoexampleweb.service;

import com.mathew.example.demoexampleweb.dao.StudentDao;
import com.mathew.example.demoexampleweb.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public int addStudent(Student student){
        return studentDao.addEmployee(student);
    }

    public List<Student> getStudents(){
        return studentDao.getStudents();
    }

    public Student getStudent(int id){
        return studentDao.getStudent(id);
    }

    public int deleteStudent(int id) {
        return studentDao.deleteStudent(id);
    }

    public int updateStudent(int id, Student student) {
        return studentDao.updateStudent(id, student);
    }


}
