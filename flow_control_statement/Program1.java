package flow_control_statement;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the CP value: ");
		double cp = sc.nextDouble();
		System.out.println("ENter the SP value: ");
		double sp = sc.nextDouble();
		if (sp > cp) {
			System.out.println("There is a Profit");
			double profit = sp - cp;
			double proPer = (profit * 100) / cp;
			System.out.println("The Profit% is: " + proPer + "%");
		} else if (cp > sp) {
			System.out.println("There is a Loss");
			double loss = cp - sp;
			double lossPer = (loss * 100) / cp;
			System.out.println("The Loss% is: " + lossPer + "%");
		} else {
			System.out.println("There is no profit or no loss in the transaction");
		}

	}

}
