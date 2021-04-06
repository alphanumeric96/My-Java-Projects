/**
 * @author Shorya created on 27 March 2021
 * X + Y
 */

public class XPlusY {
    public static void main(String[] args) {
        int x = 95;
        int y = 5;
        System.out.println(x + y);// Output : 100
        System.out.println(sum(5,8));
    }

    public static int sum(int x, int y){
        return x * y + x * y - 2;
    }
}
