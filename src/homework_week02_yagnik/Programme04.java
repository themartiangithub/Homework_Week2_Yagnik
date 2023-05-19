package homework_week02_yagnik;

/**
 * 4. Write a Java programme using the following steps.
 * <p>
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the
 * print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme04 {
    //instance variables
    int a = 10;
    int b = 20;
    //static variables
    static int c = 30;
    static int d = 40;

    //main method
    public static void main(String[] args) {
        Programme04 obj1 = new Programme04();
        obj1.m1();
        Programme04.m2();
    }

    //instance method
    public void m1() {
        //calling all variables
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    //static method
    public static void m2() {
        //creating object
        Programme04 obj2 = new Programme04();
        //calling all variables
        System.out.println(obj2.a);
        System.out.println(obj2.b);
        System.out.println(c);
        System.out.println(d);
    }
}
