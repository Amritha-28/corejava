package info;

import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		String name;
		char gen;
		int age;
		float sal;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.nextLine();
		System.out.println("Enter age");
		age= sc.nextInt();
		System.out.println("Enter salary");
		sal= sc.nextFloat();
		System.out.println("Enter gender F/M");
		gen = sc.next().charAt(0);
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+sal);
		System.out.println("Gender: "+gen);
		
		

	}

}
