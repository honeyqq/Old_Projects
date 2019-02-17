import java.util.Scanner;
public class TicTacToe {
    public static final String POROZHNYA= "   ";
    public static final String KHRESTYK = " X ";
    public static final String NULIK = " O ";
    public static String aktivniyGravets;

    public static final int RYADKIV = 3, STOVPCHYKIV = 3;
    public static String[][] sitka = new String[RYADKIV][STOVPCHYKIV];
    public static int statusGry;
    public static final int STATUS_GRA_TRYVAE = 0, STATUS_NYCHYYA = 1, STATUS_PEREMOGA_X = 3, STATUS_PEREMOGA_O = 4;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        PochatyGry();
        do {
            OtrymatyVvedennyaGravtsya();
            ProanalizuvatySitku();
            VivestySitku();
            if (statusGry == STATUS_PEREMOGA_X){
                System.out.println("'X' переміг. Вітаємо!!!");
            } else if (statusGry == STATUS_PEREMOGA_O) {
                System.out.println("'O' переміг. Вітаємо!!!");
            } else if (statusGry == STATUS_NYCHYYA) {
                System.out.println("Нічия");
            }

            aktivniyGravets = (aktivniyGravets==KHRESTYK?NULIK:KHRESTYK);

        } while (statusGry == STATUS_GRA_TRYVAE);
    }
    public static void PochatyGry(){
        for (int i = 0; i < RYADKIV; i++) {
            for (int j = 0; j < STOVPCHYKIV; j++) {
                sitka[i][j]=POROZHNYA;
            }
        }
        aktivniyGravets = KHRESTYK;
        VivestySitku();
    }
    public static void OtrymatyVvedennyaGravtsya() {
        boolean vvedenyaDijsne = false;
        do {
            System.out.println("Гравець " + aktivniyGravets + " введіть рядок (1-3) і стовпчик (1-3) через пробіл");
            int ryad = in.nextInt() - 1;
            int stovp = in.nextInt() -1;
            if (ryad >= 0 && ryad < RYADKIV && stovp >= 0 && stovp < STOVPCHYKIV && sitka[ryad][stovp] == POROZHNYA) {
                sitka[ryad][stovp] = aktivniyGravets;
                vvedenyaDijsne =true;
            } else {
                System.out.println("Вибране розміщення рядка " + ryad + 1 + " , " + stovp + 1 +
                        ") не може бути виконане. Спробуйте ще раз..." );
            }
        } while (!vvedenyaDijsne);
    }
    public static void ProanalizuvatySitku() {
        String peremojets = ZnaytiPeremojtsa();
        if (peremojets.equals(KHRESTYK)) {
            statusGry = STATUS_PEREMOGA_X;
        } else if (peremojets.equals(NULIK)){
            statusGry = STATUS_PEREMOGA_O;
        } else if (ChyVsiKlitunkuZapovneni()){
            statusGry = STATUS_NYCHYYA;
        } else {
            statusGry = STATUS_GRA_TRYVAE;
        }
    }
    public static boolean ChyVsiKlitunkuZapovneni() {
        for (int i = 0; i < RYADKIV; i++) {
            for (int j = 0; j < STOVPCHYKIV; j++) {
                if (sitka[i][j] == POROZHNYA) {
                    return false;
                }
            }
        }
        return true;
    }
    public static String ZnaytiPeremojtsa() {

        //ryadki
        int iKilkistOdnakhovih;
        for (int i = 0; i < RYADKIV ; i++) {
            iKilkistOdnakhovih = 0;
            for (int j = 0; j < STOVPCHYKIV; j++) {
                if (sitka[i][0] != POROZHNYA && sitka[i][0] == sitka[i][j]) {
                    iKilkistOdnakhovih++;
                }
            }
            if (iKilkistOdnakhovih==3){
                return sitka[i][0];
            }
        }
        //sovpchiki
        for (int j = 0; j < STOVPCHYKIV; j++) {
            iKilkistOdnakhovih = 0;
            for (int i = 0; i < RYADKIV; i++) {
                if (sitka[0][j] != POROZHNYA && sitka[0][j] == sitka[i][j]) {
                    iKilkistOdnakhovih++;
                }
            }
                if (iKilkistOdnakhovih==3){
                    return sitka[0][j];
            }
        }
        //gorizontal
        if (sitka[0][0]!= POROZHNYA && sitka[0][0]==sitka[1][1] && sitka[0][0]==sitka[2][2]) {
            return sitka[0][0];
        }
        if (sitka[0][2]!= POROZHNYA && sitka[0][2]==sitka[1][1] && sitka[0][2]==sitka[2][0]) {
            return sitka[0][2];
        }
        return POROZHNYA;
    }

    public static void VivestySitku() {
        for (int i=0; i < RYADKIV; i++) {
            for (int j=0; j<STOVPCHYKIV; j++){
                System.out.print(sitka[i][j]);
                if (j!=STOVPCHYKIV-1){
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i!=RYADKIV-1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }
}
