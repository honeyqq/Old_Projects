import java.util.Scanner;
import static java.lang.Math.sin;

public class Task1 {
    public static void main(String[] args) {
        int a,b,c;
        double S,d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сторону паралелограмма a: ");
        a = scan.nextInt();
        System.out.println("Введите сторону паралелограмма b: ");
        b = scan.nextInt();
        System.out.println("Введите угол между a и b");
        c = scan.nextInt();
        d = c * 0.0174533;
        S = a * b * sin(d);
        String formattedDouble = String.format("%.2f", S);
        System.out.println("Площа паралелограмма равна: " + formattedDouble);
    }
}
