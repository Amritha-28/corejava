//prgm to find the sum of individual digits
package whileLoopprograms;

import java.util.Scanner;

public class AddIndividualDigit {

	public static void main(String[] args) {
		int digit,num,sum;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("Sum of the digits= "+sum);
		sc.close();
	}


	}


