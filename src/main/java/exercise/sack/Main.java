package exercise.sack;

public class Main {
    public static void main(String[] args) {

        // Create Sack
        Sack mySack = new Sack();

        // Create Items
        Item item1 = new Item(1,"Laptop", 3);
        Item item2 = new Item(2,"Apple", 0.2);
        Item item3 = new Item(3,"Water Bottle", 1);

        // Add an Item to mySack
        mySack.fakeAdd(item1);
        mySack.fakeAdd(item2);
        mySack.fakeAdd(2, item3);

        System.out.println("Get item from Sack using index: " + mySack.fakeGet(1)); // array index as arg


        System.out.println("Sack Capacity is: " + mySack.fakeSize());


        System.out.println("MySack: " + mySack);
    }
}
