
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animal
{
    private String name;
    public Animal() {
        name="N/A";
    }
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println("<Some Animal Noise>");
    }
}