package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 5. Write a program for a calculator with addition, subtraction, multiplication
 * and division methods all with parameters and use string concatenation
 * methods.(Note: Two static and Two instance methods.)
 */
public class Calculator05 {

    //main method
    public static void main(String[] args) {
        //scanner declaration
        Scanner sc = new Scanner(System.in);
        //static method calling
        addition(sc);
        substraction("Enter first number : ", "Enter second number : ", sc);
        Calculator05 obj = new Calculator05();
        //instance method calling
        obj.multiplication("Enter first number : ", "Enter second number : ", sc);
        obj.division("Enter first number : ", "Enter second number : ", sc);
    }

    //Two static methods addition and substraction
    public static void addition(Scanner sc) {
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter second number : ");
        int b = sc.nextInt();
        int ans = a + b;
        System.out.println("Addition of " + a + " and " + b + " is : " + ans);
    }

    public static void substraction(String a, String b, Scanner sc) {
        System.out.print(a);
        int number1 = sc.nextInt();
        System.out.print(b);
        int number2 = sc.nextInt();
        int ans = number1 - number2;
        System.out.println("Substraction of " + number1 + " and " + number2 + " is : " + ans);
    }

    ////Two instance methods multiplication and division
    public void multiplication(String a, String b, Scanner sc) {
        System.out.print(a);
        int number1 = sc.nextInt();
        System.out.print(b);
        int number2 = sc.nextInt();
        int ans = number1 * number2;
        System.out.println("Multiplication of " + number1 + " and " + number2 + " is : " + ans);
    }

    public void division(String a, String b, Scanner sc) {
        System.out.print(a);
        int number1 = sc.nextInt();
        System.out.print(b);
        int number2 = sc.nextInt();
        int ans = number1 / number2;
        System.out.println("Division of " + number1 + " and " + number2 + " is : " + ans);
    }

}
