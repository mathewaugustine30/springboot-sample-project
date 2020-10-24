package com.mathew.example.demoexampleweb.dao;

import com.mathew.example.demoexampleweb.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class StudentDaoImpl implements StudentDao {

    private List<Student> students = new ArrayList<>();

    @Override
    public int addEmployee(Student student) {
        students.add(student);
        return 1;
    }

    @Override
    public int updateStudent(int id, Student student) {
        if (students.removeIf(k -> k.getId() == id)) {
            students.add(student);
            return 1;
        } else {
            students.add(student);
            return 0;

        }

    }

    @Override
    public int deleteStudent(int id) {
        return students.removeIf(k -> k.getId() == id) ? 1 : 0;
    }

    @Override
    public Student getStudent(int id) {
        return students.stream().filter(k -> k.getId() == id).findAny().orElse(null);
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }
}
