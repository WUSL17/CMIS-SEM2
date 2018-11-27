import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input sentence : ");
        String sentence = scanner.nextLine();

        int length = sentence.length();
        int count = 0;


        for (int i = 0; i < length; i++) {
            if (isVowel(String.valueOf(sentence.charAt(i)))){
                count++;
            }
        }

        System.out.println("No of vowels : " + count);
    }

    private static boolean isVowel(String s){
        String vowels[] = {"a","e","i","o","u"};
        boolean isVowel = false;
        for (int i = 0; i < vowels.length; i++) {
            if (s.equals(vowels[i])){
                isVowel = true;
            }
        }
        return isVowel;
    }
}
