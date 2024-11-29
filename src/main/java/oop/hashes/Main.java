package oop.hashes;

import java.util.*;

public class Main {
    public static void main(String[] args) {



        String apple = "granny smith apple";
        String orange = "blood orange";
        String banana = "banana";

        // Use Interface "Set" instead of "HashSet" for initial declaration...
        // Similar to using "List" instead of "ArrayList":
        // eg: List shoppingList = new ArrayList<>();

        // ----------------- HASH SET ------------------//
        Set<String> shoppingList = new HashSet<>();

        shoppingList.add(apple);
        shoppingList.add(orange);
        shoppingList.add(banana);

        for(String item : shoppingList) {
            System.out.println("item:" + item);
        }

        // variable name apple
        System.out.println(shoppingList.contains(apple)); // true
        // String value
        System.out.println(shoppingList.contains("granny smith apple"));  // true
        // Partial String value
        System.out.println(shoppingList.contains("apple")); // false


        // ----------------- HASH MAP ------------------//



        // First String is key, and second is value
        // < key, value>
        Map<String, String>detailedShoppingList = new HashMap<>();

        String bread = "";
        String milk = "";

       detailedShoppingList.put(bread, "rye");
       detailedShoppingList.put(milk, "2%");


        System.out.println("--------------------------------");
        System.out.println("--------------------------------");

        ShoppingItem kiwi = new ShoppingItem("Golden Kiwi", 2);
        ShoppingItem toothpaste = new ShoppingItem("Colgate Whitening", 3);
        ShoppingItem toothpaste2 = new ShoppingItem("Colgate Whitening", 3);

        Set<ShoppingItem> newList = new HashSet<>();

        newList.add(kiwi);
        newList.add(toothpaste);
        newList.add(toothpaste2); // this will not add because @overrides equals & hashcode check for this

        for(ShoppingItem item : newList) {
            System.out.println("item:" + item);
        }

        // NOTE: Java has built in method to generate unique
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid); // eca45cf7-f06e-4fa0-a001-9a72d0a1e877






    }
}
