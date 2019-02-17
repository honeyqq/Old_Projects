import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String exit = "no";
        int a ,b ,sum;
        while(!exit.equals("yes")){
            a = reader.nextInt();
            b = reader.nextInt();
            sum = a + b;
            System.out.println(sum);
            System.out.println("Exit: yes/no");
            exit = reader.next();
        }
    }
}
