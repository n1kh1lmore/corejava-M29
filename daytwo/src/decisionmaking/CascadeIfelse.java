package decisionmaking;
import java.util.*;
public class CascadeIfelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter three values: ");
		float p1 = s.nextFloat();
		float p2 = s.nextFloat();
		float p3 = s.nextFloat();
		if(p1 > p2 && p1 > p3) {
			System.out.println("Person 1 has highest percentage");
		}
		
		else if(p2 > p1 && p2 > p2) {
			System.out.println("Person 2 has highest percentage");
		}
		
		else {
			System.out.println("Person 3 has highest percentage");
		}
	}

}
