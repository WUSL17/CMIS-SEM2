import java.util.Scanner;

/**
 * @author chamodshehanka on 12/10/2018
 * @project Demo
 **/
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name : ");
        String name = scanner.nextLine();


        String[] array = name.split(" ");
        System.out.print("Name with initials : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i].charAt(0) + " ");
        }
        System.out.println(array[array.length-1]);

    }
}
