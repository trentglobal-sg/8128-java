import java.util.ArrayList;

class Animal {
    private String name;

    public Animal() {
        name = "N/A";
    }

    public Animal(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("<Some Animal Noise>");
    }
}

class Lion extends Animal {
    // method overriding - when a child class has the same method as
    // the parent. The child class' method will take precedence
    public void speak() {
        System.out.println("LION ROAR");
    }

    public Lion(String name) {
        super(name);
    }
}

class Eagle extends Animal {
    public void speak() {
        System.out.println("SCREECH");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = new ArrayList<>();
        lions.add(new Lion("Leo"));
        lions.add(new Lion("Scarface"));

        ArrayList<Eagle> eagles = new ArrayList<>();
        eagles.add(new Eagle());

        // polymorphism: a more generic reference can refer to a more specific one
        // Animal a = new Lion();

        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Lion("Leo"));
        zoo.add(new Eagle());
        for (Animal a : zoo) {
            // when Java executes a.speak, Java will inspect what is inside a
            // and call the corresponding method
            a.speak();
        }

    }
}
