package return_statement;

public class Program2 {
	public static void main(String[] args)
	{
		int p=test();
		System.out.println(p);
		int q=demo();
		System.out.println(q);
		System.out.println("Sum is: "+(p+q));
		
	}
	public static int test()
	{
		
		System.out.println("This is test method");
		return 12;
	}
	public static int demo()
	{
		
		System.out.println("This is demo method");
		return 50;
	}
}
