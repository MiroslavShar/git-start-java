import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main (String[] args){
      List<String> list = new ArrayList<String>();
      list.add("One");
      list.add("Three");
      list.add("four");

      list.add(1, "two");
      for(String s: list){
          System.out.println(s);
      }
      System.out.println("-----");
      list.remove(2);

      for(String s: list) {
          System.out.println(s);
      }
    }
}