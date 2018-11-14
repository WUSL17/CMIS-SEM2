import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patterns patterns = new Patterns();

        System.out.print("Input pattern type  : ");
        int type = scanner.nextInt();
        
        switch (type){
            case 1 : patterns.triangle();
                    break;
            case 2 : patterns.square();
                    break;
            case 3 : patterns.cross();
                    break;
            case 4 : patterns.diamond();
                    break;
            default:
                System.out.println("Invalid type !!");
            
        }
    }

    private void triangle(){
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
    }

    private void square(){
        int number = 7;

        for (int i = 0; i < number; i++) {
            if (i == 0 || i == 6) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 5) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == 6) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    private void cross(){
        int i,j,n = 5;
        for(i=n;i>=1;i--){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                if(j==1 || j==(2*i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(i=2;i<=n;i++){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                if(j==1 || j==(2*i-1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void diamond(){
        int i,j,n = 5;
        for(i=1;i<=n;i++){
            for(j=i;j<n;j++){
                System.out.print(" ");
            }
            for(j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=i;j<=n;j++){
                System.out.print(" ");
            }
            for(j=2;j<(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
