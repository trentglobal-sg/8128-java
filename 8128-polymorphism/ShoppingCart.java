import java.util.ArrayList;

/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    // a more generic reference can point a more specific object
    private ArrayList<Product> cartItems = new ArrayList<>();
    
    // method parameters can only benefit from polymorphism
    public void add(Product p) {
        cartItems.add(p);
    }
    
    public void display() {
        for (Product p : cartItems) {
            // when we try to use an object like a string
            // Java will automatically call the toString method on the object
            System.out.println(p);
        }
    }
}