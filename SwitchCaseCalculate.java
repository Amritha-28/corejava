//prgm to calculate arithmetic operations using switch case 
package programs;

import java.util.Scanner;

public class SwitchCaseCalculate {

	public static void main(String[] args) {
		char symbol;
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter a symbol");
		symbol= sc.next().charAt(0);
		switch(symbol)
		{
		case '+' :
		{
			System.out.println("Addition= "+(a+b));
			break;
		}
		case '-' :
		{
			System.out.println("Subtraction= "+(a-b));
			break;
		}
		case '*' :
		{
			System.out.println("Multiplication= "+a*b);
			break;
		}
		case '/' :
		{
			System.out.println("Division= "+(a/b));
			break;
		}
		default:
		{
			System.out.println("Invalid input");
		}
		}
		sc.close();
		
		

	}

}
