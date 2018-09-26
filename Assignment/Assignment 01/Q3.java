import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Integer : ");
        int x = scanner.nextInt();

        System.out.println("Octal : " + Integer.toOctalString(x));
        System.out.println("Hex Decimal : " + Integer.toHexString(x));
        System.out.println("Binary : " + Integer.toBinaryString(x));
    }
}
