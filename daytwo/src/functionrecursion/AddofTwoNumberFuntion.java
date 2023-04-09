package functionrecursion;
import java.util.*;
public class AddofTwoNumberFuntion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		
        System.out.print("Enter first number: ");
        int num1 = s.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = s.nextInt();
        
        int sum = add(num1, num2);
        System.out.println("Sum of number is " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
	}

}
