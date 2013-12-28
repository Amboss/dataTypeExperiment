package dataTypeExperiment;

import java.util.*;

/**
 * Class
 */
public class DataTypeExperiment {

    public static ArrayListed arrayListed = new MyArrayList();

    public static LinkedListed linkedListed = new MyLinkedList();

    public static HashMapped hashMapped = new MyHashMap();

    public static void main(String[] args) {

        // ArrayList
        System.out.printf("\n%s", "ArrayList example");
        List<String> myArrayList = arrayListed.setList();
        arrayListed.printList(myArrayList);
        myArrayList.add("new value");
        arrayListed.printList(myArrayList);
        myArrayList.remove(5);
        arrayListed.printList(myArrayList);
        System.out.println("\nindex of \"new value\" is: " + myArrayList.indexOf("new value"));

        // LinkedList
        System.out.printf("\n%s", "LinkedList example");
        List<String> myLinkedList = linkedListed.setLinkedList();
        linkedListed.printList(myLinkedList);
        myLinkedList.add("new value");
        linkedListed.printList(myLinkedList);
        myLinkedList.remove(6);
        linkedListed.printList(myLinkedList);
        System.out.println("\nindex of \"new value\" is: " + myLinkedList.indexOf("new value"));

        // HashMap
        System.out.printf("\n%s", "HashMap example");
        Map<String, String> myHashMap = hashMapped.setHashMap();
        hashMapped.printHashMap(myHashMap);
        System.out.printf("\n%s", "Adding new element");
        myHashMap.put("newValue", "newValue");
        hashMapped.printHashMap(myHashMap);
        System.out.println("\nindex of \"new value\" is: " + myHashMap.containsKey("new value"));
    }
}
