//prgm to calculate areas using switch case
package programs;

import java.util.Scanner;

public class AreasUsingSwitchCase {

	public static void main(String[] args) {
		String shape;
		float area;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------MENU------------");
		System.out.println("rect for Rectangle");
		System.out.println("cir for Circle");
		System.out.println("tri for triangle");
		System.out.println("sq for Square");
		System.out.println("Enter a shape name");
		shape= sc.next();
		do {
		switch(shape)
		{
		case "rect" :
			float len,bre;
			System.out.println("Enter length and breadth");
			len=sc.nextFloat();
			bre=sc.nextFloat();
			area=len*bre;
			System.out.println("Area of rectangle= "+area);
			break;
		
		case "cir" :
			float rad;
			System.out.println("Enter radius");
			rad=sc.nextFloat();
			area=3.14f*rad*rad;
			System.out.println("Area of circle= "+area);
			break;
		case "tri" :
			float base, h;
			System.out.println("Enter base and height");
			base=sc.nextFloat();
			h=sc.nextFloat();
			area=0.5f*base*h;
			System.out.println("Area of triangle= "+area);
			break;
		case "sq" :
			float side;
			System.out.println("Enter side");
			side= sc.nextFloat();
			area=side*side;
			System.out.println("Area of square= "+area);
			break;
		default:
			System.out.println("invalid input");
		}
		System.out.println("Do you want to continue y/n");
		ch=sc.next().charAt(0);
		}while(ch!='n');
		System.out.println("Program is terminated");
		sc.close();

	}

}
