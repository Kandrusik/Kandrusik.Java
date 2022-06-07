package task1;

import java.util.Scanner;

public class Task1 {

    public static void getNumber() {
        System.out.print("Введите номер: ");
        Scanner in = new Scanner(System.in);
        try {
            if (in.nextFloat() > 7) {
                System.out.println("Привет");
            } else {
                System.out.println("Номер некорректный, повторите еще раз");
                getNumber();
            }
        } catch (Exception o) {
            System.out.println("Вы ввели не номер");
            getNumber();
        }
    }
}