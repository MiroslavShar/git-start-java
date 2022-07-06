public class forEach {
    public static void main (String args []) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 10;

        for (int x : nums) {
    System.out.println("Znaczenie ravno: " +x);
    sum += x;
        }
        System.out.println("Summa ravna: " + sum);
    }
}
