package org.example.springboot;

import org.example.springboot.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final List<Student> students = List.of(
            new Student(1, "Mancoba", "Nyalungu",
                    "ms101@gmail.com", "Computer Science"),

            new Student(2, "Ditebogo", "Mashego",
                    "didih@gmail.com", "Information Technology"),

            new Student(3, "Moe", "Brown",
                    "mbrown@gmail.com", "Software Engineering")
    );

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable int id) {

        for (Student student : students) {
            if (student.id == id) {
                return student;
            }
        }

        return null;
    }


}
