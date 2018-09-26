import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        int[] notes = new int[]{ 1000, 500, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[9];

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input price : ");
        int amount = scanner.nextInt();

        //count notes
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
            }
        }

        System.out.println("Currency Count");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                String noteTag;
                if (notes[i] >5){
                    noteTag = " note";
                }else {
                    noteTag = " coin";
                }
                System.out.println(notes[i] + " : " + noteCounter[i] + noteTag);
            }
        }
    }
}
