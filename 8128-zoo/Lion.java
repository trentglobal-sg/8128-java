
/**
 * Write a description of class Lion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lion extends Animal
{
    // method overriding - when a child class has the same method as
    // the parent. The child class' method will take precedence
    public void speak() {
        System.out.println("LION ROAR");
    }
}