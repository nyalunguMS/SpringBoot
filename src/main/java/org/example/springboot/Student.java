package org.example.springboot;

public class Student {
    public int id;
    public String firstName;
    public String lastName;
    public String email;
    public String course;

    public Student(int id, String firstName, String lastName, String email, String course) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.course = course;
    }
}
