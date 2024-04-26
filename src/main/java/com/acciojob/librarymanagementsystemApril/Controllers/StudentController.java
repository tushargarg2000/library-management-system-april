package com.acciojob.librarymanagementsystemApril.Controllers;

import com.acciojob.librarymanagementsystemApril.Models.Student;
import com.acciojob.librarymanagementsystemApril.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("student")
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {

            String result = studentService.addStudent(student);
            return result;
    }

    @GetMapping("findAllStudents")
    public List<Student> findAllStudents(){

        List<Student> ansList = studentService.findAllStudents();
        return ansList;
    }


}
