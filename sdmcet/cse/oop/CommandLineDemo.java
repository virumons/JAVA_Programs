package sdmcet.cse.oop;

public class CommandLineDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		// square root
		double sqrt = Math.sqrt(a);

		System.out.println("square root of " + a + " is:" + sqrt);

		double cuberoot=Math.cbrt(a);
		System.out.println("cube root of " + a + " is:" + sqrt);

		// x^y

		double power = Math.pow(a, b);
		System.out.println(a + "power" + b + "is : " + power);

		// trigonometric functions
		double sin = Math.sin(a);
		double cos = Math.cos(a);
		double tan = Math.tan(a);

		System.out.println("sine of " + a + " is:" + sin);
		System.out.println("cos of " + a + " is:" + cos);
		System.out.println("tan of " + a + " is:" + tan);

	}

}
