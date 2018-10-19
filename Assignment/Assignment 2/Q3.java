import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int year;
        double deposit, rate = 1, total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input deposit : ");
        deposit = scanner.nextDouble();

        System.out.print("Input year : ");
        year = scanner.nextInt();

        if (deposit >= 5000){
            rate = 8.5;
        }else if (deposit >= 1000){
            if (year > 1){
                rate = 7;
            }
        }else {
            if (year > 1)
                rate = 5;
        }

        total = deposit + rate * year;

        System.out.println("Total : " + total);
    }
}
