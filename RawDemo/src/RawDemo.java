public class RawDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<> (88);
        Gen<String> strOb = new Gen<> ("Testing");
        Gen raw = new Gen (99.6);
        double d = (Double) raw.getob();

        System.out.println("Value: " + d);
    }
}
