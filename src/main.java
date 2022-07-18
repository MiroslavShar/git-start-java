import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main (String[] args){
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(3);

        //We add 1 one more time
        myHashSet.add(1);

        for (int i : myHashSet){
            System.out.println(i);
        }
    }
}