package sdmcet.cse.oop;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter op1");
		int op1 = sc.nextInt();

		System.out.println("enter op2");
		int op2 = sc.nextInt();

		System.out.println("enter the choice of oprator");
		char op = (char) sc.nextInt();

		switch (op)

		{
		case 1:
			int res = op1 + op2;
			System.out.println("result:" + res);
			break;
		case 2:
			int res1 = op1 - op2;
			System.out.println("result:" + res1);
			break;
		case 3:
			int res11 = op1 * op2;
			System.out.println("result:" + res11);
			break;
		case 4:
			int res111 = op1 / op2;
			System.out.println("result:" + res111);
			break;
		default:
			System.out.println("not valid input");
			break;

		}

	}

}
