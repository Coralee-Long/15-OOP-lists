package com.cora;

import java.util.ArrayList;
import java.util.List;

public class School {
    List<Student> students = new ArrayList<>();

//    public School(ArrayList students) {
//        this.students = students;
//    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
        System.out.println("Student removed: " + student);
    }



    public Student getStudentById(int id) {
        for (Student student : students) {
            if(student.getStudentId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("this student does not exist");
    };

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students + "\n" +
                '}';
    }
}
