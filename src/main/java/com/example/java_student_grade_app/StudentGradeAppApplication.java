package com.example.java_student_grade_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentGradeAppApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentGradeAppApplication.class, args);
    }

    @Override
    public void run(String... args) {

        String name = "Rahul";
        int java = 85;
        int dbms = 78;
        int cn = 82;

        int total = java + dbms + cn;
        double average = total / 3.0;

        System.out.println("===========================");
        System.out.println("     STUDENT GRADE SYSTEM");
        System.out.println("===========================");
        System.out.println("Student Name : " + name);
        System.out.println("Java         : " + java);
        System.out.println("DBMS         : " + dbms);
        System.out.println("CN           : " + cn);
        System.out.println("---------------------------");
        System.out.println("Total        : " + total);
        System.out.println("Average      : " + average);
        System.out.println("Grade        : A");
        System.out.println("Result       : PASS");
    }
}