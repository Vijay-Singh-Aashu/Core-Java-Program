package non_static_block;

public class Program3 {
	{
		System.out.println("This is non-static block-1");
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
		Program3 p1 = new Program3();
		System.out.println("===================");
		Program3 p2 = new Program3();
		System.out.println("===================");
		Program3 p3 = new Program3();
		System.out.println("===================");
	}

	{
		System.out.println("This is non-static block-2");

	}
}
