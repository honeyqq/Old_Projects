import java.io.IOException;

public class ThrowsDemo {
    public static char promt(String str) throws IOException {

        System.out.print(str + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char ch;

        try {
            ch = promt("Нажмите любую клавишу");
        }
        catch (java.io.IOException exc) {
            System.out.println("Произошло исключение ввода-вывода");
            ch = 'X';
        }

        System.out.println("Вы нажали клавишу: " + ch);
    }
}
