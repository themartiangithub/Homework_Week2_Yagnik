package homework_week02_yagnik;

import java.util.Scanner;

public class Programme01 {
    /**
     * 1. Write a Java programme using the following steps.
     * <p>
     * 1.1 Declare two instance variables.
     * 1.2 Declare one instance method.
     * 1.3 Call both instance variables into the instance method inside the print statement.
     * 1.4 Declare the Main method.
     * 1.5 Call the above instance method into the Main method and Run the programme.
     */
    //define scanner
    Scanner sc = new Scanner(System.in);
    //Instance variables
    int a = sc.nextInt();
    int b = sc.nextInt();

    //Main method
    public static void main(String[] args) {
        //creating object
        Programme01 obj = new Programme01();
        //calling instance method
        obj.my();
    }

    //Instance method
    public void my() {
        System.out.println(a);
        System.out.println(b);
    }
}
