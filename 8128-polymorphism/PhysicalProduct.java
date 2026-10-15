
/**
 * Write a description of class PhyiscalProduct here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PhysicalProduct extends Product 
{
    private double weight;
    private String dimension;
    private double salesTax;
    
    public PhysicalProduct() {
        super();  // <-- is to call the parent constructor
        weight = 0;
        dimension="0x0x0";
        salesTax = 0.01;
    }
    
    // overloaded constructor
    public PhysicalProduct(String name, double price, String sku, 
        double weight, String dimension, double salesTax)
    {
         // call the parent overloaded constructor
         super(name, price, sku);
         setWeight(weight);
         setDimension(dimension);
         setSalesTax(salesTax);
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException("Weight must be positive");
        }
    }
    
    public String getDimension() {
        return dimension;
    }
    
    public void setDimension(String dimension) {
        if (dimension.length() > 0) {
            this.dimension = dimension;
        } else {
            throw new IllegalArgumentException("Dimension cannot be blank");
        }
    }
    
    public double getSalesTax() {
        return salesTax;
    }
    
    public void setSalesTax(double salesTax) {
        if (salesTax > 0) {
            this.salesTax = salesTax;
        } else {
            throw new IllegalArgumentException("Sales tax must be positive");
        }
    }
    
    public double calculateSalesTax() {
        return salesTax * price;
    }
    
    public String toString() {
        // call the toString method on the parent class first
        String parentInfo = super.toString();
        String template = "Weight: %f, Dimension: %s, Sales Tax %f";
        return parentInfo + " " + String.format(template, weight, dimension, salesTax);
    }
    
}