import java.awt.*;
import java.io.IOException;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

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
        }

         */
        /*int n;
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

         */

        Scanner in = new Scanner(System.in);
        Scanner l = new Scanner(System.in);
        List<String> arg = new ArrayList<>();
        List<List<String>> studentList = new ArrayList<>();

        System.out.println("Vvedi kol-vo studentov: ");
        int num = in.nextInt();
        if (num >= 2 && num <= 1000) {
            for (int j = 0; j < num; j++) {
                String student = l.nextLine();
                arg = Arrays.asList(student.split(" "));
                studentList.add(arg);
            }
            System.out.println(studentList.size());
            System.out.println(studentList);

            //System.out.println(studentList[0;1]);

            in.close();
            l.close();
        }

    }
}
