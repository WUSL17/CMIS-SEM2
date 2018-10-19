import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input diameter : ");
        double d = scanner.nextDouble();

        if (10.7 > d && d > 9.95){
            System.out.println("Accept");
        }else {
            System.out.println("Reject");
        }
    }
}
