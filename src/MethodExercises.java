import javax.lang.model.SourceVersion;
import java.util.Scanner;
import java.util.Random;
public class MethodExercises {
    public static void main(String[] args) {
//        System.out.println(Addition(2,3));
//        System.out.println(Substraction(2,3));
//        System.out.println(Multiplication(2,3));
//        System.out.println(Division(2,3));
//        System.out.println(Modulas(7,2));
//        System.out.println(multiplicationLoop(5,5));
//        System.out.println(multiplicationRecursion(15,15));
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        factorial();



    }
//    public static int Addition(int num1, int num2) {
//        return num1 + num2;
//
//    }public static int Substraction(int num1, int num2) {
//        return num1 - num2;
//
//    }public static int Multiplication(int num1, int num2){
//        return num1 * num2;
//
//    }public static int Division(int num1, int num2) {
//        return num1 / num2;
//
//   }public static int Modulas(int num1, int num2) {
//            return num1 % num2;
//    }
//    //Bonus
//        public static int multiplicationLoop(int a, int b) {
//        int result = 0;
//        for (int i = 0; i < a; i++) {
//            result +=b;
//        }
//
//            return result;
//        }
////Recursion
//        public static int multiplicationRecursion(int a, int b){
//
//        if ((a == 0) || (b == 0))
//            return 0;
//        else
//            return(a + multiplicationRecursion(a, b - 1));
//        }
////2
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        boolean wrongInput = false;
//        do {
//            System.out.printf("Enter a number between min, max");
//            int userInput = Integer.parseInt(scanner.next());
//
//            if (userInput >= min && userInput <= max) {
//                System.out.println("You are in range");
//
//            } else if (wrongInput == true) {
//                System.out.println("Enter a valid number");}
//
//        }while (wrongInput);
//    return getInteger(min, max);
//}
//3.
//public static void factorial() {
//    int number;
//    System.out.println("Enter the number between 1 and 10 ");
//    Scanner scanner = new Scanner(System.in);
//    number = scanner.nextInt();
//
//    if(number <= 10 && number >= 1) {
//        long fact = 1;
//        int i = 1;
//        while (i <= number) {
//            fact = fact * i;
//            i++;
//        }
//            scanner.close();
//        System.out.println("Factorial of "+number+" is: "+fact);
//    }else{
//        System.out.println("Try again number between 1 and 10 ");
//        number = scanner.nextInt();
//        factorial();
//    }
//
//}
//}
//
//4.
public static void RollTheDice (){

        int die1;
        int die2;
        int roll;
    Scanner diceRoll = new Scanner(System.in);
    System.out.println("Enter the number between 1 and 12 ");
    int userNumber = diceRoll.nextInt();

        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
    System.out.println("The first roll " + die1);
    System.out.println("The second roll " + die2);
    System.out.println("My total roll is " + roll);


    }

}

















