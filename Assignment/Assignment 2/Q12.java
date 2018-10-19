import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int r,sum=0,temp;

        System.out.print("Input number : ");
        int num = scanner.nextInt();

        temp = num;
        while(num>0){
            r=num % 10;
            sum=(sum*10)+r;
            num =num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
