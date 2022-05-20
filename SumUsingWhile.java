//prgm to find the sum of n natural numbers using while loop
package whileLoopprograms;

import java.util.Scanner;

public class SumUsingWhile {

	public static void main(String[] args) {
		int i, sum,n;
		i=1;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n ");
		n=sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			i++;
		}
		System.out.println("Sum= "+sum);
		sc.close();
		

	}

}
