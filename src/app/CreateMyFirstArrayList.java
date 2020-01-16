package app;

import java.util.ArrayList;

public class CreateMyFirstArrayList{
    public static void main(String[] args){
        
        // Create ArrayList
        
        ArrayList<String> animals = new ArrayList<>();

        // Add

        animals.add("Lion");

        System.out.println(animals);

        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println(animals);

        animals.add(2, "Bird");

        System.out.println(animals);

        ArrayList<Integer> firstArrayWithNumbers = new ArrayList<>();
        firstArrayWithNumbers.add(1);
        firstArrayWithNumbers.add(123456);


        ArrayList<Integer> secondArrayWithList = new ArrayList<>(firstArrayWithNumbers);

        System.out.println("First Array: " + firstArrayWithNumbers);
        System.out.println("Second Array: " + secondArrayWithList);

        secondArrayWithList.add(3);

        System.out.println("First Array: " + firstArrayWithNumbers);
        System.out.println("Second Array: " + secondArrayWithList);

        firstArrayWithNumbers.remove(0);
        System.out.println("Remove Item");
        System.out.println("First Array: " + firstArrayWithNumbers);
        System.out.println("Second Array: " + secondArrayWithList);

        // Iterating

        for(int i = 0; i < secondArrayWithList.size(); i++){
            System.out.print(secondArrayWithList.get(i) + " ");
        }


        // Third ArrayList

        ArrayList <String> names = new ArrayList<>();
        names.add("John");
        names.add("Stevie");
        names.add("Bill");

        // Finding a index of element
        System.out.println();
        System.out.println("Finding index for John: " + names.indexOf("John"));

        // Convert ArrayList to Array

        String[] namesArray = names.toArray(new String[names.size()]);
        
        // LinkedList

        
    }
}