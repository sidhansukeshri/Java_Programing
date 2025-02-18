public class OverloadingVariableLengthArg {
    static void vatest(int ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(int x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    static void vatest(boolean ... v) {
        System.out.println("Number of args: " + v.length);
        System.out.println("Contents: ");
        for(boolean x : v) {
            System.out.println(x + " ");
        }
        System.out.println();
    }
    static void vatest(String msg,int ...v ) {
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
        vatest(true);
        vatest(false, true, false);
        vatest("Testing", 1, 2, 3);
    }
}
