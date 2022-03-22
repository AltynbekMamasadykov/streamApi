package com.company.classes;

import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int examGrade;

    public Student(int id, String name, int examGrade) {
        this.id = id;
        this.name = name;
        this.examGrade = examGrade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExamGrade() {
        return examGrade;
    }

    public void setExamGrade(int examGrade) {
        this.examGrade = examGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && examGrade == student.examGrade && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, examGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", examGrade=" + examGrade +
                '}';
    }
}
