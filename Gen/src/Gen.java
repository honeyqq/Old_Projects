public class Gen<T> {
    T ob;

    Gen (T o) {
        ob = o;
    }

    T getOb(){
        return ob;
    }

    void showType() {
        System.out.println("Тип Т - это " + ob.getClass().getName());
    }
}
