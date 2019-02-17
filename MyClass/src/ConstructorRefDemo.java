public class ConstructorRefDemo {
    public static void main(String[] args) {

        MyFunc myClassCons = MyClass::new;

        MyClass mc = myClassCons.func("Test");

        System.out.println("Stroka: " + mc.getStr());
    }
}
