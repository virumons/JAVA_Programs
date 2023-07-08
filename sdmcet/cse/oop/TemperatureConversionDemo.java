package sdmcet.cse.oop;

import java.util.Scanner;

public class TemperatureConversionDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("value in celsius");
		double a = sc.nextDouble();

		double f = 9.0 / 5 * a+ 32;
		System.out.println("the value in farenheit is:" + f);

		System.out.println("value in farenheit");
		double b = sc.nextDouble();

		double c = 5.0 / 9 * (b - 32);
		System.out.println("the value in celsius is:" + c);

	}

}
