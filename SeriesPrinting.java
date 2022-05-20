//prgm to print the series
package forloopprograms;

import java.util.Scanner;

public class SeriesPrinting {

	public static void main(String[] args) {
		int ft=1,terms,i,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		terms=sc.nextInt();
		for(i=1; i<=terms; i++)
		{
			System.out.println(ft);
			sum=sum+ft;
		}
		sc.close();
		
		

	}

}
