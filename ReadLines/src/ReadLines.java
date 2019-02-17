import java.io.*;

public class ReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Ввведите текстовые строки");
        System.out.println("Признак конца ввода - строка 'stop' ");

        do {
            str = br.readLine();
        } while (!str.equals("stop"));
    }
}
