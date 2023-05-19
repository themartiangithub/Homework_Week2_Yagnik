package homework_week02_yagnik;

/**
 * 3. Write a Java programme using the following steps.
 * <p>
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */
public class Programme03 {
    //instance variable
    int a = 10;
    //static variable
    static int b = 20;

    //main method
    public static void main(String[] args) {
        Programme03 obj1 = new Programme03();
        obj1.m1();
        m2();
    }

    //instance method
    public void m1() {
        //calling both variables
        System.out.println(a);
        System.out.println(b);
    }

    //static method
    public static void m2() {
        //creating object
        Programme03 obj2 = new Programme03();
        //calling both variables
        System.out.println(obj2.a);
        System.out.println(b);
    }
}
