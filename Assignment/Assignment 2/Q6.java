import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temp;
        boolean isPrime = true;
        System.out.print("Input Number : ");
        int num = scanner.nextInt();

        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }

        if(isPrime) {
            System.out.println(num + " is a Prime Number");
        }else {
            System.out.println(num + " is not a Prime Number");
        }
    }
}
