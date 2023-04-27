package interfacedemo;

public class InterfaceExecutor {
	public static void main(String[] args) {
		
		ATMMachine a1 = new ATMMachineChild();
		a1.deposit();
		a1.withdraw();
		
		ReceipeImplementable r = new ReceipeImplementable();
		r.setName("Nikhil");
		System.out.println(r.displayName());
		
		NestedInterfaceExample n = new NestedInterfaceExample();
		n.setStr1("Nikhil");
		n.setStr2("More");
		System.out.println(n.concatenate());

	}
}
