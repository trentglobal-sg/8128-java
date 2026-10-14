import java.util.Scanner;

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    // create a sc attribute that stores a Scanner object
    Scanner sc = new Scanner(System.in);
    
    public void sayHello() {
        System.out.println("Hello World");
    }
    
    public int addTwo(int x, int y) {
        return x + y;
    }
    
    public void doMath() {
        System.out.println("Enter the first number: ");
        int firstNumber = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int secondNumber = sc.nextInt();
        
        int ans = addTwo(firstNumber, secondNumber);
        System.out.println(ans);
    }
}