
/**
 * Write a description of class Product here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Product
{
    // if an attribute is marked as public, other classes can access
    // if an attribute is marked as private, only the class can access
    private String name;   // cannot be empty, at least 3 characters
    protected double price;  // cannot be negative. protected access mean 
                             // children (all descendants)
    private String sku;    // at least 3 characters
    

    // constructor is a method used to create a new object/instance of a class
    // public Product Product() {....{
    public Product() {
        // the default constructor is to assign default values to attributes
        name = "N/A";
        price = 0;
        sku = "0000";
    }
    
    // overloaded constructor
    public Product(String name, double price, String sku) {
        setName(name);
        setPrice(price);
        setSKU(sku);

    }
    
    // this method is called whenever we need a string representation
    // of the object (class instance)
    public String toString() {
        String template = "Name: %s, Price: %f, SKU: %s";
        return String.format(template, name, price, sku);
    }
    
    public void setName(String newName) {
        if (newName.length() >= 3) {
            name = newName;
        } else {
            throw new IllegalArgumentException("Name must be at leat 3 characters");
        }
    }
    
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }
    
    public void setSKU(String sku) {
        if (sku.length() >= 3) {
            this.sku = sku;
        } else {
            throw new IllegalArgumentException("SKU must be at least 3 characters");
        }
    }
    
    public String getName() {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
    
    public String getSKU() {
        return sku;
    }
}