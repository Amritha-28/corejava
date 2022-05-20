//example for if case
package programs;

import java.util.Scanner;

public class IfCaseExample {

	public static void main(String[] args) {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num==0) {
			System.out.println("Entered number is zero");
			
		}
		else
		{
			System.out.println("The entered number is not zero");
		}
		sc.close();
	}
	
}
