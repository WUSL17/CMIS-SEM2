public class Q1 {
    public static void main(String[] args) {
        int numbers[] = {22, 52, 66, 82, 5, 8, 12, 19, 78, 12};
        int min,max;

        min = numbers[0];
        max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max){
                max = numbers[i];
            }
            if (numbers[i] < min){
                min = numbers[i];
            }
        }

        System.out.println("Min : " + min);
        System.out.println("Max : " + max);
    }
}
