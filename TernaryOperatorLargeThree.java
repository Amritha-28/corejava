//prgm for ternary operator 
package programs;

import java.util.Scanner;

public class TernaryOperatorLargeThree {
	public static void main(String[] args) {
		int n1, n2, n3, large;
		Scanner sca=new Scanner(System.in);
		System.out.println("Enter the three numbers");
		n1=sca.nextInt();
		n2=sca.nextInt();
		n3=sca.nextInt();
		large=(n1>n2 && n1>n3)?n1:(n2>n3 && n2>n1)?n2:n3;
		System.out.println("Largest of 3 numbers is "+large);
		sca.close();
	}
	
	

}
