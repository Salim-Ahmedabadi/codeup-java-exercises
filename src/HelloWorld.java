import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World");
//  1.   Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 15;
        System.out.println(myFavoriteNumber);

//       2. Create a String variable named myString and assign a string value to it, then print the variable out to the console.3.Change your code to assign a character value to myString. What do you notice?
        String myString  = "Salim";
        System.out.println(myString);

//        5.Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
        Float myNumber = 123F;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);
//        int x = 5;
//        System.out.println(++x);
//        int x = 4;
//        x = x + 5;

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int three = (int) "three";

        int x = 4;
        x += 5;
        System.out.println(x);

        int n = 3;
        int m = 4;
        m *= n;
        System.out.println(m);

        int q = 10;
        int r = 2;
        q /= r;
        r -= q;
        System.out.println(r);

//        What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?
//
//        Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
    byte num = 5;
    num += num;
//    num *= 3;
        System.out.println(num);
    }
}


