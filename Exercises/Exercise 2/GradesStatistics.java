import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        int noOfStudents, min, max, sum = 0;
        float average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students : ");
        noOfStudents = scanner.nextInt();

        int marks[] = new int[noOfStudents];

        for (int i = 0; i < noOfStudents; i++) {
            System.out.print("Enter the grade for the student " + (i+1) + " : ");
            marks[i] = scanner.nextInt();
        }

        min = marks[0]; //set default values
        max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            sum += marks[i]; //To calculate sum

            if (i > 0){
                if (min > marks[i]){
                    min = marks[i];
                }

                if (max < marks[i]){
                    max = marks[i];
                }
            }
        }

        average = sum / (float)noOfStudents;

        System.out.println("The average is "+ average);
        System.out.println("The minimum is "+ min);
        System.out.println("The maximum is "+ max);
    }
}
