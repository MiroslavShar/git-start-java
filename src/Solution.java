public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if ((n >= 1) & (n <= 100) & ((n % 2) == 0)) {
            if ((n >= 6) & (n <= 20)) {
                System.out.println("Weird");
            }
            if ((n >= 2) & (n <= 5) | (n > 20)) {
                System.out.println("Not Weird");
            }
        }
        else {
            System.out.println ("Weird");
        }
    }
}
