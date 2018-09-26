import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double s, u, t, a;

        System.out.print("Input u = ");
        u = scanner.nextDouble();

        System.out.print("Input t = ");
        t = scanner.nextDouble();

        System.out.print("Input a = ");
        a = scanner.nextDouble();

        s = u*t + 0.5 * a * t;

        System.out.println("S = " + s);
    }
}
