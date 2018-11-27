import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input month no : ");
        int monthNo = scanner.nextInt();

        if (monthNo > 0 && 12 >= monthNo){
            String months[] = {"January", "February", "March", "April",
                    "May", "June", "July", "August", "September", "October","November", "December"};

            System.out.println(months[monthNo+1]);
        }else {
            System.out.println("Invalid No");
        }
    }
}
