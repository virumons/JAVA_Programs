package sdmcet.cse.oop;

class SimpleCalculator {
	private int a;
	private int b; // instance variables

	SimpleCalculator(int i, int j) { // parametrized constructor//
		this.a = i;
		this.b = j;

	}

	// methods of instances
	int addition() {
		return a + b;
	}

	int subtraction() {
		return a - b;

	}

	int multiplication() {
		return a * b;
	}

	int division() {
		return a / b;
	}
}

public class SimpleCalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SimpleCalculator sc = new SimpleCalculator(10, 20);

		System.out.println("addition: " + sc.addition());
		System.out.println("subtraction: " + sc.subtraction());
		System.out.println("multiplication: " + sc.multiplication());
		System.out.println("division: " + sc.division());

		SimpleCalculator sc1 = new SimpleCalculator(50, 10);

		System.out.println("addition: " + sc1.addition());
		System.out.println("subtraction: " + sc1.subtraction());
		System.out.println("multiplication: " + sc1.multiplication());
		System.out.println("division: " + sc1.division());

	}

}
