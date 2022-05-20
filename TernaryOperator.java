//prgm to find largest of two numbers using ternary operator
package programs;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, large;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		large= (num1>num2)?num1:num2;
		System.out.println("Largest of "+num1+" and "+num2+" is " +large);
		sc.close();

	}

}
