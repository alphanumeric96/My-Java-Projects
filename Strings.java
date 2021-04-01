import java.sql.Time;

/**
 * @author Shorya created on 27 March 2021
 * Learning Strings
 */

public class Strings {
    public static void main(String[] args) {
        String p = "QWERTY is a Keyboard style";
        System.out.println("The total length of the string is:" + p.length());
        System.out.println("To Upper Case:" + p.toUpperCase());
        System.out.println("To Lower case:" + p.toLowerCase());
        System.out.println(p.indexOf("Key"));
        String q = "SomeName";
        String r = "DifferentName";
        System.out.println(q + " " + r);

        String txt = "Hello\rWorld!";
        System.out.println(txt);

        String tabString = "Hello\tWorld!";
        System.out.println(tabString);

        int x = 10;
        int y = 20 + x;
        System.out.println(y);


    }
}
