import java.util.Scanner;
public class W01_P4{
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int x=sc.nextInt();
	   int y=sc.nextInt();
//code for quotient and remainder
if (y == 0) {
  System.out.println("Error: Division by zero is not allowed.");
}
else {
  int quotient = x / y;
  int remainder = x % y;
  System.out.println("The Quotient is = " + quotient);
  System.out.print("The Remainder is = " + remainder);
}

sc.close();
  }
}
