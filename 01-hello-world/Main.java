import java.util.ArrayList;
import java.util.HashMap;


public class Main {
    // create a main function (starting point of all Java program)
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Java is a strongly-typed language (type-safe)
        // every variable and parameter is given a data type
        // and it can't be changed. Java will enforce the data type
        // strictly (TypeScript is the JavaScript eqv.)


        // numbers in Java
        // <data type> <variable name> = <new value>;
        // int goes from -2b + 2b
        int secretOfLife = 42;
        // -32k to 32k
        short small = 12;

        // double is for floating point number (64-bit)
        double gstPercentage = 0.09;
        // float is only 32-bit precision
        float pi = 3.14f;

        // char
        // a char represents one SYMBOL (one character) in a string
        char c = 'a';

        // boolean
        boolean isRaining = true;

        // Strings
        // strings in Java must use double quotes
        // strings in Java are an object but they are not references
        String s = "She sells seashells at the seashore";

        // Arrays in Java are fixed length
        // Unlike JavaScript where array is infinite and can grow
        // we must give a fixed length to Java arrays and they cannot
        // change their size
        int[] a = new int[3];  // create a new array of integer with size 3
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        System.out.println(a[1]);
        
        // data strutures are ways of storing and retriving (searching) data
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(101);
        numbers.add(102);
        System.out.println(numbers.get(1));

        // key/value pairs
        HashMap<String, Integer> months = new HashMap<>();
        months.put("jan", 31);
        months.put("feb", 28);
        months.put("mar", 30);

        System.out.println(months.get("feb"));

        // some other combination
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(addTwo(3, 4));
        System.out.println(addTwo(3, 4.4)); 
        System.out.println(addTwo("one", "two"));
    }

    // function that accepts two integers and return the sum
    public static int addTwo(int n1, int n2) {
        return n1 + n2;
    }

    // an overloaded method is one that the shares the name as another
    // method, but with different data types for return and/or parameters
    public static double addTwo(double d1, double d2) {
        return d1 + d2;
    }
}