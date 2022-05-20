//prgm to check vowel or not using switch case
package programs;

import java.util.Scanner;

public class VowelsUsingSwitchCase {

	public static void main(String[] args) {
		char ch;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a letter");
		ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'a' :
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("Entered letter is a vowel");
			break;
		default:
			System.out.println("Entered letter is a consonant");
			
		}
		sc.close();
		

	}

}
