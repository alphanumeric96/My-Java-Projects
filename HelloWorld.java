/**
 * @author Shorya created on 26 March 2021
 * 
 */


public class HelloWorld {

    int x =10;
    String color = "Red";
    public static void main(String[] args) {
        //This value of x is not in the scope of the class HelloWorld
        int x = 456;
        //Printing Hello World for the first time.
        System.out.println("Hello World");
        HelloWorld helloWorld = new HelloWorld();
        System.out.println(helloWorld.x);
        System.out.println(helloWorld.color);
    }
}
