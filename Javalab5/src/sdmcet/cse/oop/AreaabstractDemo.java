package sdmcet.cse.oop;
abstract class shapes {
	protected double a;
	protected double b;

abstract double area();
}
	class triangles extends shapes {
		triangles(double a, double b) {
			this.a = a;
			this.b = b;
		}

		double area() {
			double area = 0.5 * a * b;
			return area;
		}

	}

	class squares extends shapes {
		squares(double a) {
			this.a = a;
		}

		double area() {
			double area = a * a;
			return area;
		}
	}

	class rectangles extends shapes {
		rectangles(double a, double b) {
			this.a = a;
			this.b = b;
		}

		double area() {
			double area = a * b;
			return area;
		}
	}

public class AreaabstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangles t1=new triangles(5,10);
		squares s1=new squares(4);
		rectangles r1=new rectangles(4,5);

		System.out.println("area of triangle: " +t1.area());
		System.out.println("area of square: " +s1.area());
		System.out.println("area of rectangle: " +r1.area());
	}

}
