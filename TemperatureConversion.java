import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.println(celsius + "°C is " + fahrenheit + "°F.");
        }
    }
}

