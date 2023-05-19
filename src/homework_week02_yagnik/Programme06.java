package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 6. Write a program to enter any radius value of the circle and find out the
 * area.(Formula of Area A=PI*r*r).
 */
public class Programme06 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        area(sc);
    }
    public static void area(Scanner sc){
        //define radius variable
        int radius;
        //define value of pi
        final double pi = 3.14;
        double area;
        System.out.print("Enter radius of circle: ");
        radius = sc.nextInt();
        area = pi * radius * radius;
        System.out.println("Area of circle is : "+area);
    }
}
