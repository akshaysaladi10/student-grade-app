package com.example.java_student_grade_app.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("/")
    public String home() {

        return """
                =========================
                   STUDENT GRADE SYSTEM
                =========================

                Student Name : Rahul
                Java         : 85
                DBMS         : 78
                CN           : 82
                -------------------------
                Total        : 245
                Average      : 81.66666666666667
                Grade        : A
                Result       : PASS
                """;
    }
}