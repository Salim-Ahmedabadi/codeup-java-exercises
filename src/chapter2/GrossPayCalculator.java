package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        //1. Get the numbers of hours worked
        System.out.println("Enter the number of hours you worked");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();
        //2.  Get the hourly pay rate
        System.out.println("Enter your hourly pay rate?");
        double rate = scanner.nextDouble();
        //3.   Multiply hours and pay rate
        double grossPay = hours * rate;
        //4.  Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}
