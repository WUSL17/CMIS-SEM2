import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        int total = 0, num, avg;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input Number : ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            total+=i;
        }

        avg = total / num;

        System.out.println("Average = " + avg);
    }
}
