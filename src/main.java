import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class main {
    public static void main (String[] args){
        HashSet<Integer> myHashSet = new HashSet<>();

        System.out.println("Before we add anything myHashSet size is " + myHashSet.size());

        myHashSet.add(1);
        myHashSet.add(21);
        myHashSet.add(11);

        System.out.println("Now myHashSet is " + myHashSet.size());
        myHashSet.clear();
        System.out.println("After clear myHashSet size is " + myHashSet.size());
        System.out.println("After clear myHashSet is empty: " + myHashSet.isEmpty());
    }
}