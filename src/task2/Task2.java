package task2;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {

    public static final String NAME = "Вячеслав";

    public static String getName() {
        System.out.print("Введите имя: ");
        Scanner in = new Scanner(System.in);
        if (Objects.equals(in.next(), NAME)) {
            return "Привет, Вячеслав";
        } else {
            System.out.println("Нет такого имени");
        }
        return getName();
    }
}