//prgm to print first ten numbers of the series
package forloopprograms;

import java.util.Scanner;

public class FirstTenNumbersSeries {

	public static void main(String[] args) {
		int num,i,mul,terms;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		System.out.println("How many terms to be printed?");
		terms=sc.nextInt();
		for(i=1; i<=terms; i++)
		{
			mul=num*i;
			System.out.print(mul +"  ");
		}
		sc.close();
		

	}

}
