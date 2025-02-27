interface printable {
    void print();
}
interface showable {
    void show();
}

class MultipleInheritanceUsingInterface implements printable, showable {
    @Override
    public void print() {
        System.out.println("Hello Sid!, This is Printing");
    }

    @Override
    public void show() {
        System.out.println("Hello Sid!, This is Showing");
    }

    public static void main(String args[]) {
        MultipleInheritanceUsingInterface obj = new MultipleInheritanceUsingInterface();
        obj.print();
        obj.show();
    }
}