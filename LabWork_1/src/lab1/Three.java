package lab1;

import java.util.Scanner;

import static java.lang.Math.*;

public class Three {
    public static void main(String[] args) {
        int m,n,k;
        Scanner a = new Scanner(System.in);
        System.out.print("Введите число m: ");
        m = a.nextInt();
        System.out.println();
        System.out.print("Введите число n: ");
        n = a.nextInt();
        System.out.println();
        if (m>n) {
            k = (int) pow(m - n, 2);
        } else k = (int) pow(n-m,2);
        System.out.println("Число k= " + k);
    }
}

