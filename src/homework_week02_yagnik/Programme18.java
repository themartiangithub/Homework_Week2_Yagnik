package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 18. Write a Java program to print the sum (addition), multiply, subtract, divide and
 * remainder of two numbers.
 */
public class Programme18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number : ");
        int num1 = sc.nextInt();
        System.out.print("Input second number : ");
        int num2 = sc.nextInt();

        System.out.println("Addition of "+ num1 + " + " + num2 + " is : " + (num1 + num2));
        System.out.println("Substraction of "+ num1 + " - " + num2 + " is : " + (num1 - num2));
        System.out.println("Multiplication of "+ num1 + " x " + num2 + " is : " + (num1 * num2));
        System.out.println("Division of "+ num1 + " / " + num2 + " is : " + (num1 / num2));
        System.out.println("Remainder of "+ num1 + " mod " + num2 + " is : " + (num1 % num2));
    }

}
