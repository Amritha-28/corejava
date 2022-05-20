package forloopprograms;

import java.util.Scanner;

public class SquareSeries {

	public static void main(String[] args) {
		int a,i;
		float sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		a=sc.nextInt();
		a=a*a;
		for(i=1; i<=10; i++)
		{
			sum= sum+(float)(a/i);
			System.out.print(sum +"  ");
		}
		System.out.println();
		System.out.println(sum);
		sc.close();
		

	}

}
