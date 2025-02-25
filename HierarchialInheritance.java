// Base class
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

// Derived class (Inheriting from Animal)
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class cat extends Animal {
    public void meow() {
        System.out.println("Cat is meowing");
    }
}

// Main class
public class HierarchialInheritance {
    public static void main(String[] args) {
        cat c = new cat(); 
        Dog d = new Dog();
        c.eat();
        c.meow(); 
        d.eat();            
        d.bark();   
    }
}
