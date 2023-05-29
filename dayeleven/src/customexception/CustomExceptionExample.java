package customexception;

import java.util.*;

public class CustomExceptionExample {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String id = s.nextLine();
		String password = s.nextLine();
		try 
		{
	
			if(id.equals("nikupcm10@gmail.com") && password.equals("123456"))
				{
					System.out.println("Credentials Matched");
				}
			else
				{
					throw new LoginCredential("Invalid Credentials");
				}
		}
			catch(LoginCredential e)
		{
			System.out.println("Exception handled " + e);
		}
		s.close();

	}

}
