import java.util.*;
public class W02_P3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
// Define the class Rectangle here
        class Rectangle {
            int length, breadth;

            // Constructor
            Rectangle(int length, int breadth) {
                this.length = length; // Use the this keyword to refer to the instance variable
                this.breadth = breadth; // Use the this keyword to refer to the instance variable
            }

            // Method to calculate area
            int area() {
                return this.length * this.breadth; // Calculate and return the area
            }
        }
// Create an object of Rectangle and call the area method
        Rectangle r = new Rectangle(length, breadth);
        System.out.print(r.area());

        sc.close();
    }
}
