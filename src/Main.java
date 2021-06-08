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
        System.out.println("pq \ntriangleA");
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
        double b = in.nextDouble();
        double h = in.nextDouble();
        System.out.println((b*h)/2);
    }

    private static void pq(Scanner in) {
        System.out.println("pq: p,q");
        double p = in.nextDouble();
        double q = in.nextDouble();
        double sqrt =  Math.sqrt(Math.pow(-p / 2, 2) - q);
        double x1 = ((-p/2) + sqrt);
        double x2 = ((-p/2) - sqrt);
        System.out.println("x1 = " + x1 + "\nx2 = " + x2);
    }
}
