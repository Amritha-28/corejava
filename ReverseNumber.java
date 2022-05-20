//prgm to reverse a number
package whileLoopprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int digit,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		/*while(num>0)
		{
			digit=num%10;
			System.out.print(digit);
			num=num/10;
		}
		*/
		 //another logic:
		 int rev=0;
		 while(num>0)
		 {
		 digit=num%10;
		 rev=rev*10+digit;
		 num=num/10;
		 }
		 System.out.println("Answer= "+rev);
		 sc.close();
		
	}

}
