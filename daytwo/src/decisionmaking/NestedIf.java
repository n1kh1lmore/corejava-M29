package decisionmaking;
import java.util.*;
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		if (num > 0) {
			
			if(num < 0) {
				System.out.println("Non zero number");
			}
			else {
				System.out.println("Zero or non zero");
			}			
		}
		else {
			System.out.println("either non zero or zero");
		}
	}

}
