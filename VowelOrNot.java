//prgm to check the entered character is vowel or not
package programs;

import java.util.Scanner;

public class VowelOrNot {

	public static void main(String[] args) {
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		ch=sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U')
		{
			System.out.println(ch +" is vowel");
		}
		else
		{
			System.out.println(ch +" is consonant");
		}
		sc.close();

	}

}
