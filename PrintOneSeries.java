package forloopprograms;

import java.util.Scanner;

public class PrintOneSeries {

	public static void main(String[] args) {
		int num,i,sum;
		sum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter a number");
		num=sc.nextInt();
		for(i=0; i<num; i++)
		{
			//sum=sum*10+1;    //both logics are correct 1st is simple and 2nd is math operation
			sum=(int) (sum+Math.pow(10, i));
			System.out.print(sum +"   ");
		}
		sc.close();
		

	}

}
