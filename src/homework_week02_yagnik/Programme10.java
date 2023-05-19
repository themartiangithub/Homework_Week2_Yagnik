package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 10. Write a Java program that takes a number as input and prints its
 * multiplication table up to 10.
 */

public class Programme10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(num + " x " + 1 + " = " + (num * 1));
        System.out.println(num + " x " + 2 + " = " + (num * 2));
        System.out.println(num + " x " + 3 + " = " + (num * 3));
        System.out.println(num + " x " + 4 + " = " + (num * 4));
        System.out.println(num + " x " + 5 + " = " + (num * 5));
        System.out.println(num + " x " + 6 + " = " + (num * 6));
        System.out.println(num + " x " + 7 + " = " + (num * 7));
        System.out.println(num + " x " + 8 + " = " + (num * 8));
        System.out.println(num + " x " + 9 + " = " + (num * 9));
        System.out.println(num + " x " + 10 + " = " + (num * 10));
        /*for(int i=1;i<=10;i++)
        {
            System.out.println(num+" x "+i+" = "+(num*i));
        }*/
    }
}
