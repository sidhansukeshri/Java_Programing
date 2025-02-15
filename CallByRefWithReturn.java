public class CallByRefWithReturn {
    int a;
    CallByRefWithReturn(int i) {
        a = i;
    }
    CallByRefWithReturn increment(CallByRefWithReturn obj) {
        return new CallByRefWithReturn(obj.a + 10);
    }
    public static void main(String[] args) {
        CallByRefWithReturn obj = new CallByRefWithReturn(2);
        System.out.println("Before: " + obj.a);
        obj = obj.increment(obj);
        System.out.println("After: " + obj.a);
    }
}
