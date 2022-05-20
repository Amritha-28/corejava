//Prgm to print the fibonacci series 
package forloopprograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		int i,terms,fibo,lt1,lt2;
		lt1=1;
		lt2=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of terms");
		terms=sc.nextInt();
		System.out.println("Fibonacci Series");
		System.out.print(lt1 +"  ");
		System.out.print(lt2 +"  ");
		for(i=1; i<=terms-2; i++)
		{
			fibo=lt1+lt2;
			System.out.print(fibo +"  ");
			lt1=lt2;
			lt2=fibo;
			
		}
		sc.close();
		

	}

}
