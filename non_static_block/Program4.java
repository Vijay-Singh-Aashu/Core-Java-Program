package non_static_block;

public class Program4 {
	
	{
		System.out.println("This is non-static block-1");
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
		Program4 p1 = new Program4();
		System.out.println("===================");
		Program4 p2 = new Program4();

	}

	{
		System.out.println("This is non-static block-2");
		Program4 p = new Program4();
	}
}
