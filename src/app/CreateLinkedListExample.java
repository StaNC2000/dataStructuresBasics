package app;

import java.util.LinkedList;
import java.util.ArrayList;

public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("A");
        myLinkedList.add("B");
        myLinkedList.addLast("C");
        myLinkedList.addFirst("D");

        System.out.println(myLinkedList);

        ArrayList<String> lastNames = new ArrayList<>();
        lastNames.add("Gates");
        lastNames.add("Jobs");
        
        myLinkedList.addAll(lastNames);

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.size());

        myLinkedList.remove("Jobs");
        System.out.println(myLinkedList);

        boolean status = myLinkedList.contains("Gates");

        if(status) {
            System.out.println(("myLinkedList have jobs"));
        }
        else{
            System.out.println("myLinkedList have no jobs");
        }

        String firstElement = myLinkedList.getFirst();
        System.out.println(firstElement);
        String lastElement = myLinkedList.getLast();
        System.out.println(lastElement);

        // Deleting all elements

        // myLinkedList.clear();

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.indexOf("Gates"));

    }
}