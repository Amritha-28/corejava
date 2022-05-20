//program to check the number is +ve or -ve
package programs;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		}
		else
		{
			System.out.println("Number is negative");
		}
		sc.close();
	}

}
