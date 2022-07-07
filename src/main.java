import java.io.IOException;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class main {
    public static void main(String args[]) throws IOException {
        cykl();
        cykl2();
        cykl3();
        cykl4();
        doWhile();
        forTask();
        kirillica();
        taskIf();
        unlimited();


        int num;
        num = 100;
        System.out.println("Zmienna num: " + num);

        num = num * 2;

        System.out.print("Wartosc zmiennej num * 2 ");
        System.out.println(num);

    }
    public static void cykl() {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 10;

        for (int x : nums) {
            System.out.println("Znaczenie ravno: " + x);
            sum += x;
        }
        System.out.println("Summa ravna: " + sum);
    }
    public static void cykl2() {
        int x;

        for (x = 0; x < 10; x++)
            System.out.println("Znaczenie x: " + x);
    }
    public static void cykl3() {
        int n = 10;
        while (n > 0) {
            System.out.println("takt " + n);
            n--;
        }
    }
    public static void cykl4() {
        String firstName = "Miroslaw";
        String secondName = "Jewtuszenko";
        System.out.print("Ego zowut "+ firstName);
        System.out.print(" "+ secondName);
    }
    public static void doWhile()
            throws java.io.IOException {
        char choice;
        do {
            System.out.println("Sprawka po operatoru:");
            System.out.println("  1. if");
            System.out.println("  2. switch");
            System.out.println("  3. while");
            System.out.println("  4. do-while");
            System.out.println("  5. for\n");
            System.out.println("Wybieri punkt:");
            choice = (char) System.in.read();
        } while (choice < '1' || choice > '5');

        System.out.println("\n");

        switch (choice) {
            case '1':
                System.out.println("if:\n");
                System.out.println("if (uslovie) operator;");
                System.out.println("else operator");
                break;
            case '2':
                System.out.println("switch:\n");
                System.out.println("switch (wyrazenie) {");
                System.out.println(" case konstanta:");
                System.out.println(" posledowatelnost operatorow");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("while:\n");
                System.out.println("while (uslovie) operator;");
                break;
            case '4':
                System.out.println("do-while:\n");
                System.out.println("do {");
                System.out.println(" operator;");
                System.out.println("} while (uslovie);");
                break;
        }
    }
        public static void forTask() {
            int num;
            boolean isPrime;

            num = 19;

            if (num < 2) {
                isPrime = false;
            } else {
                isPrime = true;
            }

            for(int i = 2; i <= num/i; i++) {
                if((num % i) == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println("Prostoje chislo");
            else System.out.println("Ne prostoje chislo");
    }
    public static void kirillica() throws IOException {
        System.setOut(new PrintStream(System.out, true, "cp866"));

        System.out.println("Привет кириллица");
        System.out.write("Привет кириллица\n".getBytes("cp866"));
    }
    public static void taskIf() {
        int num = 999;
        int bob = 800;
        if (num > bob) System.out.println("num > bob");
    }
    public static void unlimited() {
        for ( ; ; );
    }
}