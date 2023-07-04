package non_static_block;

public class Program1 {

	{
		System.out.println("This is non-static block-1");
	}

	public static void main(String[] args) {
		System.out.println("This is main Method");
	}

	{
		System.out.println("This is non-static block-2");
	}
}
