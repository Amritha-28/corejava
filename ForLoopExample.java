package forloopprograms;

public class ForLoopExample {

	public static void main(String[] args) {
		int i,j;
		for(i=1; i<=10; i++)       //increment
		{
			System.out.println(i);
		}
		for(i=10; i>=1; i--)        //decrement
		{
			System.out.println(i);
		}
		for(i=1, j=1; i<=10; i++, j++)   //initialization and updation can be more than one.But condition should be only one
		{
			System.out.println("j="+j);
		}
		/*for(;;)     //infinite for loop
		{
			System.out.println("hello");
		}*/
		while(true)  //infinite while loop
		{
			System.out.println("hi");
		}
		
	}

}
