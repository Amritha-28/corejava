package whileLoopprograms;

import java.util.Scanner;

public class NaturalNoSumWhile {

	public static void main(String[] args) {
		int i, sum, osum,esum,n;
		Scanner sc= new Scanner(System.in);
		i=1;
		sum=0;
		osum=0;
		esum=0;
		System.out.println("enter n");
		n= sc.nextInt();
		while(i<=n)
		{
			sum=sum+i;
			if(i%2==0)
			{
				esum=esum+i;
			}
			else
			{
				osum=osum+i;
			}
			i++;
		}
		System.out.println("Sum of n natural numbers= "+sum);
		System.out.println("Sum of n even numbers= "+esum);
		System.out.println("Sum of n odd numbers= "+osum);
		sc.close();
	}

}
