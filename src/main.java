public class main {
    public static void main (String args[]) {
        cykl();
        int num;
        num = 100;
        System.out.println("Zmienna num: " + num);

        num = num * 2;

        System.out.print("Wartosc zmiennej num * 2 ") ;
        System.out.println(num);

    }
    public static void cykl(){
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 10;

        for (int x : nums) {
            System.out.println("Znaczenie ravno: " +x);
            sum += x;
        }
        System.out.println("Summa ravna: " + sum);
    }
}
