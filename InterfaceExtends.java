interface printable {
    void print();
    default void msg() {
        System.out.println("This is a default function");
    }
}
interface showable extends printable{
    void show();
}
class InterfaceExtends implements showable {
    @Override
    public void print() {
        System.out.println("Hello Sid!, This is Printing");
    }

    @Override
    public void show() {
        System.out.println("Hello Sid!, This is Showing");
    }

    public static void main(String[]  args) {
        InterfaceExtends obj = new InterfaceExtends();
        obj.print();
        obj.show();
        obj.msg();
    }
}