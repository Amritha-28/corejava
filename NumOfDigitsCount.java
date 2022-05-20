//prgm to count the numbers of digits in a number using while loop
package whileLoopprograms;

import java.util.Scanner;

public class NumOfDigitsCount {
	public static void main(String[] args) {
		int num,count;
		count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		while(num>0)
		{
			count=count+1;
			num=num/10;
		}
		System.out.println("Number of digits= "+count);
		sc.close();
	}

}
