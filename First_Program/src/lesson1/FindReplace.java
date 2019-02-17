package lesson1;

public class FindReplace {
    public static void main(String[] args) {
        int[] myA;
        int[] myS = new int[100];
        int[] mm = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Апрель содержит " + mm[3] + "дней");
        for (int i = 0; i < mm.length; i++) {
            if (mm[i] < 31){
                mm[i] = 0;
            }
            myS[i] = mm[i];
        }
        myA = mm;
    }
}
