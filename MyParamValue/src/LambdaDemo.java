public class LambdaDemo {
    public static void main(String[] args) {
        MyValue myval;
        myval = () -> 98.6;

        System.out.println("Постоянное значение: " + myval.getValue());

        MyParamValue myPval = (n) -> 1.0/n;
        System.out.println("Обратная величина 4 равна: " + myPval.getValue(4.0));
        System.out.println("Обратная величина 10 равна: " + myPval.getValue(10.0));
    }
}
