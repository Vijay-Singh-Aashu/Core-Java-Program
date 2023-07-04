package polymorphism;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator.sum(12, 34.6);
		
		Calculator.sum(12, 45, 48);
		
		Calculator c1=new Calculator();
		
		Calculator c2=new Calculator(34);
	}
}
