// Base class
class Animal {
    private void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (Inheriting from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// Main class
public class SimpleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();  // Creating an object of Dog
        d.eat();            // Calling inherited method
        d.bark();           // Calling method from Dog class
    }
}
