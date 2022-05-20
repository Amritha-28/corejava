package forloopprograms;

import java.util.Scanner;

public class StarPatternPrinting {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		int c=1;
		for(i=1; i<=num; i++)
		{
			for(j=1; j<=i; j++)
			{
				System.out.print(c +"  ");
				c++;
			}
			System.out.println();
			
		}
		
		
		for(i=1; i<=num; i++)
		{
			for(j=1; j<=num-i+1; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		
		
		
		
		for(i=1; i<=num; i++)
		{
			for(j=1; j<=num; j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}
		sc.close();

	}

}
