public class Constructor {
    int id;
    String name;
    Constructor(int id, String name){
        this.id = id;
        this.name = name;
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor(10, "abc");
        Constructor obj1 = new Constructor(20, "xyz");
        System.err.println(obj.id + " " + obj.name);
        System.err.println(obj1.id + " " + obj1.name);
    }
}