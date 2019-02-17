public class BoundsDemo {
    public static void main(String[] args) {

        NumericFns<Integer> iOb = new NumericFns<>(6);

//        System.out.println("Обратная величина iOb - " + iOb.reciprocal());
////        System.out.println("Дробная часть iOb - " + iOb.fraction());
////
////        System.out.println();

        NumericFns<Double> dOb = new NumericFns<>(-6.0);
        NumericFns<Long> lOb = new NumericFns<>(5l);

        System.out.println("Cpaвнeниe iOb и dOb");
        if (iOb.absEqual (dOb)) System.out.println("Aбcoлютныe значения совпадают.");
        else
        System.out.println("Aбcoлютныe значения отличаются.");

        System.out.println();

        System.out.println("Cpaвнeниe iOb и lOb.");
        if(iOb.absEqual(lOb)) System.out.println("Aбcoлютныe значения совпадают.");
        else
        System.out.println("Aбcoлютныe значения отличаются.");

//        System.out.println("Обратная величина dOb - " + dOb.reciprocal());
//        System.out.println("Дробная часть dOb - " + dOb.fraction());
    }
}
