package decisionmaking;
import java.util.*;
public class SwitchCaseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int songInput = s.nextInt();
		switch(songInput) {
		
		case 1:
			System.out.println("calm down");
			break;
		case 2:
			System.out.println("perfect");
			break;
		case 3:
			System.out.println("Mallem song");
			break;
		default:
			System.out.println("Invalid Input");
			
		}
	}

}
