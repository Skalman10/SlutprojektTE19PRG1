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
        if (s.equals("pq")) {
            pq(in);
        }
    }

    private static void pq(Scanner in) {
        System.out.println("pq: p,q");
        long p = in.nextLong();
        long q = in.nextLong();
        long sqrt = (long) Math.sqrt(Math.pow(-p / 2, 2) - q);
        long x1 = ((-p/2) + sqrt);
        long x2 = ((-p/2) - sqrt);
        System.out.println("x1 = " + x1 + "\nx2 = " + x2);
    }
}
