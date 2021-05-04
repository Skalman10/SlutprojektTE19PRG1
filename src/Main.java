import java.util.Scanner;

/**
 * Created 2021-04-27
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Läser in input
        String s = in.next();
        int a = in.nextInt();
        int b = in.nextInt();
        if (s.equals("add")) {
            add(a,b);
        }
    }
    private static void add(int a,int b) {
        System.out.println(a+b);
    }
}
