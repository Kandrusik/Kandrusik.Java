package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task3 {

    public static int[] myArray;

    public static int[] getArray() {
        int min = 9;
        int max = 99;

        System.out.print("Исходный массив: ");
        myArray = new int[13];

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
        System.out.print("Массив чисел, кратных 3: ");
        return listOfResults;
    }
}