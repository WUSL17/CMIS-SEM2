/**
 * Method Overloading is a feature that allows a class to have more than one method having the same name,
 * if their argument lists are different*/

public class MethodOverloading {
    private void disp(char c){
        System.out.println(c);
    }
    private void disp(char c, int num){
        System.out.println(c + " "+num);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        methodOverloading.disp('A');
        methodOverloading.disp('B',5);

        /**
         * In the above example – method disp() is overloaded based on the number of parameters
         * – We have two methods with the name disp but the parameters they have are different.
         * Both are having different number of parameters.
         * */
    }
}
