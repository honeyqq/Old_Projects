public class Main {
    public static void main(String[] args) {
        MyValue myVal = () -> 98.6;
        System.out.println("Value: " + myVal.getvalue());
    }
}
