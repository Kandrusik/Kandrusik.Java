package task1;

import java.util.Scanner;

public class Task1 {

    public static void getNumber() {
        System.out.print("Enter number: ");
        Scanner in = new Scanner(System.in);
        if (in.nextInt() > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("The number is invalid, please try again");
            getNumber();
        }
    }

    public static void main(String[] args) {
        getNumber();
    }
}