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

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

// Main class
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Puppy p = new Puppy(); 
        p.eat();            
        p.bark();   
        p.weep();       

    }
}
