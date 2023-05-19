package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 9. Write a program to convert the upper case to lower case.
 */
public class Programme09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programme09 obj = new Programme09();
        obj.m1(sc);
    }

    public void m1(Scanner sc) {
        System.out.println("Enter string to be converted in lowercase : ");
        String text = sc.nextLine();
        System.out.println(text.toLowerCase());
    }
}
