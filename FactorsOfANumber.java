//prgm to print the factors of a number
package whileLoopprograms;

import java.util.Scanner;

public class FactorsOfANumber {

	public static void main(String[] args) {
		int num,i;
		i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(i<=num)
		{
			if(num%i == 0)
			{
				System.out.print(i+"   ");
			}
			i++;
		}
		sc.close();
	}
}
