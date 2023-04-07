
//program to demonstrate on increment and decrement operator
package operatordemo;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 12, b = 5;
		
		int x = a++;
		++a;
		System.out.println(x);
        System.out.println(a);
        
        int y = b--;
        --b;
        System.out.println(y);
        System.out.println(b);
	}

}
