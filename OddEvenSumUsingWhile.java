package whileLoopprograms;

public class OddEvenSumUsingWhile {

	public static void main(String[] args) {
		int i,j, sum, add;
		i=1;
		sum=0;
		while(i<=100)
		{
			sum=sum+i;
			i=i+2;
		}
		j=2;
		add=0;
		while(j<=100)
		{
			add=add+j;
			j=j+2;
		}
		System.out.println("Sum="+sum);
		System.out.println("Add="+add);

	}

}
