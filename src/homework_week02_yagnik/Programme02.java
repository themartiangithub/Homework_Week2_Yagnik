package homework_week02_yagnik;

/**
 * 2. Write a Java programme using the following steps.
 * <p>
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement.
 * 2.4 Declare the Main method.
 * 2.5 Call the static method into the Main method and Run the programme.
 */
public class Programme02 {
    //static variables
    static int a = 10;
    static int b = 20;

    //main method
    public static void main(String[] args) {
        //calling static method
        my();
        Programme02.my();
    }

    //static method
    public static void my() {
        System.out.println(a);
        System.out.println(b);
    }
}
