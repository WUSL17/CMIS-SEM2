public class Exercise01 {
    public static void main(String[] args) {
        //Question 1
        //a)
        System.out.println(" _________________");
        System.out.println("| The value is 10 |");
        System.out.println(" _________________");

        //b)
        System.out.println(" _________________");
        System.out.println("| I'm 10 years old.|");
        System.out.println(" _________________");

        //c)
        System.out.println(" _________________");
        System.out.println("| I'm 10 years old.|");
        System.out.println(" _________________");

        //d)
        for (int i = 0; i < 33; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        System.out.println("*        I'm 10 years old       *");
        System.out.println("* I have 2 sisters & 2 brothers *");
        System.out.println("* Altogether I have 4 siblings  *");
        for (int i = 0; i < 33; i++) {
            System.out.print("*");
        }

        System.out.println();

        //Question 2
        double x = 10.5, y = 20;

        //a)
        double equation1 = x * x + 4 * x  * y;
        System.out.println("x*x + 4xy : " + equation1);

        //b)
        double equation2 = equation1 / (x + 2 * x * y);
        System.out.println("(x*x + 4xy)/x + 2xy : " + equation2);

        //Question 3
        x = 10.2;
        y = 20.2;

        double equation = (4 * x * x + 2 * x * x * x) / ((x+y) * (x+y));
        System.out.println(equation);

    }
}
