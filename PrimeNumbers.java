package forloopprograms;

//import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		int i,c;
		c=0;
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a number");
		//num=sc.nextInt();
		for(i=1; i<=100; i++)
		{
			c=0;
		for(int j=1; j<=i; j++)
		{
			if(i%j==0)
				c++;
		}
		if(c==2)
			System.out.println(i);
		
		}
		
		//sc.close();
		

	}

}
