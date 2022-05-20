//prgm to check the given number is palindrome or not
package whileLoopprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int num,rev,digit,num1;
		rev=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		num1=num;
		while(num>0)
		{
			digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		if(num1== rev)
		{
			System.out.println("Entered number is palindrome");
		}
		else
		{
			System.out.println("Entered number is not a palindrome");
		}
		sc.close();
		

	}

}
