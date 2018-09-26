public class Q7 {
    public static void main(String[] args) {
        //Male who has worked for 55 hours
        calSalary(55, "Male");

        //Female who has worked for 68 hours
        calSalary(68,"Female");
    }

    private static void calSalary(int hours, String gender){
        double salary = 0, exceedHr;
        exceedHr = hours - 40;

        if (70 >= hours && hours >= 60){
            if (gender.equals("Male")){
                salary = 40 * 400 + exceedHr * 400 * 0.375;
            }else{
                salary = 40 * 300 + exceedHr * 300 * 0.3;
            }
        }else if (hours >= 50){
            if (gender.equals("Male")){
                salary = 40 * 400 + exceedHr * 400 * 0.25;
            }else{
                salary = 40 * 300 + exceedHr * 300 * 0.2;
            }
        }else if (hours >= 40){
            if (gender.equals("Male")){
                salary = 40 * 400 + exceedHr * 400 * 0.125;
            }else{
                salary = 40 * 300 + exceedHr * 300 * 0.1;
            }
        }

        System.out.println("Salary : Rs " + salary);
    }
}