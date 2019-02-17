public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb;

        iOb = new Gen<>(88);

        iOb.showType();

        int v = iOb.getOb();
        System.out.println("Значение: " + v);

        System.out.println();

        Gen<String> strOb = new Gen<>("Тестирование обобщений");

        strOb.showType();

        String str = strOb.getOb();
        System.out.println("Значние: " + str);

        System.out.println();

        Gen<Character> ch = new Gen<>('A');

        ch.showType();

        Character c = ch.getOb();
        System.out.println("Значение: " + c);
    }
}
