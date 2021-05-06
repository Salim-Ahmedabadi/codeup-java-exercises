import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        System.out.print("Lets talk with Bob: ");
        while (true) {
            userInput = scanner.nextLine();
            System.out.println(promptBob(userInput));
            System.out.print("Reply: ");
        }
    }

    public static String promptBob(String inputString) {
        if(inputString.endsWith("?")) {
            return "Sure";
        } else if (inputString.endsWith("!")) {
            return "Whoa, chill out!";
        } else if (inputString.isEmpty()) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }
}
