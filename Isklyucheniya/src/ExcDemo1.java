public class ExcDemo1 {
    public static void main(String[] args) {
        int[] nums = new int[4];

        try {
            System.out.println("До генерации исключения");

            nums[0] = 10;

            System.out.println("Этой строки нету");
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Выход за границы массива!");
        }

        System.out.println("После catch");
    }
}
