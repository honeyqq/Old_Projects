package lab1;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        int a = q.nextInt();
        if (a <= 0 || a > 7) {
            System.out.println("Данного дня недели не существует.");
        } else {
            switch (a) {
                case 1:
                    System.out.println("Понедельник");
                    break;
                case 2:
                    System.out.println("Вторник");
                    break;
                case 3:
                    System.out.println("Среда");
                    break;
                case 4:
                    System.out.println("Четверг");
                    break;
                case 5:
                    System.out.println("Пятница");
                    break;
                case 6:
                    System.out.println("Суббота");
                    break;
                case 7:
                    System.out.println("Воскресенье");
                    break;
            }
        }
    }
}
