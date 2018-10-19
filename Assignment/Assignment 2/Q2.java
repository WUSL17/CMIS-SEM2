import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input number : ");
        int num = scanner.nextInt();

        recursion(num);
    }

    private static void recursion(int number) {
        if(number > 0) {
            recursion(number/10);
            printNum(number % 10);
        }
    }

    private static void printNum(int num){
        switch (num){
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("one ");
                break;
            case 2:
                System.out.print("two ");
                break;
            case 3:
                System.out.print("three ");
                break;
            case 4:
                System.out.print("four ");
                break;
            case 5:
                System.out.print("five ");
                break;
            case 6:
                System.out.print("six ");
                break;
            case 7:
                System.out.print("seven ");
                break;
            case 8:
                System.out.print("eight ");
                break;
            case 9:
                System.out.print("nine ");
                break;
            default:
                System.out.print("Invalid num!");
        }
        System.out.println();
    }
}
