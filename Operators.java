/**
 * @author Shorya created on 26 March 2021
 * Learning logical OR, NOT, AND operator.
 */

public class Operators {
    public static void main(String[] args) {
        int x = 123, y = 727;
        //This is AND Operator
        System.out.println(x > 5 && y > 456 );
        //This is OR Operator
        System.out.println(x > 124 || y > 728 );
        //This is NOT Operator
        System.out.println(!(x > 5 && y > 456 ));
    }
}