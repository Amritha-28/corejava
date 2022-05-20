//Prgm to print the factorial of a number
package forloopprograms;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		int num,i;
		long fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=num; i>=1; i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		sc.close();
	}

}
