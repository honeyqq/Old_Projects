import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.*;

public class First {
    public static void main(String[] args) {
        Scanner q = new Scanner(System.in);
        double a,b,c,p,S;
        System.out.print("Введите сторону а: ");
        a = q.nextDouble();
        System.out.print("Введите сторону b: ");
        b = q.nextDouble();
        System.out.print("Введите сторону c: ");
        c = q.nextDouble();
        p = (a+b+c)/2;
        S = sqrt(p*(p-a)*(p-b)*(p-c));
        String formattedDouble = new DecimalFormat("#0.00").format(S);
        System.out.println("Площа треугольника S = " + formattedDouble);
    }
}
