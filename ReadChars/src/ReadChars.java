import java.io.*;

public class ReadChars {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите символы; окончание ввода - символ точки");

        do {
            c = (char) br.read();
        } while (c != '.');
    }
}
