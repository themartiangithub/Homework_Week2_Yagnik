package homework_week02_yagnik;

import java.util.Scanner;

/**
 * 14. Write a Java program to print the area and perimeter of a rectangle.
 */
public class Programme14 {

    public static void main(String[] args) {
        double width, height, perimeter, area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter width of rectangle : ");
        width = sc.nextDouble();
        System.out.print("Enter height of rectangle : ");
        height = sc.nextDouble();
        area = height * width;
        System.out.println("Area of rectangle : " + area);
        perimeter = 2 * (height + width);
        System.out.println("Perimeter of rectangle : " + perimeter);
    }
}
