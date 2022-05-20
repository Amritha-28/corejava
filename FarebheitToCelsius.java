//prgm to convert faren to celsius
package programs;

import java.util.Scanner;

public class FarebheitToCelsius {

	public static void main(String[] args) {
		double cel , faren;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in farenheit");
		faren=sc.nextDouble();
		cel=(faren-32)*5/9;
		System.out.println("Temperature= "+cel +"C");
		sc.close();

	}

}
