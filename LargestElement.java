import java.util.Scanner;
public class LargestElement {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of elements in the array: ");
            int n = scanner.nextInt();
            int[] array = new int[n];

            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            int max = array[0];
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Largest element is: " + max);
        }
    }
}