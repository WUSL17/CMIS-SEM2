import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input quiz marks : ");
        double quiz = scanner.nextDouble();

        System.out.print("Input mid-term marks : ");
        double mid = scanner.nextDouble();

        System.out.print("Input final marks : ");
        double finalM = scanner.nextDouble();

        double score = quiz + mid + finalM;

        if (score >= 90){
            System.out.println("Grade A");
        }else if (score >= 70){
            System.out.println("Grade B");
        }else if (score >= 50){
            System.out.println("Grade C");
        }else if (score >= 35){
            System.out.println("Grade S");
        }else {
            System.out.println("Grade F");
        }
    }
}
