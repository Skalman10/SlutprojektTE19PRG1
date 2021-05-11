import java.util.Scanner;

/**
 * Created 2021-04-27
 *
 * @author
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //Läser in input
        String s="";
        while (!s.equals("quit")) {
            s = in.next();
            if (s.equals("pq")) {
                pq(in);
            }
            if (s.equals("triangleA")) {
                triangleA(in);
            }
        }
    }

    private static void triangleA(Scanner in) {
        System.out.println("triangleA: b,h");
        long b = in.nextLong();
        long h = in.nextLong();
        System.out.println((b*h)/2);
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
