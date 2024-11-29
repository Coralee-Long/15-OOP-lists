package com.cora;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // There are Difference List Types:
        // - LinkedList
        // - ArrayList ...etc

        // Use the "List" interface in case we decide to change the List type.
        // Example: List<String> names = new LinkedList<>();
        // Not possible: ArrayList<String> = new LinkedList<>();

        List<String> names = new ArrayList<>();

        // adding names
        names.add("Marten");
        names.add("Florian");
        names.add("Max");

        // removing names
        names.remove("Marten");

        // adding names at a specific position
        names.add(1, "Robert");

        // Check size of array
        // You can't use .length in Lists, you use the built-in .size() method
        int arraySize = names.size();

        // Lists don't take Primitive data types like;
        // List<int> numbers = new ArrayList<>();
        // List<boolean> isOn = new ArrayList<>();

        // But you can use the Class wrapper like this:
        // List<Integer> numbers = new ArrayList<>();
        // List<Boolean> isOn = new ArrayList<>();

        // Get
        String firstElement = names.get(0);
        String lastElement = names.get(arraySize - 1);


        System.out.println("Names: " + names);
        System.out.println("Array Length: " + arraySize);
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        // For Loop (Old way):
        for(int i = 0; i < arraySize; i++){
            System.out.println(names.get(i));
        }

        // For Each Method (New way):
        for(String name : names) {
            System.out.println(name);
        }

        Book book1 = new Book("My first Chessbook", "Martin K");
        Book book2 = new Book("My second Chessbook", "Florian K");

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);

        for(Book book: books) {
            System.out.println(book);
        }


        /// ------------------ EXERCISE:

        Course course1 = new Course("Science", "Mr. Matthews", 45);
        Course course2 = new Course("Mathematics", "Ms. West", 20);
        Course course3 = new Course("Geography", "Mr. Mox", 2);

        Student student1 = new Student(1, "Jane", "Doe" );
        Student student2 = new Student(2, "Bob", "Smith");
        Student student3 = new Student(3, "John", "Smith");
        Student student4 = new Student(4, "Jane", "Smith");
        Student student5 = new Student(5, "Martin", "Jackson");

        // Create List of students
        List<Student> students = new ArrayList<>();

        // Adding students (Student object) to student list
        students.add(student1);
        students.add(student2);
        students.add(student3);


        // Create new School Instance
        School school = new School();

        // Adding Students to School
        school.addStudent(student1); // from the new method above
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);

        // removing a student
        school.removeStudent(student2);

        // find student by id (returns student object)
        System.out.println(school.getStudentById(3));

        System.out.println(school);

        student2.addCourse(course1);
        student4.addCourse(course3);
        student5.addCourse(course2);

        System.out.println(school);



    }
}