package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 13. Write a Java program that takes three numbers as input to calculate and
 * print the average of the numbers.
 */
public class Programme13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        double a = sc.nextDouble();
        System.out.print("Enter second number : ");
        double b = sc.nextDouble();
        System.out.print("Enter third number : ");
        double c = sc.nextDouble();
        average(a, b, c);
    }

    public static double average(double a, double b, double c) {
        double ans = (a + b + c / 3);
        System.out.println("Average of " + a + " , " + b + " and " + c + " is : " + ans);
        return 0;
    }
}
