public class CallByRef {
    int a,b;
    CallByRef(int i, int j) {
        a = i;
        b = j;
    }
    void math(CallByRef obj) {
        obj.a = obj.a * 2;
        obj.b = obj.b / 2;
    }
    public static void main(String[] args) {
        CallByRef obj = new CallByRef(15, 20);
        System.out.println("Before: " + obj.a + " " + obj.b);
        obj.math(obj);
        System.out.println("After: " + obj.a + " " + obj.b);
    }
}
