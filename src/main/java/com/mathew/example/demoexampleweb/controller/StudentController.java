package com.mathew.example.demoexampleweb.controller;

import com.mathew.example.demoexampleweb.model.Student;
import com.mathew.example.demoexampleweb.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping(value = "api/student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public int addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable("id") int id) {
        return studentService.getStudent(id);
    }

    @DeleteMapping(path = "{id}")
    public int deleteStudent(@PathVariable("id") int id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping(path = "{id}")
    public int updateStudent(@PathVariable("id") int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
}
