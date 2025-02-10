import java.util.Scanner;

public class CircleArea {
    public static Double area1(double r){
        Double area = Math.PI * r * r;
        return area;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter radius of the circle: ");
            double radius = scanner.nextDouble();
            
            double area = area1(radius);
            System.out.println("Area of the circle is: " + area);
        }
    }
}

