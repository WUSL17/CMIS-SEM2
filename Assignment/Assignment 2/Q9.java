public class Q9 {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++)
            for (int j = 1; j * j <= i; j++)
                if (j * j == i)
                    System.out.println(i);
    }
}
