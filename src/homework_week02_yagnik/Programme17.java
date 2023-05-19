package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 17. Write a Java program to convert a decimal number to binary number.
 * Input Data:
 *  Input a Decimal Number : 5
 */
public class Programme17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int decimal = sc.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary number of "+decimal+" is : "+binary);
    }

}
