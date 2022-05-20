//prgm for bank application
package programs;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		float amt, damt, wamt;
		int choice;
		amt=5000f;
		Scanner sc= new Scanner(System.in);
		System.out.println("---------MENU--------");
		System.out.println("1.Deposit   2.Withdrawal");
		choice= sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter the amount to deposit");
			damt=sc.nextFloat();
			amt=amt+damt;
			System.out.println("Account balance after deposit= Rs."+amt);
			break;
		case 2:
			System.out.println("Enter the amount to withdraw");
			wamt= sc.nextFloat();
			if(wamt>amt)
			{
				System.out.println("Insufficient balance");
			}
			else
			{
				amt=amt-wamt;
				System.out.println("Account balance after withdraw= Rs."+amt);
			}
		}
		sc.close();

	}

}
