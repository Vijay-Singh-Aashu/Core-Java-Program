package return_statement;

public class Program9 {
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		test();
		System.out.println("main method ends");
	}
	public static void test()
	{
		
		System.out.println("This is test method");
		test();
	}
}
