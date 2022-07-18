import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main (String[] args){
        HashSet<Integer> myHashSet = new HashSet<>();

        myHashSet.add(1);
        myHashSet.add(21);
        myHashSet.add(11);

        System.out.println("Does myHashSet contain '1'? " + myHashSet.contains(1));
        System.out.println("Does myHashSet contain '11'? " + myHashSet.contains(11));

    }
}