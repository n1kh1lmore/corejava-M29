//program for demonstration on while loop
package looping;
import java.util.*;
public class WhileloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value of n: ");
		n = sc.nextInt();
		while(i<=n) {
			System.out.println(i);
			i++;
		}
		sc.close();
	}

}
