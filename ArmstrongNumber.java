//Armstrong number
package whileLoopprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num,num1,digit,sum;
			int pow;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		num1=num;
		while(num>0)
		{
			digit=num%10;
			pow=(int) Math.pow(digit, 3); //digit*digit*digit
			sum=sum+pow;
			num=num/10;
		}
		System.out.println("Sum= "+sum);
		if(num1 == sum)
		{
			System.out.println("Given number "+num1+" is armstrong number");
		}
		else
		{
			System.out.println("Given number "+num1+" is not armstrong number");
		}
		sc.close();

	}

}
