import java.io.IOException;
import java.util.*;

public class main {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        HashSet<String> myHashSet = new HashSet<>();
        int num = in.nextInt();
        if (num > 0 && num < 100000) {
            for (int j = 0; j < num; j++) {
                String line = l.nextLine();
                myHashSet.add(line);
            }
            for (int i = 0; i < num; i++){
                System.out.println(myHashSet.size());
            }
        }*/
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to store: ");
        n = sc.nextInt();

        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }
    }
}