package homework_week02_yagnik;

/**
 * 19. Write a Java program to convert a given string into lowercase.
 *  Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 *  Output: the quick brown fox jumps over the lazy dog.
 */
public class Programme19 {
    public static void main(String[] args) {
        String a = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.";
        System.out.println("Given String : "+a);
        String b = a.toLowerCase();
        System.out.println("Output String : "+b);
    }
}
