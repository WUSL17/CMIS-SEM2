import java.util.Scanner;

/**
 * @author chamodshehanka on 12/10/2018
 * @project Demo
 **/
public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int input = scanner.nextInt();
        int[] array = new int[input];

        System.out.println("Enter " + input + " integers :");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("\nArray");
        for (int i1 : array) {
            System.out.print(i1 + " ");
        }

        System.out.println();

        for (int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        System.out.println("\nReverse of the array");
        for (int i1 : array) {
            System.out.print(i1 + " ");
        }
    }
}
