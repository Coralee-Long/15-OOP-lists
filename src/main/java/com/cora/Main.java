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
        names.remove("Martin");

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
    }
}