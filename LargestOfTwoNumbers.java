//prgm to print largest of numbers
package programs;

import java.util.Scanner;

public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the two numbers");
		num1 = sc.nextInt();
		num2=sc.nextInt();
		if(num1>num2)
		{
			System.out.println(num1 +" is largest");
		}
		else
		{
			System.out.println(num2 +" is largest");
		}
		sc.close();
	}

}
