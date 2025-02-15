class demo11 {
    public static void main(String[] args) {
        Nested_class outer = new Nested_class();
        outer.test(); 
    }
}

class Nested_class {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner(); 
        inner.display();
    }

    class Inner {
        void display() {
            System.out.println("display: outer_x = " + outer_x);
        }
    }
}
