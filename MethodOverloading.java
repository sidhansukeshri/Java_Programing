public class MethodOverloading {
    void test(){
        System.out.println("No Parameters");
    }
    void test(int a){
        System.out.println(a);
    }
    void test(Double a){
        System.out.println(a*a);
    }
}
class overload{
    public static void main(String[] args) {
        int a=88;
        MethodOverloading obj = new MethodOverloading();
        obj.test();
        obj.test(a);
        obj.test(123.25);
    }
}