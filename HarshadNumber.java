//prgm for harshad number
package whileLoopprograms;

import java.util.Scanner;

public class HarshadNumber {

	public static void main(String[] args) {
		int num, digit,sum,num1;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		num1=num;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		if(num1%sum == 0)
		{
			System.out.println(num1 +" is a harshad number");
		}
		else
		{
			System.out.println(num1 +" is not a harshad number");
		}
		sc.close();
	}

}
