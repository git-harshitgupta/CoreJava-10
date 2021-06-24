package com.app.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    public static SimpleDateFormat sdf;
    static{
        sdf=new SimpleDateFormat("dd-MM-yyyy");
    }
    private String prn;
    private String name;
    private String email;
    private String password;
    private Course course;
    private Date dateOfBirth;
    private String GPA;

    public Student(String prn) {
        this.prn = prn;
    }

    public Student(String prn, String name, String email, String password, Course course, Date dateOfBirth, String GPA) {
        this.prn = prn;
        this.name = name;
        this.email = email;
        this.password = password;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "prn='" + prn + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", course=" + course +
                ", dateOfBirth=" + sdf.format(dateOfBirth) +
                ", GPA='" + GPA + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Student)
            return prn.equals(((Student)obj).prn);
        return false;
    }

    public String getEmail() {
        return email;
    }

    public String getPrn() {
        return prn;
    }

    public Student(String name, Course course, Date dateOfBirth, String GPA) {
        this.name = name;
        this.course = course;
        this.dateOfBirth = dateOfBirth;
        this.GPA = GPA;
    }
}
