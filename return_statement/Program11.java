package return_statement;

public class Program11 {
	public static void main(String[] args)
	{
		System.out.println("The sum is: "+sum(23, 45));
		System.out.println("The sum is: "+sum(sum(30, 40), 45));
		System.out.println("The sum is: "+sum(sum(30, sum(60, 40)), 45));
		System.out.println("The sum is: "+sum(sum(30, sum(60, 40)), sum(60, 20)));
	}
	public static int sum(int a, int b)
	{
		int c=a+b;
		return c;	
	}
}
