import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int userInput = scanner.nextInt();
        System.out.println("You entered: --> \"" + userInput + "\" <--");

        Scanner firstScanner = new Scanner(System.in);
        System.out.println("Write the first string:");
        String first = firstScanner.nextLine();

        Scanner secondScanner = new Scanner(System.in);
        System.out.println("Write the second string:");
        String second = secondScanner.nextLine();

        Scanner thirdScanner = new Scanner(System.in);
        System.out.println("Write the third string:");
        String third = thirdScanner.nextLine();

        System.out.println("You wrote:");
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        Scanner sentenceScanner = new Scanner(System.in);
        System.out.println("Welcome to Code-up!!!");
        String sentence = sentenceScanner.next();

    }

    }

