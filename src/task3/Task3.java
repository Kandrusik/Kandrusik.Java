package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static int[] myArray;
    static Scanner in = new Scanner(System.in);

    public static int[] getArray() {
        int min = 9;
        int max = 99;

        System.out.print("Enter the size of the array: ");
        myArray = new int[in.nextInt()];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.floor(Math.random() * (max - min + 1) + min);
        }

        System.out.println(Arrays.toString(myArray));
        return myArray;
    }

    public static ArrayList<Integer> getNumbersMultipliesOfThree() {
        ArrayList<Integer> listOfResults = new ArrayList<>();
        for (int i : getArray()) {
            if (i % 3 == 0) {
                listOfResults.add(i);
            }
        }
        System.out.println("Array of numbers that are multiples of 3:");
        return listOfResults;
    }
}