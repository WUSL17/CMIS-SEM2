import java.util.Random;

public class Q8 {
    public static void main(String[] args) {
        Random random = new Random();

        int x = random.nextInt(100);
        int y = random.nextInt(100);
        System.out.println("+ : Addition : x + y : "+ (x + y) + " if variable x is "+x+" and y is "+ y);

        x = random.nextInt(100);
        y = random.nextInt(100);
        System.out.println("- : Subtraction : x - y : "+ (x - y) + " if variable x is "+x+" and y is "+ y);

        x = random.nextInt(100);
        y = random.nextInt(100);
        System.out.println("* : Multiply : x * y : "+ (x * y) + " if variable x is "+x+" and y is "+ y);

        x = random.nextInt(100);
        y = random.nextInt(100);
        System.out.println("/ : Divide : x / y : "+ (x / y) + " if variable x is "+x+" and y is "+ y);

        x = random.nextInt(100);
        y = random.nextInt(100);
        System.out.println("% : Multiply : x % y : "+ (x % y) + " if variable x is "+x+" and y is "+ y);
    }
}