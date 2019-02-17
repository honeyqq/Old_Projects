import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a,b,Result;
        int c;
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите стоимость минуты разговора(грн): ");
        a = scan.nextDouble();

        System.out.println("Введите время разговора(мин): ");
        b = scan.nextDouble();

        System.out.println("Введите день недели(1-7): ");
        c = scan.nextInt();

        switch (c) {
            case 1:
                Result = a * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 2:
                Result = a * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 3:
                Result = a * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 4:
                Result = a * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 5:
                Result = a * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 6:
                Result = (a - (a*0.2)) * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
            case 7:
                Result = (a - (a*0.2)) * b;
                System.out.println("Стоимость: " + Result + " грн");
                break;
        }
    }
}
