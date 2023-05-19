package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 15. Write a Java program to swap two variables.
 */

public class Programme15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        //System.out.println("Before swapping value of a and b is : "+a+" , "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping value of number1 and number2 is : "+a+" , "+b);
    }
}
