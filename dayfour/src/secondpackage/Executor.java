package secondpackage;
//way to import the another package

import firstpackage.*;

public class Executor {
	public static void main(String[] args) {
		
		Base b1 = new Base();
		
		//b1.methodDefault();
		
		b1.methodPublic();

	}
}
