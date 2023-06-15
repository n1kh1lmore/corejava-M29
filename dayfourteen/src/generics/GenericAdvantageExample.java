package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericAdvantageExample {

	public static void main(String[] args) {
		//1.Type Safety
		List<Integer> list=new ArrayList();
		list.add(11);
		list.add(15);
		//list.add(23.5);
		System.out.println(list);
		
		//2. before Generics , Typecasting is allowed
		ArrayList arr1=new ArrayList();
		arr1.add("ST. John");
		System.out.println(arr1);
		String str=(String)arr1.get(0);
		System.out.println(str);
		
		//3. In Generics , Typecasting is not necessary
		ArrayList<String> arr2=new ArrayList<>();
		arr2.add("ST. John");
		System.out.println(arr2);
		String str1=(String)arr1.get(0);
		System.out.println(str);

	}

}