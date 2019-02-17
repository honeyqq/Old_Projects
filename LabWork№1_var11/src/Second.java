import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        double R1,R2,Paralel,Poslidovn;
        Scanner q = new Scanner(System.in);
        System.out.print("Введите R1: ");
        R1 = q.nextDouble();
        System.out.print("Введите R1: ");
        R2 = q.nextDouble();
        Paralel = 1/R1 + 1/R2;
        Poslidovn = R1+R2;
        if (Paralel < 0 || Poslidovn < 0) {
            System.out.println("Сопротивление меньше нуля");}
            else {
            System.out.println("Последовательное сопротивление: " + Poslidovn);

        if (R2 == 0 || R1 == 0){
            System.out.println("При паралельном подключении сопротивление равно нулю.");
        } else {
            System.out.println("Паралельное сопротивление: " + Paralel);
        }
        }

    }
}

