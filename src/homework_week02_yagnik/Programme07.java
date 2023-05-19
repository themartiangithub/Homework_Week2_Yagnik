package homework_week02_yagnik;
import java.util.Scanner;

/**
 * Write a program to insert any temperature value in degree Fahrenheit and
 * convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
public class Programme07 {
    public static void main(String[] args) {
        //define scanner
        Scanner sc = new Scanner(System.in);
        //call static method
        fahrenheit(sc);
    }
    //create static method
    public static void fahrenheit(Scanner sc){
        System.out.print("Enter a degree in Fahrenheit: ");
        //define fehrenheit
        double f = sc.nextDouble();
        //define celsius
        double  celsius =((f - 32) * 5 / 9);
        System.out.println(f + " degree is equal to " + celsius + " in Celsius");
    }
}
