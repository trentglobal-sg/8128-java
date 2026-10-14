public class Main() {
    // a method is a function defined within a class
    public static void main(String[] args) {
        // create an instance of a class => to create an object from a class
        // new Person() will return an object, which data type is Person
        Person ahkow = new Person();
        ahkow.firstName = "Ah Kow";
        ahkow.lastName = "Tan";
        ahkow.age = 42;
        System.out.println(ahKow.firstName + "," + ahKow.lastName + ", " + ahKow.age)
    }
}

// A class is a template for an object
class Person {
    // attribute or property or field
    String firstName;
    String lastName;
    int age;
}