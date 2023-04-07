//program to demonstrate on label for loop
package looping;

public class LabelledForloopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
			for(int i = 1; i<= 5; i++) {
				System.out.println();
				inner:
					for(int j = 1; j <= 5; j++) {
						System.out.print(j + " ");
						//break
						if(j==4)
							break;
						//continue will skip 4
					}
			}
	}

}
