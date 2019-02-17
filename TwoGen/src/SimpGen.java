public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<>(88,"Обобщения");

        tgObj.showTypes();

        int v = tgObj.getOb1();
        System.out.println("Value: " + v);
        String s = tgObj.getOb2();
        System.out.println("Value: " + s);
    }
}
