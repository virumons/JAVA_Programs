package sdmcet.cse.oop;

import java.util.Scanner;

class TemperatureTooHighException extends Exception {
	public String toString() {
		return " temperature is above 60 degrees ";
	}
}

class TemperaturetooLowException extends Exception {
	public String toString() {
		return "temperature is below 60 degrees ";
	}
}

public class XyzChemicalsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("enter temperature");
		int temp = sc.nextInt();

		try {
			if (temp < 0)
				throw new TemperaturetooLowException();
			else if (temp >= 0 && temp <= 60)
				System.out.println("normal temperature");
			else
				throw new TemperatureTooHighException();
		} catch (TemperatureTooHighException tthe) {
			System.out.println(tthe);
		} catch (TemperaturetooLowException ttle) {
			System.out.println(ttle);
		}
	}

}
