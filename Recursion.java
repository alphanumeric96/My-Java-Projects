public class Recursion {
    public static void main(String[] args) {
        /**AN Integer has been declared named result. We have made a method with a parameter named sum
         */
        int result = sum(10);
        System.out.println(result);
    }

    /**
     *
     * @param k has declared an integer. When calling the method sum we have declared in the main method the function sum() with value 10;
     * @return 0 when k == 0  else calling the sum and adding it with k
     */
    public static int sum(int k) {
        if (k > 1) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

}
