import java.util.Scanner;

/**
 * @author chamodshehanka on 12/10/2018
 * @project Demo
 **/
public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input sentence : ");
        String sentence = scanner.next();

        int count = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println("Vowels count : " + count);
    }
}
