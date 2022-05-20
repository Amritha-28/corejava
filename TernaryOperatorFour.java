//prgm to find largest of  4 numbers using tertary operator
package programs;

import java.util.Scanner;

public class TernaryOperatorFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, num3, num4, large;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the four numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		num4=sc.nextInt();
		large= (num1>num2 && num1>num3 && num1>num4)?num1 : (num2>num1 && num2>num3 && num2>num4)?num2 : (num3>num1 && num3>num2 && num3>num4)?num3 : num4;
		System.out.println("Largest of "+num1+" , "+num2+", "+num3+" and "+num4+" is "+large);
		sc.close();
		

	}

}
