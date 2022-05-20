/*prgm to check prime number or not
package forloopprograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		int num,i,c;
		c=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1; i<=num; i++)
		{
			if(num%i == 0)
				c++;
		}
		if(c== 2)
		{
		System.out.println(num +" is prime number");
		}
		else
		{
			System.out.println(num+" is not prime number");
		}
		
		sc.close();
	}


}*/
