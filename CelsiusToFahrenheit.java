//prgm to convert celsius to fahrenheit
package programs;

import java.util.Scanner;

public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		double cel , faren;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in celsius");
		cel=sc.nextDouble();
		faren=(cel*1.8)+32;
		System.out.println("Temperature= "+faren +"F");
		sc.close();

	}

}
