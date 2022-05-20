package forloopprograms;

import java.util.Scanner;

public class SquareAndDivideSeries {

	public static void main(String[] args) {
		int num,sum,i;
		sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		for(i=1; i<=10; i++)
		{
			sum=(int) (sum+((Math.pow(num, i))/i));
			
		}
		System.out.println(sum);
		sc.close();
	}

}
