package functionrecursion;
import java.util.*;
public class FibonacciRecursion {
	static int fib(int n)
    {
        if (n <= 1)
        	return n;
        return fib(n - 1) + fib(n - 2);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int N = s.nextInt();
   
        for (int i = 0; i < N; i++) {
            System.out.print(fib(i) + " ");
        }
	}

}
