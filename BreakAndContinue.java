package forloopprograms;

public class BreakAndContinue
{

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++) 
		{
			if(i==5) 
			{
				//break;   //----->break the loop and come out of the loop
				continue;  //----->skip the loop and do other conditions
			}
			else 
			{
			System.out.println(i);
			}
		}
		
		System.out.println("out side for loop");

	}
}
