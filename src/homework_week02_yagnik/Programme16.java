package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 16. Write a Java program to add two binary numbers.
 * Input Data:
 * Input first binary number: 10
 * Input second binary number: 11
 */

public class Programme16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number : ");
        String a = sc.next();
        System.out.print("Enter second binary number : ");
        String b = sc.next();
        //convert binary string to integer number
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        int sum = num1 + num2;
        String result = Integer.toBinaryString(sum);
        System.out.println("Sum of two binary number is : " + result);

    }

}
