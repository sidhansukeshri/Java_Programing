//using array and method overloading are not feesable in varaible length argument, so we use ... that came after JDK5
public class VariableLengthArg {
    static void vatest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        vatest(10);
        vatest(1, 2, 3);
        vatest();
    }
    
}
