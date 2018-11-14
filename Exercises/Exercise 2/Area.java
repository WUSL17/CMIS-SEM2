import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area area = new Area();

        System.out.println("Calculate area \n Input R for rectangle input C for circle");
        System.out.println("Your input  :  ");
        String input = scanner.nextLine();

        switch (input){
            case "r" :
            case "R" : {
                System.out.print("Enter length : ");
                int length = scanner.nextInt();

                System.out.print("Enter width : ");
                int width = scanner.nextInt();

                area.rectArea(length, width);
            }
            break;

            case "c" :
            case "C" :{
                System.out.println("Enter radius : ");
                int radius = scanner.nextInt();
                area.circleArea(radius);
            }
            break;

            default:
                System.out.println("Invalid Input !!!");
        }
    }

    private void rectArea(int length, int width){
        System.out.println("Area : "+ (width * length));
    }

    private void circleArea(int radius){
        System.out.println("Area : " + (22/7 * radius * radius));
    }
}
