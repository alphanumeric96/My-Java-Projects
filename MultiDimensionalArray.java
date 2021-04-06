public class MultiDimensionalArray {

    public static void main(String[] args) {
        String[][] myNumbers = {{"A", "B", "C"}, {"D", "E", "F"}};
        try {
            //Handled some Index out of bound exception
            String x = myNumbers[1][10];
            System.out.println(x);
        }catch (Exception e){
            System.out.println(e.toString());
        }

    }
}

