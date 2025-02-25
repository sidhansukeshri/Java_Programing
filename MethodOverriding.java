class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("Dog eats meat.");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}