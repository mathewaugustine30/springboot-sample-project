package com.mathew.example.demoexampleweb.dao;

import com.mathew.example.demoexampleweb.model.Student;

import java.util.List;

public interface StudentDao {

    int addEmployee(Student student);

    List<Student> getStudents();

    Student getStudent(int id);

    int deleteStudent(int id);

    int updateStudent(int id,Student student);


}
