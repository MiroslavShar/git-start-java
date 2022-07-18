import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        HashSet<String> myHashSet = new HashSet<>();
        int num = in.nextInt();
        if (num < 100000 && num > 0) {
            for (int j = 0; j < num; j++) {
                String line = l.nextLine();
                myHashSet.add(line);
            }
            for (int i = 0; i < num; i++){
                System.out.println(myHashSet.size());
            }
        }
    }
}