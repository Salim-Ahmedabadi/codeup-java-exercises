package util;
import java.util.Scanner;
public class Input {
    //instance variable (private)
    private static Scanner sc = new Scanner(System.in);

    public static String getString(){

        System.out.println("Give me a string");
        String string = sc.nextLine();
        System.out.println(string);
        return string;
    }

    public static boolean yesNo(){
        System.out.println("\nContinue?");
        String input = sc.next();
        if(input.startsWith("y")){
         System.out.println("true");
            return true;
        } else {
          System.out.println("false");
            return false;
        }
    }
    public static int getInt(){
        int input = sc.nextInt();
        return input;
    }

    public static double getDouble(){
        double inputDouble = sc.nextDouble();
        return inputDouble;
    }


}