package task2;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {

    public static String getName() {
        System.out.print("Enter the name: ");
        Scanner in = new Scanner(System.in);
        if (Objects.equals(in.next(), "Вячеслав")) {
            return "Привет, Вячеслав";
        } else {
            System.out.println("Нет такого имени");
        }
        return getName();
    }

    public static void main(String[] args) {
        System.out.println(getName());
    }
}