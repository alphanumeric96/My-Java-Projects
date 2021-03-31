/**
 * @author Shorya created on 31 March 2021
 */

public class IfElse {
    public static void main(String[] args) {
        int dog = 50;
        if (dog > 50) {
            System.out.println("There are more Dogs");

        } else if (dog < 30) {
            System.out.println("There are less dogs");
        }else {
            System.out.println("There are 50 Dogs");
        }

        //Ternary Operator use
        int time = 20;
        String result;
        result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
