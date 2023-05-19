package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 8. Write a program to calculate the area of a triangle.
 */
public class Programme08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Programme08 obj = new Programme08();
        obj.area(sc);
    }

    //creating instance method
    public void area(Scanner sc) {
        System.out.println("Enter the width of the Triangle:");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the Triangle:");
        double height = sc.nextDouble();
        double area = (width * height) / 2;
        System.out.println("Area of Triangle is: " + area);
    }
}
