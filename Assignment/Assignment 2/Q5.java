public class Q5 {
    public static void main(String[] args) {
        //Part a
        int columns = 1,N = 3;
        for(int i=1;i< N * 2; i++){
            for(int j=1; j<=columns; j++){
                System.out.print("*");
            }

            if(i < N){
                columns++;
            }else{
                columns--;
            }
            System.out.println();
        }

        System.out.println("\nPart b\n");

        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nPart c\n");

        int k = 4;
        int rows = 5;
        for(int i=1; i<=rows; i++){
            /* Print leading spaces */
            for(int j=1; j<i; j++){
                System.out.print("*");
            }

            for(int j=i; j<=rows; j++){
                System.out.print("+");
            }

            System.out.println();
        }
    }
}
