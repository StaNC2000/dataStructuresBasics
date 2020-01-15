package app;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        int [] myIntArray = new int[10];

        System.out.println(myIntArray);
        System.out.println(Arrays.toString(myIntArray));

        int [] myIntArray2 = {1, 2, 3, 4, 5};

        int [] myIntArray3 = new int[10];
        for (int i = 0; i < myIntArray3.length; i++){
            myIntArray3[i] = i;
        }
        System.out.println(Arrays.toString(myIntArray3));
        System.out.println("-----------------------------");
        
        for (int i = 0; i < myIntArray3.length; i++){
            System.out.println("element: " + myIntArray3[i]);
        }
        System.out.println("-----------------------------");
        
        for (int i = 0; i < myIntArray3.length; i++){
            System.out.print("element: " + myIntArray3[i]);
        }

        System.out.println(getAverage(myIntArray2));
        System.out.println("-----------------------------");

        int [] arrayToPrint = getIntegers(4);

        System.out.println(Arrays.toString(arrayToPrint));
    }

    public static double getAverage(int[] arrayToGetAverage){
        int sumTotal = 0;

        for (int i = 0; i < arrayToGetAverage.length; i++){
            sumTotal = sumTotal + arrayToGetAverage[i];
            // sumTotal = sumTotal + arrayToGetAverage[i];
        }

        double average = sumTotal / arrayToGetAverage.length;

        return average;
    }

    public static int[] getIntegers(int sizeArray) {
        System.out.println("Enter " + sizeArray + " Integer value \n");
        int [] arrayFromInputs = new int[sizeArray];

        for (int i =0; i < arrayFromInputs.length; i++){
            arrayFromInputs[i] = scanner.nextInt();
        }

        return arrayFromInputs;
    }
}