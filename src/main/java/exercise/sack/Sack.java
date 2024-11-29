package exercise.sack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// GOAL: Recreate the predefined methods of the ArrayList class
// get()
// add()
// size()
// removeLast()
// removeByIndex()

public class Sack {

    // 0. Declare my array of Items and the array size/length:
    private Item[] items;
    private int size;

    // 1. Constructor: Create an array of Item instances (objects)
    public Sack() {
        items = new Item[10]; // Initial capacity of 10 Items for now
        size = 0;
    }

    // 2. Recreate .size() Method
    public int fakeSize() {
        // System.out.println("items.fakeSize() returns: " + size);
        return size;
    }

        // PRINT RESULT SO FAR:
            // Sack: {
            // items = [null, null, null, null, null, null, null, null, null, null]
            // size = 10
            // }

    // 3. Recreate .get() Method
    public Item fakeGet(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        // System.out.println("items.fakeGet() returns: " + items[index]);
        return items[index];
    }

    public void resizeArray(int newSize) {
        items = Arrays.copyOf(items, newSize);
        System.out.println("Array is full, doubling size to: " + items.length);
    }

    // 4. Recreate .add() Method
    // Add item at the end
    public void fakeAdd(Item item) {
        if (size == items.length) {
            resizeArray(items.length * 2);
        }
        items[size] = item;
        size++;
        System.out.println("Item added at the end: " + item);
    }

    // Add item at a specific index
    public void fakeAdd(int index, Item item) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds for size " + size);
        }
        if (size == items.length) {
            resizeArray(items.length * 2);
        }
        for (int i = size; i > index; i--) {
            items[i] = items[i - 1];
        }
        items[index] = item;
        size++;
        System.out.println("Item inserted at index " + index + ": " + item);
    }


    @Override
    public String toString() {
        return "Sack: {" + "\n" +
                "items = " + Arrays.toString(items) + "\n" +
                "size = " + size + "\n" +
                '}';
    }
};


