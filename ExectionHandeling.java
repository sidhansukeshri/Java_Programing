public class ExectionHandeling {
    public static void main(String[] args) {
        try {
            int data = 5/0;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Finally Block");
        }
    }
}
