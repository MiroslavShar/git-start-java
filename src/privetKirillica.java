import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class privetKirillica {
    public static void main (String args[]) throws IOException {
        System.setOut(new PrintStream(System.out, true, "cp866"));

        System.out.println("Привет кириллица");
        System.out.write("Привет кириллица\n".getBytes("cp866"));
    }
}
