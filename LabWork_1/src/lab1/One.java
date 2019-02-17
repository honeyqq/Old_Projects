package lab1;

import java.util.Scanner;
import static java.lang.Math.pow;

public class One {
    public static void main(String[] args) {
        int h;
        int R;
        double V;
        Scanner q = new Scanner(System.in);
        System.out.print("Введите высоту: ");
        h = q.nextInt();
        System.out.print("Введите радиус: ");
        R = q.nextInt();
        V = h * (3.14*pow(R,2));
        System.out.println("Объем цилиндра: " + V);
    }
}
