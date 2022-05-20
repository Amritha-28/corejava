/*prgm to convert grade to marks*/
package programs;

import java.util.Scanner;

public class GradeToMarks {

	public static void main(String[] args) {
		char grade;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your grade");
		grade=sc.next().charAt(0);
		if(grade=='A' || grade== 'a')
		{
			System.out.println("Your mark is between 90 to 100");
		}
		else if(grade== 'B' || grade=='b')
		{
			System.out.println("Your mark is between 60 to 89");
		}
		else if(grade== 'C' || grade=='c')
		{
			System.out.println("Your mark is between 40 to 59");
		}
		else if(grade== 'D' || grade=='d')
		{
			System.out.println("Your mark is between 0 to 39");
		}
		else
		{
			System.out.println("Invalid input");
			
		}
		sc.close();
	}

}
