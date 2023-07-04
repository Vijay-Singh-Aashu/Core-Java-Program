package return_statement;

public class Program8 {
	public static void main(String[] args)
	{
		
		System.out.println("Factorial is: "+print(10));	
	}
	public static int print(int n)
	{
		if(n>1)
		{
			return n*print(n-1);
		}
		else {
			return 1;
		}
	}
}
