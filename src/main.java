import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        HashSet<String> myHashSet = new HashSet<>();
        int num = in.nextInt();
        String line = l.nextLine();
        if (num < 100_000 && num > 0) {
            for (int j = 0; j <= num; j++) {
                myHashSet.add(line);
            }
            for (int i = 0; i <= num; i++) {
                System.out.println(myHashSet.size());
                System.out.println(myHashSet);
            }
        }
    }
}