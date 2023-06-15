package annotation;

import java.util.Set;
import java.util.TreeSet;

public class SupressWarningExample {
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set s=new TreeSet();
		s.add(12);
		s.add(76);
		s.add("Niket");
		System.out.println(s);
		

	}

}